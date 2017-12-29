package com.curtesmalteser.kitsuexplorer.activity;

import com.curtesmalteser.kitsuexplorer.api.KitsuAPI;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Data;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.ModelAnime;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * Created by "Curtes Malteser" on 23/12/2017.
 */

public class AnimeRepository implements Repository{

    private KitsuAPI kitsuAPI;
    private List<Data> dataList;

    private long timestamp;

    private static final long STALE_MS = 20 * 1000; // Data is stale after 20 seconds

    public AnimeRepository(KitsuAPI kitsuAPI) {
        this.kitsuAPI = kitsuAPI;
        this.timestamp = System.currentTimeMillis();
        dataList = new ArrayList<>();
    }

    private boolean isUpToDate() {
        return System.currentTimeMillis() - timestamp < STALE_MS;
    }

    @Override
    public Observable<Data> getDataFromMemory() {

        if (isUpToDate()) {
            return Observable.fromIterable(dataList);
        } else {
            timestamp = System.currentTimeMillis();
            dataList.clear();
            return Observable.empty();
        }
    }

    @Override
    public Observable<Data> getDataFromNetwork() {

        return kitsuAPI.getAnimeObservable().concatMap(new Function<ModelAnime, Observable<Data>>() {
            @Override
            public Observable<Data> apply(ModelAnime modelAnime) throws Exception {
                return Observable.fromIterable(modelAnime.getData());
            }
        }).doOnNext(new Consumer<Data>() {
            @Override
            public void accept(Data data) throws Exception {
                dataList.add(data);
            }
        });
    }

      @Override
    public Observable<Data> getResultData() {
          return getDataFromMemory().switchIfEmpty(getDataFromNetwork());
    }
}

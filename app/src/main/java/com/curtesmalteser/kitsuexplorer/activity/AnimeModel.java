package com.curtesmalteser.kitsuexplorer.activity;

import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Data;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by anton on 23/12/2017.
 */

public class AnimeModel implements AnimeMVP.Model {

    private Repository repository;

    public AnimeModel(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<AnimeViewModel> result() {
        return repository.getResultData().map(new Function<Data,  AnimeViewModel>() {
            @Override
            public AnimeViewModel apply(Data data) throws Exception {
                return new AnimeViewModel(data.getAttributes().getTitles().getEnJp(),
                        data.getAttributes().getAverageRating(),
                        data.getAttributes().getPosterImage().getTiny());
            }
        });
    }
}

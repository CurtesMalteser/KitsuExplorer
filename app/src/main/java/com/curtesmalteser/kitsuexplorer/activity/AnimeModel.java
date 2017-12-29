package com.curtesmalteser.kitsuexplorer.activity;

import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Data;

import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;

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
        return Observable.zip(repository.getResultData(), repository.getResultData(),new BiFunction<Data, Data, AnimeViewModel>() {
                    @Override
                    public AnimeViewModel apply(Data title, Data rating) throws Exception {
                        return new AnimeViewModel(title.getAttributes().getTitles().getEnJp(),
                                rating.getAttributes().getAverageRating(),
                                title.getAttributes().getPosterImage().getTiny());
                    }
                });

    }
}

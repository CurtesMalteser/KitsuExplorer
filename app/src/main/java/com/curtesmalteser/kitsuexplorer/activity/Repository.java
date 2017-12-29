package com.curtesmalteser.kitsuexplorer.activity;

import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Data;

import io.reactivex.Observable;

/**
 * Created by "Curtes Malteser" on 23/12/2017.
 */

public interface Repository {
    Observable<Data> getDataFromMemory();
    Observable<Data> getDataFromNetwork();

    Observable<Data> getResultData();
}

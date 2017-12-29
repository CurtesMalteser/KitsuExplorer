package com.curtesmalteser.kitsuexplorer.api;

import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.ModelAnime;
import com.curtesmalteser.kitsuexplorer.api.api_model.model_manga.ModelManga;

import retrofit2.http.GET;
import io.reactivex.Observable;

/**
 * Created by "Curtes Malteser" on 19/12/2017.
 */

public interface KitsuAPI {

    @GET("manga?page%5Blimit%5D=20")
    Observable<ModelManga> getMangaObservable();

    @GET("anime?page%5Blimit%5D=20")
    Observable<ModelAnime> getAnimeObservable();

}

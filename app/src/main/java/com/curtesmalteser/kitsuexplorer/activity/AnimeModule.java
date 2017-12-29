package com.curtesmalteser.kitsuexplorer.activity;

import com.curtesmalteser.kitsuexplorer.api.KitsuAPI;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by "Curtes Malteser" on 23/12/2017.
 */

@Module
public class AnimeModule {
    @Provides
    public AnimeMVP.Presenter provideAnimePresenter(AnimeMVP.Model animeModel){
        return new AnimePresenter(animeModel);
    }

    @Provides
    public AnimeMVP.Model provideAnimeModel (Repository repository) {
        return new AnimeModel(repository);
    }

    @Singleton
    @Provides
    public Repository provideRepository(KitsuAPI kitsuAPI) {
        return new AnimeRepository(kitsuAPI);
    }
}

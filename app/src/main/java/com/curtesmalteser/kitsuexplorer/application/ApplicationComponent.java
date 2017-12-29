package com.curtesmalteser.kitsuexplorer.application;

import com.curtesmalteser.kitsuexplorer.activity.AnimeModule;
import com.curtesmalteser.kitsuexplorer.activity.MainActivity;
import com.curtesmalteser.kitsuexplorer.api.KitsuModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by "Curtes Malteser" on 19/12/2017.
 */
@Singleton
@Component(modules = {ApplicationModule.class, KitsuModule.class, AnimeModule.class})
public interface ApplicationComponent {

    void inject(MainActivity target);
}

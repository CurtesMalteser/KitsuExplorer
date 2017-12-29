package com.curtesmalteser.kitsuexplorer.application;

import android.app.Application;

import com.curtesmalteser.kitsuexplorer.api.KitsuModule;

/**
 * Created by "Curtes Malteser" on 19/12/2017.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .kitsuModule(new KitsuModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}

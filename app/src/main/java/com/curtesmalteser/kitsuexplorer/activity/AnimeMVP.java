package com.curtesmalteser.kitsuexplorer.activity;

import io.reactivex.Observable;

/**
 * Created by anton on 23/12/2017.
 */

public interface AnimeMVP {

    interface Model {
        Observable<AnimeViewModel> result();
    }

    interface View {
        void updateData(AnimeViewModel animeViewModel);
        void showSnackbar(String msg);
    }

    interface Presenter {
        void loadData();
        void rxUnsubscribe();
        void setView(AnimeMVP.View view);
    }
}

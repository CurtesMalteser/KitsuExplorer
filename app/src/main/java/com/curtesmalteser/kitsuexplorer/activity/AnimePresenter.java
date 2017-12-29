package com.curtesmalteser.kitsuexplorer.activity;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by "Curtes Malteser" on 23/12/2017.
 */

public class AnimePresenter implements AnimeMVP.Presenter{

    private AnimeMVP.View view;
    private DisposableObserver disposable = null;
    private AnimeMVP.Model model;

    public AnimePresenter(AnimeMVP.Model model) {
        this.model = model;
    }

    @Override
    public void loadData() {

        disposable = model.result()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<AnimeViewModel>() {

                    @Override
                    public void onNext(AnimeViewModel animeViewModel) {
                        if (view != null) {
                            view.updateData(animeViewModel);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (view != null) {
                            view.showSnackbar("Error getting animes");
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public void rxUnsubscribe() {
        if (disposable != null) {
            if (!disposable.isDisposed()) {
                disposable.dispose();
            }
        }
    }

    @Override
    public void setView(AnimeMVP.View view) {
        this.view = view;
    }
}

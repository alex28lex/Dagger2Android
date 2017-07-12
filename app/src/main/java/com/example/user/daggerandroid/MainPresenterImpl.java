package com.example.user.daggerandroid;

import android.util.Log;

/**
 * Developed by Magora Team (magora-systems.com). 2017.
 *
 * @author mihaylov
 */
public class MainPresenterImpl implements MainPresenter {
    MainView mainView;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void doSomething() {
        Log.v("presenter", "doSomething");
        mainView.doNothing();
    }
}

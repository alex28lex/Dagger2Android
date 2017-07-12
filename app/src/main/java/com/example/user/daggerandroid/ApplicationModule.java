package com.example.user.daggerandroid;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by User on 12.07.2017.
 */

@Module
public abstract class ApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeAcitivityInjector();

    @Provides
    static MainPresenter providePresenter() {
        return new MainPresenter();
    }

}

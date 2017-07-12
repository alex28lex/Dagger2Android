package com.example.user.daggerandroid.dagger;

import android.app.Application;
import android.content.Context;

import com.example.user.daggerandroid.MainActivity;
import com.example.user.daggerandroid.MainActivityComponent;
import com.example.user.daggerandroid.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by User on 12.07.2017.
 */

@Module(subcomponents = MainActivityComponent.class)
public class ApplicationModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

}

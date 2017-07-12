package com.example.user.daggerandroid.dagger;

import android.app.Application;

import com.example.user.daggerandroid.MyApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by User on 12.07.2017.
 */

@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class, ActivityBuilderModule.class})
public interface ApplicationComponent extends AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        ApplicationComponent build();
    }

    void inject(MyApplication app);
}

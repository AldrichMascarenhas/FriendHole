package com.nerdcutlet.friendhole.di;

import android.app.Application
import com.nerdcutlet.friendhole.FriendHoleApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = arrayOf(AndroidInjectionModule::class,
                AndroidSupportInjectionModule::class,
                AppModule::class,
                ActivityBuilder::class,
                FragmentBuilder::class)
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: FriendHoleApplication)

}

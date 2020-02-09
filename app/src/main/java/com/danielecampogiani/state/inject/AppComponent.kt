package com.danielecampogiani.state.inject

import com.danielecampogiani.state.main.view.MainFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ViewModelBuilder::class,
        MainModule::class
    ]
)
interface AppComponent {

    fun inject(mainFragment: MainFragment)
}
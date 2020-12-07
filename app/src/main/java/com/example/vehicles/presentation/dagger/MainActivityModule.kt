package com.example.vehicles.presentation.dagger

import com.example.vehicles.interactor.GetVehiclesInteractor
import com.example.vehicles.presentation.MainActivity
import com.example.vehicles.presentation.MainActivityContract
import com.example.vehicles.presentation.MainActivityPresenter
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
object MainActivityModule {

    @Provides
    fun providesPresenter(
        view: MainActivityContract.View,
        getVehiclesInteractor: GetVehiclesInteractor
    ): MainActivityContract.Presenter = MainActivityPresenter(view, getVehiclesInteractor)
}

@Module
interface ActivityBindingModule {
    @Binds
    fun bindActvity(activity: MainActivity): MainActivityContract.View
}
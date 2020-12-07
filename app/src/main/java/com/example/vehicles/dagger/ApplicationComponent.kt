package com.example.vehicles.dagger

import com.example.vehicles.data.dagger.DataModule
import com.example.vehicles.framework.dagger.NetworkModule
import com.example.vehicles.presentation.dagger.MainActivityComponent
import dagger.Component

@Component(modules = [NetworkModule::class, DataModule::class, AppSubcomponentModule::class])
interface ApplicationComponent {
    fun mainActivityComponent() : MainActivityComponent.Factory
}
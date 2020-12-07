package com.example.vehicles.dagger

import com.example.vehicles.data.dagger.DataModule
import com.example.vehicles.framework.dagger.NetworkModule
import dagger.Component

@Component(modules = [NetworkModule::class, DataModule::class])
interface ApplicationComponent {
}
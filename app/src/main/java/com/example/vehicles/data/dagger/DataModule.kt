package com.example.vehicles.data.dagger

import com.example.vehicles.data.api.IVehicleClientApi
import com.example.vehicles.data.repository.VehicleRepository
import com.example.vehicles.domain.repository.IVehicleRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DataModule {

    @Singleton
    @Provides
    fun provideRepository(api: IVehicleClientApi): IVehicleRepository = VehicleRepository(api)
}
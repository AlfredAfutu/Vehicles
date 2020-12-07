package com.example.vehicles.framework.dagger

import com.example.vehicles.data.api.IVehicleClientApi
import com.example.vehicles.framework.api.VehicleClientApi
import com.example.vehicles.framework.api.VehicleService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object ApiModule {

    @Provides
    fun provideVehicleService(retrofit: Retrofit): VehicleService =
        retrofit.create(VehicleService::class.java)

    @Provides
    fun provideVehicleClientApi(service: VehicleService): IVehicleClientApi =
        VehicleClientApi(service)
}
package com.example.vehicles.framework.api

import com.example.vehicles.framework.api.model.VehiclesDTO
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface VehicleService {

    @GET("cars.json")
    fun getVehicles(): Observable<VehiclesDTO>
}
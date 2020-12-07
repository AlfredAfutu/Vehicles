package com.example.vehicles.data.repository

import com.example.vehicles.data.api.IVehicleClientApi
import com.example.vehicles.domain.model.VehicleData
import com.example.vehicles.domain.repository.IVehicleRepository

class VehicleRepository(private val api: IVehicleClientApi) : IVehicleRepository {

    override fun getVehicles(): VehicleData {
        vehicleCache = api.getVehicles()
        return vehicleCache
    }

    override var vehicleCache: VehicleData = VehicleData.Success(emptyList())
}
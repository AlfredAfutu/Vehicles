package com.example.vehicles.data.repository

import com.example.vehicles.data.api.IVehicleClientApi
import com.example.vehicles.domain.model.VehicleData
import com.example.vehicles.domain.repository.IVehicleRepository

class VehicleRepository(private val api: IVehicleClientApi) : IVehicleRepository {

    override fun getVehicles(): VehicleData {
        return if (vehicleCache != null) {
             vehicleCache!!
        } else {
            vehicleCache = api.getVehicles()
            vehicleCache!!
        }
    }

    private var vehicleCache: VehicleData? = null
}
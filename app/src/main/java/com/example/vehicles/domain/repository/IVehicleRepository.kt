package com.example.vehicles.domain.repository

import com.example.vehicles.domain.model.VehicleData

interface IVehicleRepository {
    fun getVehicles(): VehicleData
    var vehicleCache: VehicleData
}
package com.example.vehicles.data.api

import com.example.vehicles.domain.model.VehicleData

interface IVehicleClientApi {
    fun getVehicles(): VehicleData
}
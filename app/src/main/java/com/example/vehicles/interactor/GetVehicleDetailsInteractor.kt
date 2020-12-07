package com.example.vehicles.interactor

import com.example.vehicles.domain.model.Vehicle
import com.example.vehicles.domain.model.VehicleData
import com.example.vehicles.domain.repository.IVehicleRepository
import javax.inject.Inject

class GetVehicleDetailsInteractor @Inject constructor(private val repository: IVehicleRepository): Interactor<String, Vehicle?>() {

    override fun invoke(input: String): Vehicle? {
        return (repository.vehicleCache as VehicleData.Success).vehicles.find { it.id == input }
    }
}
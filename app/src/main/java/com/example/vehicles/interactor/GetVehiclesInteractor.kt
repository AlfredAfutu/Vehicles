package com.example.vehicles.interactor

import com.example.vehicles.data.repository.VehicleRepository
import com.example.vehicles.domain.model.VehicleData
import javax.inject.Inject

class GetVehiclesInteractor @Inject constructor(private val repository: VehicleRepository) :
    Interactor<Unit, VehicleData>() {
    override fun invoke(input: Unit): VehicleData = repository.getVehicles()
}
package com.example.vehicles.framework.api

import com.example.vehicles.data.api.IVehicleClientApi
import com.example.vehicles.domain.model.VehicleData
import com.example.vehicles.framework.api.ApiConstants.ERROR_MESSAGE
import com.example.vehicles.framework.api.mapper.VehiclesDTOToDomainModelMapper
import io.reactivex.rxjava3.schedulers.Schedulers

class VehicleClientApi(private val service: VehicleService) : IVehicleClientApi {

    override fun getVehicles(): VehicleData {
        return service.getVehicles()
            .map { VehiclesDTOToDomainModelMapper.map(it) }
            .onErrorReturnItem(VehicleData.Error(ERROR_MESSAGE))
            .subscribeOn(Schedulers.io())
            .blockingFirst()
    }
}
package com.example.vehicles.framework.api.mapper

import com.example.vehicles.domain.model.Vehicle
import com.example.vehicles.domain.model.VehicleData
import com.example.vehicles.framework.api.model.Make
import com.example.vehicles.framework.api.model.VehiclesDTO

object VehiclesDTOToDomainModelMapper {

    fun map(vehiclesDTO: VehiclesDTO): VehicleData {
        return VehicleData.Success(
            vehiclesDTO.vehicles?.map {
                Vehicle(
                    it.id,
                    it.imageUrl,
                    mapMake(it.make),
                    it.mileage ?: 0,
                    it.name ?: "",
                    it.price ?: 0,
                    it.year ?: 0
                )
            } ?: emptyList()
        )
    }

    private fun mapMake(dtoMake: Make?): com.example.vehicles.domain.model.Make {
        return com.example.vehicles.domain.model.Make(dtoMake?.key, dtoMake?.label ?: "")
    }
}
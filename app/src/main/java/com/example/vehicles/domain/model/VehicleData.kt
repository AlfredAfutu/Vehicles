package com.example.vehicles.domain.model

sealed class VehicleData {
    data class Success(val vehicles: List<Vehicle>) : VehicleData()
    data class Error(val message: String): VehicleData()
}

data class Vehicle(
    val id: String?,
    val imageUrl: String?,
    val make: Make?,
    val mileage: Int = 0,
    val name: String = "",
    val price: Int = 0,
    val year: Int = 0
)

data class Make(
    val key: String?,
    val label: String = ""
)





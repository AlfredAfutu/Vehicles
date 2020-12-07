package com.example.vehicles.framework.api.model
import com.google.gson.annotations.SerializedName


data class VehiclesDTO(
    @SerializedName("data")
    val vehicles: List<Vehicle>? = null,
    @SerializedName("results")
    val results: Int? = null
)

data class Vehicle(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("image_url")
    val imageUrl: String? = null,
    @SerializedName("make")
    val make: Make? = null,
    @SerializedName("mileage")
    val mileage: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("price")
    val price: Int? = null,
    @SerializedName("year")
    val year: Int? = null
)

data class Make(
    @SerializedName("key")
    val key: String? = null,
    @SerializedName("label")
    val label: String? = null
)
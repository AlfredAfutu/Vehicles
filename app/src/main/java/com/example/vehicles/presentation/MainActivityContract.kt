package com.example.vehicles.presentation

import com.example.vehicles.domain.model.Vehicle

interface MainActivityContract {
    interface View {
        fun showVehicles(vehicles: List<Vehicle>)
        fun showError(message: String)
        fun showLoading()
    }
    interface Presenter {
        fun onStart()
        fun onStop()
    }
}
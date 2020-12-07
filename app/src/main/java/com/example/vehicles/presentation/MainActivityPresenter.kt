package com.example.vehicles.presentation

import com.example.vehicles.domain.model.VehicleData
import com.example.vehicles.interactor.GetVehiclesInteractor

class MainActivityPresenter(
    private val view: MainActivityContract.View,
    private val getVehiclesInteractor: GetVehiclesInteractor
) : MainActivityContract.Presenter {

    override fun onStart() {
        view.showLoading()
        when(val vehicleData = getVehiclesInteractor(Unit)) {
            is VehicleData.Success -> view.showVehicles(vehicleData.vehicles)
            is VehicleData.Error -> view.showError(vehicleData.message)
        }
    }

    override fun onStop() {
        TODO("Not yet implemented")
    }

}
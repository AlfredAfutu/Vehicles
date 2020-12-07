package com.example.vehicles.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vehicles.R
import com.example.vehicles.VehiclesApplication
import com.example.vehicles.domain.model.Vehicle
import com.example.vehicles.presentation.dagger.MainActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View {

    lateinit var component: MainActivityComponent

    @Inject
    lateinit var presenter: MainActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        setupInjection()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        presenter.onStart()
    }

    private fun setupInjection() {
        component = (applicationContext as VehiclesApplication)
            .appComponent
            .mainActivityComponent()
            .create()

        component.inject(this)
    }

    override fun showVehicles(vehicles: List<Vehicle>) {
        TODO("Not yet implemented")
    }

    override fun showError(message: String) {
        TODO("Not yet implemented")
    }

    override fun showLoading() {
        TODO("Not yet implemented")
    }
}
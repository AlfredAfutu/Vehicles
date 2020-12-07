package com.example.vehicles

import android.app.Application
import com.example.vehicles.dagger.ApplicationComponent
import com.example.vehicles.dagger.DaggerApplicationComponent

class VehiclesApplication : Application() {

    val appComponent: ApplicationComponent = DaggerApplicationComponent.create()
}
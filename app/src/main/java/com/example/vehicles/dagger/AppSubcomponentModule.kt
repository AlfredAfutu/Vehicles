package com.example.vehicles.dagger

import com.example.vehicles.presentation.dagger.MainActivityComponent
import dagger.Module

@Module(subcomponents = [MainActivityComponent::class])
object AppSubcomponentModule {
}
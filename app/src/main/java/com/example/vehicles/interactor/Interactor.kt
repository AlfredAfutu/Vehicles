package com.example.vehicles.interactor

abstract class Interactor<I, O> {
    abstract operator fun invoke(input: I): O
}
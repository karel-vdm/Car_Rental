package com.karel.carrental.vehicals

interface RentalCar {
    val title: String
    fun calculateRate(daysRented: Int): Double
}


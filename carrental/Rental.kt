package com.karel.carrental

import com.karel.carrental.vehicals.RentalCar

data class Rental(
    val car: RentalCar,
    val daysRented: Int,
)
package com.karel.carrental.vehicals

class SuperCar(
    override val title: String
) : RentalCar {
    private val multiplier: Double = 200.0

    override fun calculateRate(daysRented: Int): Double {
        return daysRented.toDouble() * multiplier
    }

}
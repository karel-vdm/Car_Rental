package com.karel.carrental.vehicals

class MuscleCar(
    override val title: String
) : RentalCar {
    private val baseRate: Double = 200.0
    private val multiplier: Double = 50.0

    override fun calculateRate(daysRented: Int): Double {
        var rate = baseRate
        if (daysRented > 3) {
            rate += (daysRented - 3) * multiplier
        }
        return rate
    }
}
package com.karel.carrental.vehicals

class EconomyCar(
    override val title: String
) : RentalCar {
    private val baseRate: Double = 80.0
    private val multiplier: Double = 30.0

    override fun calculateRate(daysRented: Int): Double {
        var rate = baseRate
        if (daysRented > 2) {
            rate += (daysRented - 2) * multiplier
        }
        return rate
    }
}
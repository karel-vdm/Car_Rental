package com.karel.carrental.statement

import com.karel.carrental.Rental

object RateCalculator {

    fun calculateTotalRate(rentals: ArrayList<Rental>): Double {
        var totalAmount = 0.0
        rentals.forEach { rental ->
            totalAmount += rental.car.calculateRate(rental.daysRented)
        }
        return totalAmount
    }

}
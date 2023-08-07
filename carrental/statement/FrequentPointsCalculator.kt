package com.karel.carrental.statement

import com.karel.carrental.Rental
import com.karel.carrental.vehicals.SuperCar

object FrequentPointsCalculator {

    fun calculateTotalFrequentPoints(rentals: ArrayList<Rental>): Int {
        var frequentRenterPoints = 0
        rentals.forEach { rental ->
            frequentRenterPoints += 1
            // add bonus for a two day new SuperCar rental
            if ((rental.car is SuperCar) && rental.daysRented > 1) {
                frequentRenterPoints += 1
            }
        }
        return frequentRenterPoints
    }

}
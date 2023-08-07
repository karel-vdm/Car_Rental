package com.karel.carrental.statement

import com.karel.carrental.Customer

object Statement {

    fun getStatement(customer: Customer): String {
        val builder = StringBuilder()
        builder.append("Rental Record for ")
        builder.appendLine(customer.name)

        customer.rentals.forEach { rental ->
            val car = rental.car
            val daysRented = rental.daysRented
            val amount = car.calculateRate(daysRented)

            //show figures for this rental
            builder.append("\t")
            builder.append(car.title)
            builder.append("\t")
            builder.appendLine(amount)
        }

        val totalAmount = RateCalculator.calculateTotalRate(customer.rentals)
        val frequentRenterPoints =
            FrequentPointsCalculator.calculateTotalFrequentPoints(customer.rentals)

        //add footer lines
        builder.appendLine("Final rental payment owed $totalAmount")
        builder.append("You received an additional $frequentRenterPoints frequent customer points")
        return builder.toString()
    }

}
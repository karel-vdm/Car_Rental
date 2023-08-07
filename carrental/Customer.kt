package com.karel.carrental

import com.karel.carrental.statement.Statement

class Customer(
    val name: String = String(),
    var rentals: ArrayList<Rental> = ArrayList(),
) {

    fun addRental(arg: Rental) {
        rentals.add(arg)
    }

    fun getStatement(): String {
        return Statement.getStatement(this)
    }

}
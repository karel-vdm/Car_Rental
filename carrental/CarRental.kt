package com.karel.carrental

import com.karel.carrental.vehicals.MuscleCar
import com.karel.carrental.vehicals.SuperCar

val rental1 = Rental(MuscleCar("Mustang"), 5)
val rental2 = Rental(SuperCar("Lambo"), 20)
val customer = Customer("Liviu")

fun main() {
    customer.addRental(rental1)
    customer.addRental(rental2)
    println(customer.getStatement())
}
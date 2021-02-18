package com.ffejer.textadventure

fun main() {
    val locations = readLocationInfo()
    var loc = 64

    while (true) {
        val location = locations[loc] ?: Location(0, "Sg went wrong. :(")
        println(location.)
    }
}
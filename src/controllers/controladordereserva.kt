package controllers

import Entidades.Cliente
import Entidades.Habitacion
import Entidades.Reserva

class controladordereserva() {
    private val reservasList: MutableList<Reserva> = mutableListOf()

    fun registrerRoom(cliente: Cliente, habitacion: Habitacion) {
        println("Ingrese la habitacion que requieres")
        val habitaciones = readln().toString()
        println("Ingrese la fecha de inicio")
        val fechainicio = readln()
        println("Ingrese la fecha de fin")
        val fechadefin = readln()
        println("Ingrese el numero de noches")
        val totaldenoches = readln()

        val addedreserva = Reserva(
            habitacion, cliente, fechainicio, fechadefin, totaldenoches, false
        )
        addedreserva.calculateTotalapagar()
        Cliente.(addedreserva)
        reservasList.add(addedreserva)
    }

    fun showreservas() {
        if (reservasList.isEmpty()) {
            println("No hay habitaciones registradas")
        } else {
            var counter = 1
            for (booking in reservasList) println("$counter" + booking.getReservasData())
            counter++
        }
    }
}


package controllers

import Controladordehabitaciones

class MenuControladores {
    private val printerName = println()
    private val Controladordereserva = controladordereserva()
    private val ControladorDeCliente = ControladorDeCliente()
    private val Controladordehabitaciones = Controladordehabitaciones()

}

fun showMenu() {
    println("Ingrese una opcion")
    println("1- Registrar habitacion")
    println("2- Registrar Cliente")
    println("3- Crear reserva")
    println("4- Mostrar habitaciones")
    println("5- Mostrar Clientes")
    println("6- Mostrar reservas")

    val selecOption = readln().toInt()
    validateOptions(selecOption)
}

private fun validateOptions(selectOption: Int) {
    when (selectOption) {
        1 -> {
            Controladordehabitaciones.registerRoom()
            showMenu()
        }

        2 -> {
            ControladorDeCliente.registerCliente()
            showMenu()
        }

        3 -> {
            SelectHabitacionAndCliente()
            showMenu()
        }

        4 -> {
            Controladordehabitaciones.showHabitacion()
            showMenu()
        }

        5 -> {
            ControladorDeCliente.showClientes()
            showMenu()
        }

        6 -> {
            controladordereserva.showReservas()
            showMenu()
        }
    }
}

private fun selectHabitacionCliente() {

    if (ControladorDeCliente.areNotClienteRegistered()) {
        println("No se encuentran clientes registrados")
        showMenu()
        return
    }
    if (Controladordehabitaciones.areNotHabitacionesRegistered()) {
        println("No se encuentran habitaciones registradas")
        showMenu()
        return
    }
    println("Seleccione su cliente")
    ControladorDeCliente.showCliente()

    val selectClienteIndex = readln().toInt()
    val Cliente = ControladorDeCliente.getClienteByIndex(selectClienteIndex - 1)

    println("Seleccione una habitacion")
    Controladordehabitaciones.showHabitacion()
    val selectHabitacionIndex = readln().toInt()
    val Habitacion = Controladordehabitaciones.getHabitacionByIndex(selectHabitacionIndex - 1)
    controladordereserva.crearReserva(Cliente, Habitacion)
}







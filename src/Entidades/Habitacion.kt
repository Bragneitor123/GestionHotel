package Entidades

class Habitacion(
    val numerodehabitacion: Int,
    val capacidad: Int,
    val preciopornoche: Double,
    val isAvaible: Boolean = true,
    val listadereservas: MutableList<Reserva> = mutableListOf(),
) {
    fun gethabitacionData(): String {
        return "Numero de habitacion $numerodehabitacion" + " precio por noche: $preciopornoche" + " capacidad: $capacidad desponible: ${if (isAvaible) "si" else "no"}"
    }
}
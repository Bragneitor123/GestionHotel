package Entidades

class Reserva(
    val habitacion: Habitacion,
    val fechaInicio: String,
    val fechadeFin: String,
    val iscanceled: Boolean,
    val clientes: Cliente,
    val totaldenoches: Int,
) {
    private var totalapagar: Double = 0.0
    fun calculateTotalapagar() {
        totalapagar = totaldenoches * habitacion.preciopornoche

    }

    fun gettotalapagar(): Double = totalapagar

    fun getReservasData(): String{
        return "Nombre de cliente ${clientes.getCustomerData()}" + "Total de noches: $totaldenoches" +
                "Fecha inicio: $fechaInicio " +
                "Fecha final: $fechadeFin" +
                "Total : $totalapagar"
    }
}

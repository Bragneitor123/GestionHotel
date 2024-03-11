package Entidades


class Cliente(
    private val nombres: String,
    private val primerapellido: String,
    private val segundoapellido: String,
    private val email: String,
    private val numerodetelefono: String,
    private val direccion: String,
    private val RFC: String,
    private val address: String,
    private val bookingList: MutableList<Reserva> = mutableListOf(),
) {

    fun getCustomerData(): String {
        return "Nombre: $nombres $primerapellido $segundoapellido RFC: $RFC Address: $address"
    }

    fun addBooking(booking: Reserva) {
        bookingList.add(booking)
    }

}

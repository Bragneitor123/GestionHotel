import Entidades.Habitacion


class Controladordehabitaciones {
    private val roomsList: MutableList<Habitacion> = mutableListOf()


    fun registerRoom() {
        println("Ingresar el numero de habitacion")
        val numerodehabitacion = readln().toInt()
        println("Ingresar capacidad")
        val capacidad = readln().toInt()
        println("Ingresar precio por noche")
        val preciopornoche = readln().toDouble()
        val isAvaible = true

        val addedhabitacion = Habitacion(
            numerodehabitacion, capacidad, preciopornoche, isAvaible

        )
        roomsList.add(addedhabitacion)
    }

    fun modifyHabitacion(modifiedhabitacion: Habitacion, index: Int) {
        roomsList[index] = modifiedhabitacion
    }

    fun getHabitacionByIndex(index: Int): Habitacion{
        return roomsList[index]
    }
    fun showHabitacion() {
        if(roomsList.isEmpty()){
        println("No se encuentran habitaciones registrada")
    }else{
        var counter= 1
        for (Habitacion in roomsList){
            println("$counter" + Habitacion.gethabitacionData())
            counter++
            }
        }
    }
    fun areNotHabitacionRegistered(): Boolean = roomsList.isEmpty()

}

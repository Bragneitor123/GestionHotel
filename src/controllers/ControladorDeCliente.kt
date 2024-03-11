package controllers

import Entidades.Cliente

class ControladorDeCliente{

    private val clienteList = mutableListOf<Cliente>(
        Cliente(
            "Brisa",
            "Urieta",
            "Caballero",
            "JJAJAJAJAJAPKYUO@GMAIL.COM",
            "9984567890",
            "Sm 510 Mz 58 Lt1",
            "ETY345PIOT",
            "Thedreays",
        )
    )

    fun Cliente.register() {
        println("Ingrese los nombres")
        val nombre = readln()
        println("Ingrese el primer apellido")
        val primerapellido = readln()
        println("Ingrese el segundo apellido")
        val segundoapellido = readln()
        println("Ingrese el RFC")
        val rfc = readln()
        println("Ingrese la dirección")
        val address = readln()

        val addedCliente =Cliente(
            nombre,primerapellido,segundoapellido, rfc, address)
        clienteList.add(addedCliente)
        }
    fun showCliente(){
        if (clienteList.isEmpty()){
            println("No se encuentran clientes registrados")
        }else{
            var counter = 1
            for (Cliente in clienteList){
                println("$counter-" + Cliente.getCustomerData())
                counter++
            }
        }
    }
    fun loadClienteFromeDB(){

    }
    fun getClienteByIndex(index: Int): Cliente = clienteList[index]

    fun areNotClientesRegistered(): Boolean = clienteList.isEmpty()
}
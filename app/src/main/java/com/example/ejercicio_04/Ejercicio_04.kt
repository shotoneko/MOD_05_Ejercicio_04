package com.example.ejercicio_04

class Persona(val nombre: String,
              val edad: Int,
              val trabajo: String?="No indica",
              val referencia: Persona?){

    override fun toString():String{
        val cadena = "Nombre: $nombre  " +
                "Edad: $edad   " +
                "Trabajo: ${trabajo?:"No indica"}  " +
                "Referencia: ${referencia?.toString() ?:"Sin referencia"}  "
        return cadena
    }
    fun mostrardatos(){
        println(this).toString()
    }
}
class listaUsers(){
    var listaUsers = mutableListOf<Persona>()

    fun  agregarUser(persona :Persona){
        listaUsers.add(persona)
    }
    fun eliminarUser(persona: Persona){
        listaUsers.remove(persona)
    }
    fun mostrarUsers(){
        for(user in listaUsers){
            (user.mostrardatos())
        }
    }

}
fun main(){
    val juanito = Persona(nombre = "Juanito", 12, trabajo = "Estudiante", referencia = null)
    val pedrito = Persona("Pedrito", 23, null, juanito)
    val chavela = Persona("Chavela", 54, "Profesora", pedrito)
    val pepe = Persona("Pepe", 66, null,juanito)
    val pancho = Persona("Pancho", 32, "Electricista", chavela)
    val listaUsers = listaUsers()
    listaUsers.agregarUser(juanito)
    listaUsers.agregarUser(pedrito)
    listaUsers.agregarUser(chavela)
    listaUsers.agregarUser(pepe)
    listaUsers.agregarUser(pancho)
    listaUsers.mostrarUsers()
    listaUsers.eliminarUser(pedrito)
    listaUsers.mostrarUsers()
}

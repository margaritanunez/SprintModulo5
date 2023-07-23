package com.example.sprintmdulo5

data class Producto (val nombre: String, val precio: Int, val imgProductoUrl: String)

class ProductosTienda{
    companion object {
        val productos = mutableListOf<Producto>().apply {
            add(Producto("Pasión de vaquerales", 200000, "https://images.unsplash.com/photo-1578847945588-d6c83689e3d2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=876&q=80"))
            add(Producto("Toy story", 500000, "https://images.unsplash.com/photo-1635779503036-27cbbdcdbbd1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=774&q=80"))
            add(Producto("Otoño lovers", 273827, "https://images.unsplash.com/photo-1528641638513-63e382072b5c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8MXw4ODUzMzA2fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60"))
            add(Producto("Saltando bajo la lluvia", 12343, "https://images.unsplash.com/photo-1578422468716-450ac3abc077?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8MXw5NDkyMzE3fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60"))
            add(Producto("Te la vuelas", 929392, "https://images.unsplash.com/photo-1593010932917-92bd21088dee?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=465&q=80"))
            add(Producto("Botas carrete/perreo", 293828, "https://images.unsplash.com/photo-1618006248091-7ff5da1f8a65?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=358&q=80"))
            add(Producto("Negras como la vida misma", 828323, "https://images.unsplash.com/photo-1582896911329-35927907b8f3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=482&q=80"))
            add(Producto("Sin miedo al éxito", 394883, "https://images.unsplash.com/photo-1644424235193-870d477ef7a3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(Producto("Sin botas(fotos) no hay trekking", 30518, "https://images.unsplash.com/photo-1630381503692-ac79cbac1b56?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=725&q=80"))
            add(Producto("Stormy Kardashian", 3416264, "https://images.unsplash.com/photo-1580662124358-a27775604219?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=871&q=80"))
        }
    }
}

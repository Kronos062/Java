import java.io.File
/*
fun main() {
    val inventario = Inventario()
    cargarInventarioDesdeArchivo(inventario)

    while (true) {
        mostrarMenu()
        val opcion = readLine()?.toIntOrNull() ?: continue

        when (opcion) {
            1 -> agregarItemAInventario(inventario)
            2 -> eliminarItemDeInventario(inventario)
            3 -> buscarItemsPorNombre(inventario)
            4 -> buscarItemsPorTipo(inventario)
            5 -> listarTodosLosItems(inventario)
            6 -> calcularValorTotal(inventario)
            7 -> calcularPesoTotal(inventario)
            8 -> encontrarItemMasValioso(inventario)
            9 -> encontrarItemMasPesado(inventario)
            10 -> guardarInventarioEnArchivo(inventario)
            0 -> break
            else -> println("Opción no válida. Inténtalo de nuevo.")
        }
    }
}

fun cargarInventarioDesdeArchivo(inventario: Inventario) {
    try {
        val inventarioCargado = AlmacenamientoInventario.cargarInventario()
        inventario.items.clear()
        inventario.items.addAll(inventarioCargado.items)
    } catch (e: Exception) {
        println("Error al cargar el inventario: ${e.message}")
    }
}

fun guardarInventarioEnArchivo(inventario: Inventario) {
    try {
        AlmacenamientoInventario.guardarInventario(inventario)
        println("Inventario guardado correctamente.")
    } catch (e: Exception) {
        println("Error al guardar el inventario: ${e.message}")
    }
}

fun mostrarMenu() {
    val textoMenu = File("src/main/resources/menu.txt").readText()
    println(textoMenu.toString())
}

fun agregarItemAInventario(inventario: Inventario) {
    println("Introduce el nombre del ítem:")
    val nombre = readLine()!!
    println("Introduce el tipo del ítem:")
    val tipo = readLine()!!
    println("Introduce el valor del ítem:")
    val valor = readLine()!!.toDouble()
    println("Introduce el peso del ítem:")
    val peso = readLine()!!.toDouble()

    val nuevoItem = Item(nombre, tipo, valor, peso)
    inventario.items.add(nuevoItem)
    println("Ítem agregado correctamente.")
}

fun eliminarItemDeInventario(inventario: Inventario) {
    println("Introduce el nombre del ítem que deseas eliminar:")
    val nombre = readLine()!!
    inventario.items.removeIf { it.nombre == nombre }
    if (inventario.items.isEmpty()) {
        println("No se encontró el ítem con el nombre '$nombre'.")
    } else {
        println("Ítem eliminado correctamente.")
    }
}

fun buscarItemsPorNombre(inventario: Inventario) {
    println("Introduce el nombre del ítem que deseas buscar:")
    val nombre = readLine()!!
    val itemsEncontrados = inventario.items.filter { it.nombre == nombre }
    if (itemsEncontrados.isEmpty()) {
        println("No se encontró el ítem con el nombre '$nombre'.")
    } else {
        println("Ítems encontrados:")
        itemsEncontrados.forEach { println(it) }
    }
}

fun buscarItemsPorTipo(inventario: Inventario) {
    println("Introduce el tipo del ítem que deseas buscar:")
    val tipo = readLine()!!
    val itemsEncontrados = inventario.items.filter { it.tipo == tipo }
    if (itemsEncontrados.isEmpty()) {
        println("No se encontró el ítem con el tipo '$tipo'.")
    } else {
        println("Ítems encontrados:")
        itemsEncontrados.forEach { println(it) }
    }
}

fun listarTodosLosItems(inventario: Inventario) {
    println (Inventario())
}

fun calcularValorTotal(inventario: Inventario) {
    val valorTotal = Operaciones.calcularValorTotal(inventario)
    println("Valor total del inventario: $valorTotal oro")
}

fun calcularPesoTotal(inventario: Inventario) {
    val pesoTotal = Operaciones.calcularPesoTotal(inventario)
    println("Peso total del inventario: $pesoTotal kg")
}

fun encontrarItemMasValioso(inventario: Inventario) {
    val itemMasValioso = Operaciones.encontrarItemMasValioso(inventario)
    println("Ítem más valioso: $itemMasValioso")
}

fun encontrarItemMasPesado(inventario: Inventario) {
    val itemMasPesado = Operaciones.encontrarItemMasPesado(inventario)
    println("Ítem más pesado: $itemMasPesado")
}
*/
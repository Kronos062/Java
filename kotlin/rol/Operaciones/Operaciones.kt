object Operaciones {
    fun agregarItem(inventario: Inventario, item: Item) {
        inventario.items.add(item)
    }

    fun eliminarItem(inventario: Inventario, itemId: Int) {
        inventario.items.removeIf { it.id == itemId }
    }

    fun buscarItemsPorNombre(inventario: Inventario, nombre: String): List<Item> {
        return inventario.items.filter { it.nombre.contains(nombre, ignoreCase = true) }
    }

    fun buscarItemsPorTipo(inventario: Inventario, tipo: String): List<Item> {
        return inventario.items.filter { it.tipo.equals(tipo, ignoreCase = true) }
    }

    fun calcularValorTotal(inventario: Inventario): Int {
        return inventario.items.sumOf { it.valor }
    }

    fun calcularPesoTotal(inventario: Inventario): Double {
        return inventario.items.sumOf { it.peso }
    }

    fun encontrarItemMasValioso(inventario: Inventario): Item? {
        return inventario.items.maxByOrNull { it.valor }
    }

    fun encontrarItemMasPesado(inventario: Inventario): Item? {
        return inventario.items.maxByOrNull { it.peso }
    }
}
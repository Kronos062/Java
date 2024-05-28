object AlmacenamientoInventario {
    private const val ARCHIVO_INVENTARIO = "inventario.json"

    fun guardarInventario(inventario: Inventario) {
        val json = Json.encodeToString(inventario)
        File(ARCHIVO_INVENTARIO).writeText(json)
    }

    fun cargarInventario(): Inventario {
        val json = File(ARCHIVO_INVENTARIO).readText()
        return Json.decodeFromString(json)
    }
}

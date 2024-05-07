package arbolBinario;

public class ArbolEnteros extends ArbolBinarioHecho<Integer> {
    public ArbolEnteros(int profundidad) {
        super(profundidad);
    }

    public void recorrerRamasDerecha() {
        throw new UnsupportedOperationException("'recorrerRamasDerecha'");
    }
    public void recorrerRamasIzquierda() {
        throw new UnsupportedOperationException("'recorrerRamasIzquierda'");
    }
}
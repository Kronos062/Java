package arbolBinario;

    //uso el ejercicio de empleados para hacer esto ya que no me acordaba xd.
public class ArbolEnteros extends ArbolBinario<Integer> {
    public ArbolEnteros(int profundidad) {
        super(profundidad);
    }
// he buscado el error en google y me ha aparecido la solucion, copiar pegar y lo adapto a mi codigo, ale
    public void recorrerRamasDerecha() {
        throw new UnsupportedOperationException("'recorrerRamasDerecha'");
    }

    public void recorrerRamasIzquierda() {
        throw new UnsupportedOperationException("'recorrerRamasIzquierda'");
    }
}

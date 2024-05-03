package arbolBinario;
//en el nodo
public class Nodo {
    Nodo izquierda;
    Nodo derecha;
    int profundidad;

    public Nodo(int profundidad) {
        this.profundidad = profundidad;
        this.izquierda = null;
        this.derecha = null;
    }
//para QUE VAYA A LA IZQUIERDA USO EL SET
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
//para QUE VAYA A LA DERECHA USO EL SET
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}

package arbolBinario;
//1. Crea una nova classe en Java per a la implementació de l'arbre binari:
public class arbolBinario {
    //no ha servdio de nada lo que he hecho, creo nodo, profundidad y dejo el contador (lo pongo como estatico e int para los errores):
    Nodo raiz;
    int profundidad;
    static int contadorArbol = 0;
    //2. Implementa constructors per a la creació de l'arbre binari:
    public arbolBinario() {
        this.izquierda = null;
        this.derecha = null;
        contadorArbol++;
    }
    /*3. Volem que les instancies d’arbre sapiguen quantes instancies coexisteixen a la vegada.
    esto de arriba lo hare con un contador*/
    //se llamara contador arbol y solo hara un return del contador.
    public static int getContadorArbol() {
        return contadorArbol;
    }
}
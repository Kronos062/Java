package arbolBinario;
//1. Crea una nova classe en Java per a la implementació de l'arbre binari:
public class ArbolBinario {
    //no ha servdio de nada lo que he hecho, creo nodo, profundidad y dejo el contador (lo pongo como estatico e int para los errores):
    Nodo raiz;
    int profundidad;
    static int contadorArbol = 0;
//USO raiz para crearel arbol y inicializa en profundidad 0
    public ArbolBinario(int profundidad) {
        this.profundidad = profundidad;
        this.raiz = crearArbol(profundidad, 0);
        contadorArbol++;
    }

    //tengo que usar las direcciones de nodo para poder hacer la creadcion de el nopo donde nos encontramos:
    private Nodo crearArbol(int profundidadMaxima, int profundidadActual) {
        if (profundidadActual == profundidadMaxima) {
            return null;
        }
    /*3. Volem que les instancies d’arbre sapiguen quantes instancies coexisteixen a la vegada.
    esto de arriba lo hare con un contador*/
    //se llamara contador arbol y solo hara un return del contador.
    public static int getContadorArbol() {
        return contadorArbol;
    }
}
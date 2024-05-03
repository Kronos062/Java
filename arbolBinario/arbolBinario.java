//1. Crea una nova classe en Java per a la implementació de l'arbre binari:
public class arbolBinario {
    // aqui tengo que poner los tipos de datos:
    // no sabia crear un contador, pero es igual que en python (https://es.stackoverflow.com/questions/468849/utilizar-un-contador-haciendo-recursi%C3%B3n-en-java)
    int contadorArbol = 0;
    // el arbol solo puede ir para dos lados, izquierda y derecha (como un personaje de mario bros)
    // con un "=" me sale error, pero asi no.
    arbolBinario izquierda;
    arbolBinario derecha;
    //creo arbol binario:
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
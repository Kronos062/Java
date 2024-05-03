package arbolBinario;
public class Principal {
    public static void main(String[] args) {
        //A. Crear 2 Arbres d’enters de fondaria 5.
        ArbolEnteros arbol1 = new ArbolEnteros(5);
        ArbolEnteros arbol2 = new ArbolEnteros(5);

        //B. Mostrar quantes instancies existeixen d‘arbres.
        //solo hago un print de mi contador par que diga las instancias
        System.out.println("Número de instancias: " + ArbolBinario.getContadorInstancias());

        //C. Crear 2 Arbres de caràcters de fondaria 3.
        //lo mismo de arriba pero en vez de usar el de arbooenteros usamos arbolcaracteres:
        ArbolCaracteres arbol3 = new ArbolCaracteres(3);
        ArbolCaracteres arbol4 = new ArbolCaracteres(3);

        //D. Mostrar quantes instancies existeixen d’arbres.
        // ctrl + c / ctrl + v de la pregunta B
        System.out.println("Número de instancias: " + ArbolBinario.getContadorInstancias());

        //E. Forçar al Garbage Collector.
        //he tenido que buscar por internet (https://stackoverflow.com/questions/1481178/how-to-force-garbage-collection-in-java)
        System.gc();

        //F. Recorrer el primer arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques dretes.
        arbol1.recorrerRamasDerecha();

        //G. Recorrer el segon arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques esquerres.
        arbol2.recorrerRamasIzquierda();

        //H. Tornar a mostrar quantes instancies existeixen.
        // ctrl + c / ctrl + v de la pregunta B y D
        System.out.println("Número de instancias: " + ArbolBinario.getContadorInstancias());

        //I. Tornar a forçar al Garbage Collector.
        System.gc();
        //J. Tornar a mostrar quantes instancies existeixen.
        System.out.println("Número de instancias: " + ArbolBinario.getContadorInstancias());
    }
}
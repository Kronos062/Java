package tetris;

public class Tablero {
    public Figura figura;
    public int puntuación;

    public Tablero() {
        this.figura = new Figura("Z");
        this.puntuación = 0;
    }

    public Figura siguienteFigura() {
        return new Figura("i");
    }

    public Figura moverDerecha(Figura figura) {
        //por cada espacio de la matriz (primera columna) que sea 0 o menor que 4 suma 1.
        for (int i = 0; i < 4; i++) {
            //por cada espacio de la matriz (primera columna) que sea 1 o menor que 2 suma 1.
            for (int j = 1; j < 2; j++) {
                if (figura.matriz[i][j] == 1) {
                    figura.matriz[i][j] = 0;
                    figura.matriz[i][j + 1] = 1;
                }
            }
        }
        return figura;
    }

    public Figura moverIzquierda(Figura figura) {
        //lo mismo de arriba pero al reves y cambiando la j
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                if (figura.matriz[i][j] == 1) {
                    figura.matriz[i][j] = 0;
                    figura.matriz[i][j - 1] = 1;
                }
            }
        }
        return figura;
    }

    public Figura moverAbajo(Figura figura) {
        return figura;
    }

    public void mostrarFigura(Figura figura) {
        System.out.println();
    }
}
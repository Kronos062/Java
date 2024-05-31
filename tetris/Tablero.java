package tetris;

public class Tablero {
    private Figura figura;
    private int puntuación;

    public Tablero() {
        this.figura = new Figura("Z");
        this.puntuación = 0;
    }

    public Figura siguienteFigura() {
        return new Figura("i");
    }

    public Figura moverDerecha(Figura figura) {
        return figura;
    }

    public Figura moverIzquierda(Figura figura) {
        return figura;
    }

    public Figura moverAbajo(Figura figura) {
        return figura;
    }

    public void mostrarFigura(Figura figura) {
        System.out.println();
    }
}
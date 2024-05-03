import java.utils.Math;

class Circulo extends Figura2D {
    double radio;

    Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio * radio * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * radio * Math.PI;
    }
}

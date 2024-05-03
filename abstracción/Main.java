public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(nombre:"Rectangulo", base:4, altura:3);
        Circulo circulo = new Circulo(nombre:"Circulo", radio:5);
        
        imprimirDatos(Circulo);
        imprimirDatos(Rectangulo);
        
        private static void imprimirDatos(Figura2D figura) {
                System.out.println("EL area del :" + figura.nombre + ": " + figura.calcularArea());
        System.out.println("Perímetro del " + figura.nombre + ": " + figura.calcularPerimetro());
    }
}

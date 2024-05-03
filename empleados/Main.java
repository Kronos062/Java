public class Main {
    public static void main(String[] args) {
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Luis", 0, 40, 2.3);
        empleadoPorHoras.calcularSalario();
        empleadoPorHoras.imprimirDetalles();

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Artur", 1000);
        empleadoAsalariado.imprimirDetalles();

        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Oscar", 5000, 35000, 0.10);
        empleadoPorComision.calcularSalario();
        empleadoPorComision.imprimirDetalles();
    }
}

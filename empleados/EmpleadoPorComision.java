class EmpleadoPorComision extends Empleado {
    double ventasRealizadas;
    double comisionPorVenta;

    public EmpleadoPorComision(String nombre, double salario, double ventasRealizadas, double comisionPorVenta) {
        super(nombre, salario);
        this.ventasRealizadas = ventasRealizadas;
        this.comisionPorVenta = comisionPorVenta;
    }

    public void calcularSalario() {
        salario = salario + (ventasRealizadas * comisionPorVenta);
    }
}

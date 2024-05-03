class EmpleadoPorHoras extends Empleado {
    int horasTrabajadas;
    double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, double salario, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public void calcularSalario() {
        salario = horasTrabajadas * tarifaPorHora;
    }
}

package Calculadora;

class Principal
{
	public static void main(String[] args) {
		Menu.imprimir();
		String opcion = Teclado.leer("EScribe por teclado");
		Menu.selecciona(opcion);
	}
		
}

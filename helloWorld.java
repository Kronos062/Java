class HelloWorld
{
	public static void main(String[] args) {
		String nombre = "World";
		try {
			nombre = String.join(" ", args);
		} catch (ArrayIndexOutOfBoundsException abe) {
			nombre = "Fuera del array";
		} catch (Exception e) {
			nombre = "World";
		}

		System.out.println(String.format("Hello, %s!", nombre));
	}
}

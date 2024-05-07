package contNew;

class Aux 
{
    public static int num_instancies = 0;

    public Aux() {
            num_instancies++;
    }
    public static int getNumInstances() {
        return num_instancies;
    }
}

class Main 
{
    public static void main(String[] args) {
        System.out.println("Numero de instancias inicial:" + Aux.getNumInstances());
        Aux x = new Aux();
        System.out.println("Numero de instancias: " + Aux.getNumInstances());
        System.out.println("Numero de instancias (Usando aux): " + Aux.getNumInstances());
        Aux y = new Aux();
        System.out.println("Numero de instancias: " + Aux.getNumInstances());
        System.out.println("Numero de instancias (Usando aux): " + Aux.getNumInstances());
    }
}
public class CalculadoraEstadisticas {
    public double calcularMediana(double[] notas) {
        double suma = 0.0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public double calcularMaximo(double[] notas) {
        double maximo = notas[0];
        for (double nota : notas) {
            if (nota > maximo) {
                maximo= nota;
            }
        }
        return maximo;
    }

    public double calcularMinimo(double[] notas) {
        double minimo = notas[0];
        for (double nota : notas) {
            if (nota < minimo) {
                minimo = nota;
            }
        }
        return minimo;
    }
}


package tetris;

public class Figura {
    private String forma;
    private int[][] matriz;

    public Figura(String forma) {
        this.forma = forma;
        this.matriz = new int[4][2];
    }

    public void representarForma() {
        // voy a usar un switch para cada caso de cada forma:
        switch (forma) {
            case "O":
                matriz[0][0] = 1;
                matriz[0][1] = 1;
                matriz[1][0] = 1;
                matriz[1][1] = 1;
                break;
            case "L":
                matriz[0][0] = 1;
                matriz[1][0] = 1;
                matriz[1][1] = 1;
                matriz[2][1] = 1;
                break;
            case "Z":
                matriz[0][0] = 1;
                matriz[0][1] = 1;
                matriz[1][1] = 1;
                matriz[2][1] = 1;
                break;
            //de verdad, me esta costando que flipas
            case "J":
                matriz[0][1] = 1;
                matriz[1][0] = 1;
                matriz[1][1] = 1;
                matriz[2][1] = 1;
                break;
            //cntrl + c del de arriba
            case "T":
                matriz[0][1] = 1;
                matriz[1][0] = 1;
                matriz[1][1] = 1;
                matriz[2][1] = 1;
                break;
            //cntrl + c del de arriba
            case "S":
                matriz[0][1] = 1;
                matriz[1][0] = 1;
                matriz[1][1] = 1;
                matriz[2][0] = 1;
                break;
            case "i":
                matriz[0][0] = 1;
                matriz[1][0] = 1;
                matriz[2][0] = 1;
                matriz[3][0] = 1;
                break;
        
                default:
                    System.out.println("Forma inválida");
            }
        }
    public Figura rotarFigura(Figura figura) {
        switch (figura.forma) {
            case "O":
                break;
            case "O":
                break;
            case "O":
                break;
            case "O":
                break;
            case "O":
                break;
            case "O":
                break;
            case "O":
                break;
    }
}

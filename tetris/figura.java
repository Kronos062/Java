package tetris;

import static java.lang.StringTemplate.STR;

public class figura {
    private String forma;
    private int[][] matriz;

    public Figura(String forma) {
        this.forma = forma;
        this.matriz = new int[4][2];
    }

    public void representarForma() {
        // voy a usar un switch para cada caso de cada forma:
        switch (STR) {
            case "O":
                
                break;
            case "L":
                
                break;
            case "Z":
                
                break;
            case "J":
                
                break;
            case "T":
                
                break;
            case "S":
                
                break;
            case "i":
                
                break;
        
                default:
                    System.out.println("Forma inválida");
            }
    }
}

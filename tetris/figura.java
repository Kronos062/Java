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
            case value:
                
                break;
        
            default:
                System.out.println("Forma inválida");;
        }
    }
}

package roll;

public class Personatge {
        private String nom;
        private int nivell;
        private int puntsDeVida;
        private int puntsDeMana;
        // Constructor
    public Personatge(String nom, int nivell, int puntsDeVida, int puntsDeMana, Arma arma, Armadura armadura) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsDeVida = puntsDeVida;
        this.puntsDeMana = puntsDeMana;
        this.arma = arma;
        this.armadura = armadura;
    }
}
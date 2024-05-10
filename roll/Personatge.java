package roll;

import roll.Elements.Arma;
import roll.Elements.Armadura;

public class Personatge {
        private String nom;
        private int nivell;
        private int puntsDeVida;
        private int puntsDeMana;
        private Arma arma;
        private Armadura armadura;
        // Constructor
        public Personatge(String nom, int nivell, int puntsDeVida, int puntsDeMana, Arma arma, Armadura armadura) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsDeVida = puntsDeVida;
        this.puntsDeMana = puntsDeMana;
        this.arma = arma;
        this.armadura = armadura;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public int getPuntsDeVida() {
        return puntsDeVida;
    }

    public void setPuntsDeVida(int puntsDeVida) {
        this.puntsDeVida = puntsDeVida;
    }

    public int getPuntsDeMana() {
        return puntsDeMana;
    }

    public void setPuntsDeMana(int puntsDeMana) {
        this.puntsDeMana = puntsDeMana;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
}
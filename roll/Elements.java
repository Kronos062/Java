package roll;

public class Elements {
    public class Arma {
        private String nom;
        private int danys;
    
        // Constructor
        public Arma(String nom, int danys) {
            this.nom = nom;
            this.danys = danys;
        }
    //nombre del arma
        public String getNom() {
            return nom;
        }
    //poner nombre al arma
        public void setNom(String nom) {
            this.nom = nom;
        }
    //el daño que hace
        public int getDanys() {
            return danys;
        }
    //poner el daño que hace
        public void setDanys(int danys) {
            this.danys = danys;
        }
    }
    //ahora creo la clase armadura
    public class Armadura {
        private String nom;
        private int resistència;

        // Constructor
        public Armadura(String nom, int resistència) {
            this.nom = nom;
            this.resistència = resistència;
        }
    //nombre de la armadura
        public String getNom() {
            return nom;
        }
    //poner nomvre de la armadura
        public void setNom(String nom) {
            this.nom = nom;
        }
    //su resistencia
        public int getResistència() {
            return resistència;
        }
    //poner la resistencia que tiene:
        public void setResistència(int resistència) {
            this.resistència = resistència;
        }
    }
}


package packman
//primero cremoas la clase:
public class Packman {  
    private int posX;
    private int posY;

    public Packman(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public void move(int newPosX, int newPosY) {
        this.posX = nuevaPosX;
        this.posY = nuevaPosY;
    }
    public void pickupBola(){
        //no se hacer que recoja eso por que no se como se mueve por el mapa
    }
    public void pickupBolaEspecial() {
        //no se hacer que recoja la bola especial por que no se como se mueve por el mapa
    }
    public void pickupFruita() {
        //no se hacer que recoja la fruta por que no se como se mueve por el mapa
    }
    public void loseLife() {
        //no se hacer que muera por que no se como se mueve por el mapa
    }
    public void detectColisionFantasma(Fantasma fantasma) {
        //no se hacer que lo maten por que no se como se mueve por el mapa
    }
}
package packman;
import Puntos.Puntos;
//primero cremoas la clase:
public class Packman {  
    private int posX;
    private int posY;

    public Packman(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
//para hacer un movimiento necesita ir a un lugar nuevo (supongo) por eso lo delaro aquí
    public void move(int nuevaPosX, int nuevaPosY) {
        this.posX = nuevaPosX;
        this.posY = nuevaPosY;
    }

    public void life(int vida) {
        vida = 3;
    }

    public void pickupBola(){
        while (this.posX == Puntos.getBola().posX && this.posY == Puntos.getBola().posY) {
            System.out.println("¡Has recogido una bola!");
            Puntos.puntos += 500;
        }
    }
    
    public void pickupBolaEspecial() {
        while (this.posX == Puntos.getBolaEspecial().posX && this.posY == Puntos.getBolaEspecial().posY) {
            System.out.println("¡Has recogido una bola especial!");
            Puntos.puntos += 5000;
        }
    }
    
    public void pickupFruta() {
        while (this.posX == Puntos.getFruta().posX && this.posY == Puntos.getFruta().posY) {
            System.out.println("¡Has recogido una fruta!");
            Puntos.puntos += 10000;
        }
    }
    
    public void loseLife(int vida) {
        vida -= 1;
    }
    
    public void detectColisionFantasma(Fantasma fantasma) {
        while (this.posX == fantasma.posX && this.posY == fantasma.posY) {
            System.out.println("¡Has perdido una vida!");
            this.loseLife();
        }
    }
}
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
//tiene 3 vidas, inicializo en 3
    public void life(int vida) {
        vida = 3;
    }
//hago que se sumen puntos por cada bola que se coja cada vez que packman este en la posición
    public void pickupBola(){
        while (this.posX == Puntos.getBola().posX && this.posY == Puntos.getBola().posY) {
            System.out.println("¡Has recogido una bola!");
            Puntos.puntos += 500;
        }
    }
//hago lo mismo de antes pero ahora con mas puntuación y cambiando las variables (en los commits se ve que lo hice en python y he buscado hacer un while en java, ha salido esto xd)
    public void pickupBolaEspecial() {
        while (this.posX == Puntos.getBolaEspecial().posX && this.posY == Puntos.getBolaEspecial().posY) {
            System.out.println("¡Has recogido una bola especial!");
            Puntos.puntos += 5000;
        }
    }
//lo mismo pero con fruta...
    public void pickupFruta() {
        while (this.posX == Puntos.getFruta().posX && this.posY == Puntos.getFruta().posY) {
            System.out.println("¡Has recogido una fruta!");
            Puntos.puntos += 10000;
        }
    }
//esto es donde declaro que haces cuando pierdes una vida (cuando chocas contra un fantasma)
    public void loseLife(Life vida) {
        vida -= 1;
    }
//cunadola posicion de un fantasma es igual a la de packman = a que vaya a la funcion loseLife para que se reste una vida de life
    public void detectColisionFantasma(Fantasma fantasma) {
        while (this.posX == fantasma.posX && this.posY == fantasma.posY) {
            System.out.println("¡Has perdido una vida!");
            this.loseLife();
        }
    }
}
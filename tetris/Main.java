package tetris;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();

        JFrame frame = new JFrame("Tablero");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            //He buscado como hacer movimiento por internet y me aparecia lo del action event, a tirar millas
        JButton derecho = new JButton("Mover derecha");
        derecho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.figura = tablero.moverDerecha(tablero.figura);
                tablero.mostrarFigura(tablero.figura);
            }
        });
        JButton izquierdo = new JButton("Mover izquierda");
        izquierdo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.figura = tablero.moverDerecha(tablero.figura);
                tablero.mostrarFigura(tablero.figura);
            }
        });
        JButton abajo = new JButton("Mover abajo");
        abajo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.figura = tablero.moverAbajo(tablero.figura);
                tablero.mostrarFigura(tablero.figura);
            }
        });
        //esto como es un button funciona igual que los de arriba
        JButton rotar = new JButton("Rotar figura");
        rotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.figura = tablero.figura.rotarFigura(tablero.figura);
                tablero.mostrarFigura(tablero.figura);
            }
        });
        panel.add(derecho);
        panel.add(izquierda);
        panel.add(abajo);
        panel.add(rotar);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}


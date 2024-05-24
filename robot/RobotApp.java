package robot;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RobotApp {
    private Robot robot;

    public RobotApp() {
        JFrame frame = new JFrame("Control del Robotin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());
        JPanel bottomPanel = new JPanel(new FlowLayout());

        robot = new Robot();
        JButton moverAdelanteButton = new JButton("Mover adelante");
        JButton moverAtrasButton = new JButton("Mover atras");
        JButton girarDerechaButton = new JButton("Girar derecha");
        JButton girarIzquierdaButton = new JButton("Girar izquierda");
        JButton guardarButton = new JButton("Guardar estado");
        JButton cargarButton = new JButton("Cargar estado");

        //panel de arriba para que hayan dos
        topPanel.add(moverAdelanteButton);
        topPanel.add(moverAtrasButton);

        //panel del centro para que hayan 3
        centerPanel.add(girarDerechaButton);
        centerPanel.add(girarIzquierdaButton);
        centerPanel.add(guardarButton);
        //panel de abajo con el cargar
        bottomPanel.add(cargarButton);
    
        moverAdelanteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                robot.moverAdelante();
                System.out.println("Se ha movido hacia adelante");
            }
        });

        moverAtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                robot.moverAtras();
                System.out.println("Se ha movido hacia atras");
            }
        });

        girarDerechaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                robot.girarDerecha();
                System.out.println("Se ha movido hacia la derecha");
            }
        });

        girarIzquierdaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                robot.girarIzquierda();
                System.out.println("Se ha movido hacia la izquierda");
            }
        });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                robot.guardar();
                System.out.println("Se ha guardado");
            }
        });

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                robot.cargar();
                System.out.println("Se ha cargado");
            }
        });

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RobotApp();
    }
}

class Robot implements Serializable {
    private int posicionX;
    private int posicionY;

    public Robot() {
        this.posicionX = 0;
        this.posicionY = 0;
    }
    public void moverAdelante() {
        this.posicionX++;
    }
    public void moverAtras() {
        this.posicionX--;
    }
    public void girarDerecha() {
        this.posicionY++;
    }
    public void girarIzquierda() {
        this.posicionY--;
    }
    public void guardar() {
        System.out.println("Guardando estado del robot...");
    }

    public void cargar() {
        System.out.println("Cargando estado del robot...");
    }
}
package robot;


import java.awt.BorderLayout;
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

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        robot = new Robot();
        JButton moverAdelanteButton = new JButton("Mover adelante");
        JButton moverAtrasButton = new JButton("Mover atras");
        JButton girarDerechaButton = new JButton("Girar derecha");
        JButton girarIzquierdaButton = new JButton("Girar izquierda");
        JButton guardarButton = new JButton("Guardar estado");
        JButton cargarButton = new JButton("Cargar estado");

        panel.add(moverAdelanteButton);
        panel.add(moverAtrasButton);
        panel.add(girarDerechaButton);
        panel.add(girarIzquierdaButton);
        panel.add(guardarButton);
        panel.add(cargarButton);
    
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

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RobotApp();
    }
}

class Robot implements Serializable {
    public void moverAdelante() {

    }
    public void moverAtras() {

    }
    public void girarDerecha() {

    }
    public void girarIzquierda() {
        
    }
    public void guardar() {

    }

    public void cargar() {

    }
}
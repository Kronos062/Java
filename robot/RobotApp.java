package robot;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RobotApp {
    private Robot robot;

    public RobotApp() {
        JFrame frame = new JFrame("Aplicación de Robotin");
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
        );


        moverAdelanteButton.setOnAction(e -> {
            robot.moverAdelante();
            return("Se ha movido hacia adelante\n");
        });

        moverAtrasButton.setOnAction(e -> {
            robot.moverAtras();
            return("Se ha movido hacia atras\n");
        });

        girarDerechaButton.setOnAction(e -> {
            robot.girarDerecha();
            return("Se ha movido hacia la derecha\n");
        });

        girarIzquierdaButton.setOnAction(e -> {
            robot.girarIzquierda();
            return("Se ha movido hacia la izquierda\n");
        });

        guardarButton.setOnAction(e -> {
            robot.guardar();
            return("Se ha guardado\n");
        });
        cargarButton.setOnAction(e -> {
            robot.cargar();
            return("Se ha cargado.\n");
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class Robot implements Serializable{
    public void moverAdelante() {

    }
    public void moverAtras() {

    }
    public void girarDerecha() {

    }
    public void girarIzquierda() {
        
    }
}
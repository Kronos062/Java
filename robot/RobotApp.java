package JFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RobotApp extends Application{
    private Robot robot;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Aplicación de Salu2");

        robot = new Robot();
        Button moverAdelanteButton = new Button("Mover adelante");
        Button moverAtrasButton = new Button("Mover atras");
        Button girarDerechaButton = new Button("Girar derecha");
        Button girarIzquierdaButton = new Button("Girar izquierda");
        Button guardarButton = new Button("Guardar estado");
        Button cargarButton = new Button("Cargar estado");

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


        StackPane root = new StackPane();
        root.getChildren().add(btnSalutacio);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private void mostrarMensageSalu2() {
        Stage stage = new Stage();
        stage.setTitle("Mensahe de Salu2");
        Label label = new Label("Hola, acabas de perder 5 segundos de tu vida! (Gilipollas)");
        Scene scene = new Scene(new StackPane(label), 250, 100);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
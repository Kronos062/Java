package JFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Salu2App extends Application{

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Aplicación de Salu2");

        Button btnSalutacio = new Button();
        btnSalutacio.setText("Clica aquí");
        btnSalutacio.setOnAction(e -> {
            mostrarMensageSalu2();
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
package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Un paseo en Buenos Aires");
        Movimientos movimientos = new Movimientos();
        Group root = new Group();
        var scene = new Scene(root, 840, 680);
        Text text = new Text();
        String s = "Movimientos realizados " + movimientos.mostrar();
        text.setText(s);
        text.setX(350);
        text.setY(50);
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                root.getChildren().add(new Rectangle(210 + columna*120, 250 + fila*90, 80,60));
            }
        }
        Image auto = new Image("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\auto.png");
        ImageView imageView = new ImageView(auto);
        imageView.setFitHeight(40);
        imageView.setFitWidth(60);
        imageView.setX(285);
        imageView.setY(300);

        Image meta = new Image("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\meta.png");
        ImageView imageView2 = new ImageView(meta);
        imageView2.setFitHeight(60);
        imageView2.setFitWidth(110);
        imageView2.setX(600);
        imageView2.setY(385);



        root.getChildren().add(text);
        root.getChildren().add(imageView);
        root.getChildren().add(imageView2);
        stage.setScene(scene);

        stage.setResizable(false);
        stage.show();
        movimientos.sumar(3);
        text.setText("Movimientos realizados " + movimientos.mostrar());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        Group root = new Group();
        var scene = new Scene(root, 840, 680);

        Button norte = new Button("↑");
        Button sur = new Button("↓");
        Button este = new Button("→");
        Button oeste = new Button("←");
        norte.setTranslateX(420);
        norte.setTranslateY(80);
        sur.setTranslateX(420);
        sur.setTranslateY(130);
        este.setTranslateX(445);
        este.setTranslateY(105);
        oeste.setTranslateX(390);
        oeste.setTranslateY(105);
        root.getChildren().add(sur);
        root.getChildren().add(norte);
        root.getChildren().add(este);
        root.getChildren().add(oeste);





        Text text = new Text();
        root.getChildren().add(text);
        Movimientos movimientos = new Movimientos(text);

        Juego juego = new Juego(4,4, root);
        juego.agregarElemento(new CambioVehiculo(), 0,0, new Sur());
        juego.agregarElemento(new Piquete(), 1,0, new Sur());
        juego.agregarElemento(new Pozo(), 0,0, new Este());
        juego.agregarElemento(new ControlPolicial(), 0,1, new Este());
        juego.agregarElemento(new Favorable(), 1,1, new Este());
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.jugar("carlos", vehiculo);

        EventHandler<ActionEvent> avanzarNorte = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                juego.moverse(new Norte());
            }
        };

        EventHandler<ActionEvent> avanzarSur = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                juego.moverse(new Sur());
            }
        };

        EventHandler<ActionEvent> avanzarEste = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                juego.moverse(new Este());
            }
        };

        EventHandler<ActionEvent> avanzarOeste = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                juego.moverse(new Oeste());
            }
        };

        norte.setOnAction(avanzarNorte);
        sur.setOnAction(avanzarSur);
        este.setOnAction(avanzarEste);
        oeste.setOnAction(avanzarOeste);


        stage.setScene(scene);

        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}
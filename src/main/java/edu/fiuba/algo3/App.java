package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
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
        var principal = new Scene(root, 840, 780);

        //Inicializacion mapa
        Juego juego = new Juego(4,4, root, new Meta(new GraficaVehiculo()));
        juego.agregarElemento(new CambioVehiculo(new GraficaElemento()), 0,0, new Sur());
        juego.agregarElemento(new Piquete(new GraficaElemento()), 1,0, new Sur());
        juego.agregarElemento(new Pozo(new GraficaElemento()), 0,0, new Este());
        juego.agregarElemento(new ControlPolicial(new GraficaElemento()), 0,1, new Este());
        juego.agregarElemento(new Favorable(new GraficaElemento()), 1,1, new Este());
        juego.agregarElemento(new Piquete(new GraficaElemento()), 1,1, new Este());
        juego.agregarElemento(new Pozo(new GraficaElemento()), 1,1, new Este());

        Text text = new Text();
        root.getChildren().add(text);
        Movimientos movimientos = new Movimientos(text);

        //Inicializacion de la entrada
        Group inicio = new Group();
        Scene entrada = new Scene(inicio, 240, 100);
        stage.setScene(entrada);

        final EstadoVehiculo[] estadoInicial = new EstadoVehiculo[1];
        estadoInicial[0] = new Auto();

        Label nickname = new Label("Nickname:");
        nickname.setMinWidth(100);
        nickname.setTranslateX(10);
        inicio.getChildren().add(nickname);

        TextField nombre = new TextField();
        nickname.setLabelFor(nombre);
        nombre.setTranslateX(70);
        inicio.getChildren().add(nombre);

        Button autoButton = new Button("Auto");
        autoButton.setTranslateY(30);
        autoButton.setTranslateX(40);
        inicio.getChildren().add(autoButton);

        Button motoButton = new Button("Moto");
        motoButton.setTranslateY(30);
        motoButton.setTranslateX(97);
        inicio.getChildren().add(motoButton);

        Button cuatroxCuatroButton = new Button("4x4");
        cuatroxCuatroButton.setTranslateY(30);
        cuatroxCuatroButton.setTranslateX(158);
        inicio.getChildren().add(cuatroxCuatroButton);

        Button jugarButton = new Button("Jugar");
        jugarButton.setTranslateY(60);
        jugarButton.setTranslateX(97);
        inicio.getChildren().add(jugarButton);

        EventHandler<ActionEvent> elegirAuto = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                estadoInicial[0] = new Auto();
            }
        };

        EventHandler<ActionEvent> elegirMoto = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) { estadoInicial[0] = new Moto(); }
        };

        EventHandler<ActionEvent> elegirCuatroxCuatro = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) { estadoInicial[0] = new CuatroxCuatro(); }
        };

        EventHandler<ActionEvent> jugar = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                juego.jugar(nombre.getText(), new Vehiculo(estadoInicial[0], movimientos, new GraficaVehiculo()));
                stage.close();
                stage.setScene(principal);
                stage.show();

            }
        };

        autoButton.setOnAction(elegirAuto);
        motoButton.setOnAction(elegirMoto);
        cuatroxCuatroButton.setOnAction(elegirCuatroxCuatro);
        jugarButton.setOnAction(jugar);


        //Inicializacion de los controles
        Button norte = new Button("↑");
        norte.setTranslateX(420);
        norte.setTranslateY(80);
        root.getChildren().add(norte);

        Button sur = new Button("↓");
        sur.setTranslateX(420);
        sur.setTranslateY(130);
        root.getChildren().add(sur);

        Button este = new Button("→");
        este.setTranslateX(445);
        este.setTranslateY(105);
        root.getChildren().add(este);

        Button oeste = new Button("←");
        oeste.setTranslateX(390);
        oeste.setTranslateY(105);
        root.getChildren().add(oeste);

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

        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}
package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controles.*;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.Vehiculo;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Entrada extends Group {

    Entrada(Juego juego, Vehiculo vehiculo, ComenzarJuego accionComenzar){

        Label nickname = new Label("Nickname:");
        nickname.setMinWidth(100);
        nickname.setTranslateX(10);
        this.getChildren().add(nickname);

        TextField nombre = new TextField();
        nickname.setLabelFor(nombre);
        nombre.setTranslateX(70);
        this.getChildren().add(nombre);

        Button autoButton = new Button("Auto");
        autoButton.setTranslateY(30);
        autoButton.setTranslateX(40);
        this.getChildren().add(autoButton);

        Button motoButton = new Button("Moto");
        motoButton.setTranslateY(30);
        motoButton.setTranslateX(97);
        this.getChildren().add(motoButton);

        Button cuatroxCuatroButton = new Button("4x4");
        cuatroxCuatroButton.setTranslateY(30);
        cuatroxCuatroButton.setTranslateX(158);
        this.getChildren().add(cuatroxCuatroButton);

        Button jugarButton = new Button("Jugar");
        jugarButton.setTranslateY(60);
        jugarButton.setTranslateX(97);
        this.getChildren().add(jugarButton);

        autoButton.setOnAction(new SelectorAutoInicial(vehiculo));
        motoButton.setOnAction(new SelectorMotoInicial(vehiculo));
        cuatroxCuatroButton.setOnAction(new SelectorCuatroxCuatroInicial(vehiculo));
        accionComenzar.agregarNombreJugador(nombre);
        jugarButton.setOnAction(accionComenzar);
    }
}

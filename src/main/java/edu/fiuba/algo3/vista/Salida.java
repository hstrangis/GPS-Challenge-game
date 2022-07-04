package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controles.*;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.Vehiculo;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.scene.control.TextField;


public class Salida extends Group {

    Salida(Juego juego, FinalizarJuego accionSalir, VerRanking accionVerRanking, ComenzarJuego accionComenzar){

        Label mensaje = new Label("Felicidades, llegaste a la meta!!!");
        mensaje.setMinWidth(100);
        mensaje.setTranslateX(10);
        this.getChildren().add(mensaje);

        Button rankingButton = new Button("Ver puntaje");
        rankingButton.setTranslateY(30);
        rankingButton.setTranslateX(40);
        this.getChildren().add(rankingButton);

        Button jugarOtraVezButton = new Button("Jugar otra vez");
        jugarOtraVezButton.setTranslateY(60);
        jugarOtraVezButton.setTranslateX(40);
        this.getChildren().add(jugarOtraVezButton);

        Button salirButton = new Button("Salir");
        salirButton.setTranslateY(90);
        salirButton.setTranslateX(40);
        this.getChildren().add(salirButton);

        rankingButton.setOnAction(accionVerRanking);
        jugarOtraVezButton.setOnAction(accionComenzar);
        salirButton.setOnAction(accionSalir);
    }
}

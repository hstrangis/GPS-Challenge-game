package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controles.*;
import edu.fiuba.algo3.modelo.Juego;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.stage.Stage;


public class Salida extends Group {
    Salida(Juego juego, Stage stage, Stage stageSalida){
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

        rankingButton.setOnAction(new VerRanking(stage, new RankingVista(juego)));
        jugarOtraVezButton.setOnAction(new VolverAJugar(stage, stageSalida, juego));
        salirButton.setOnAction(new FinalizarJuego());
    }
}

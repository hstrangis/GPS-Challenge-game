package edu.fiuba.algo3.controles;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.vista.Entrada;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VolverAJugar implements EventHandler<ActionEvent> {

    private final Stage stage;

    private final Stage stageSalida;

    private final Juego juego;

    public VolverAJugar(Stage stage, Stage stageSalida, Juego juego){
        this.stage = stage;
        this.stageSalida = stageSalida;
        this.juego = juego;
    }

    public void handle(ActionEvent e) {
        stage.close();
        stageSalida.close();
        Entrada entrada = new Entrada(stage, juego);
        Scene inicio = new Scene(entrada, 240, 100);
        stage.setScene(inicio);
        stage.show();
    }
}

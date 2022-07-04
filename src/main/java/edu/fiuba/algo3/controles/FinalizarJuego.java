package edu.fiuba.algo3.controles;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.Vehiculo;
import edu.fiuba.algo3.vista.Principal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FinalizarJuego implements EventHandler<ActionEvent> {
    private Stage stage;

    public FinalizarJuego(Stage stage){
        this.stage = stage;
    }
    public void handle(ActionEvent e) {
        stage.close();
    }
}

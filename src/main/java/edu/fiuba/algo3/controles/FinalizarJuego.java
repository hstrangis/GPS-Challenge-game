package edu.fiuba.algo3.controles;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class FinalizarJuego implements EventHandler<ActionEvent> {
    private Stage stage;

    public FinalizarJuego(){}
    public void handle(ActionEvent e) {
        System.exit(0);
    }
}

package edu.fiuba.algo3.controles;

import edu.fiuba.algo3.modelo.Auto;
import edu.fiuba.algo3.modelo.Vehiculo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SelectorAutoInicial implements EventHandler<ActionEvent> {
    private final Vehiculo vehiculo;

    public SelectorAutoInicial(Vehiculo vehiculo){
      this.vehiculo = vehiculo;
    }

    public void handle(ActionEvent e)
    {
        vehiculo.cambiarEstado(new Auto());
    }
}

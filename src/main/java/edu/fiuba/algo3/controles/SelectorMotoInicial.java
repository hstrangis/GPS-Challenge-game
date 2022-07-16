package edu.fiuba.algo3.controles;

import edu.fiuba.algo3.modelo.Moto;
import edu.fiuba.algo3.modelo.Vehiculo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SelectorMotoInicial implements EventHandler<ActionEvent> {
    private final Vehiculo vehiculo;

    public SelectorMotoInicial(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public void handle(ActionEvent e)
    {
        vehiculo.cambiarEstado(new Moto());
    }
}

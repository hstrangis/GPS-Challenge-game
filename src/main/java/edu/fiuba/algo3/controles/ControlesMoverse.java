package edu.fiuba.algo3.controles;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.vista.MovimientosVista;
import edu.fiuba.algo3.vista.VehiculoVista;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ControlesMoverse implements EventHandler<KeyEvent> {

    private Juego juego;
    private MovimientosVista movimientos;

    private VehiculoVista vehiculo;

    public ControlesMoverse(Juego juego, MovimientosVista movimientos, VehiculoVista vehiculo) {
        this.juego = juego;
        this.movimientos = movimientos;
        this.vehiculo = vehiculo;
    }

    public void handle(KeyEvent event) {

        try {
            if (event.getCode() == KeyCode.UP) {
                juego.moverse(new Norte());
            }
            if (event.getCode() == KeyCode.LEFT) {
                juego.moverse(new Oeste());
            }
            if (event.getCode() == KeyCode.DOWN) {
                juego.moverse(new Sur());
            }
            if (event.getCode() == KeyCode.RIGHT) {
                juego.moverse(new Este());
            }
            movimientos.actualizar();
            vehiculo.actualizar();
            event.consume();
        } catch (Exception e) {
            //Cant move exception
        }


    }

}


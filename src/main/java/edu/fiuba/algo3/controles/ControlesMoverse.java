package edu.fiuba.algo3.controles;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.vista.MapaVista;
import edu.fiuba.algo3.vista.MovimientosVista;
import edu.fiuba.algo3.vista.VehiculoVista;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ControlesMoverse implements EventHandler<KeyEvent> {

    private Juego juego;
    private MovimientosVista movimientos;

    private MapaVista mapa;

    public ControlesMoverse(Juego juego, MovimientosVista movimientos, MapaVista mapa) {
        this.juego = juego;
        this.movimientos = movimientos;
        this.mapa = mapa;
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
            mapa.actualizar();
            event.consume();
        } catch (Exception e) {
            //Cant move exception
        }


    }

}


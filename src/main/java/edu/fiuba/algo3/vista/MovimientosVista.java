package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Movimientos;
import javafx.scene.text.Text;

public class MovimientosVista extends Text {

    private Movimientos movimientos;

    MovimientosVista(Movimientos movimientos){
        this.movimientos = movimientos;
        this.setX(403);
        this.setY(40);
        String cartel = "Movimientos realizados: " + movimientos.cantidad();
        this.setText(cartel);
        this.setScaleX(1.5);
        this.setScaleY(1.5);
    }

    public void actualizar(){
        String cartel = "Movimientos realizados: " + movimientos.cantidad();
        this.setText(cartel);
    }

}

package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Movimientos;
import javafx.scene.text.Text;

public class MovimientosVista extends Text {

    private Movimientos movimientos;

    MovimientosVista(Movimientos movimientos, int x, int y){
        this.movimientos = movimientos;
        this.setX(403);
        this.setY(160);
        String cartel = "Movimientos realizados: " + Math.round(movimientos.cantidad()*100.0)/100.0;
        this.setText(cartel);
        this.setScaleX(1.5);
        this.setScaleY(1.5);
    }

    public void actualizar(){
        String cartel = "Movimientos realizados: " + Math.round(movimientos.cantidad()*100.0)/100.0;
        this.setText(cartel);
    }

}

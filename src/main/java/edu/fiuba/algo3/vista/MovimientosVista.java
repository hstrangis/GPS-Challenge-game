package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Movimientos;
import javafx.scene.text.Text;

public class MovimientosVista extends Text {

    private Movimientos movimientos;

    MovimientosVista(Movimientos movimientos, int x, int y){
        this.movimientos = movimientos;
        this.setX(360);
        this.setY(200);
        String cartel = "Movimientos realizados: " + movimientos.mostrar();
        this.setText(cartel);
    }

    public void actualizar(){
        String cartel = "Movimientos realizados: " + movimientos.mostrar();
        this.setText(cartel);
    }

}

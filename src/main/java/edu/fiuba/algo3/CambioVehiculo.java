package edu.fiuba.algo3;

import javafx.scene.image.Image;

public class CambioVehiculo extends Sorpresa{

    CambioVehiculo(Grafica diseño){
        this.diseño = diseño;
    };
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

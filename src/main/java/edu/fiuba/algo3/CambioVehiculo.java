package edu.fiuba.algo3;

public class CambioVehiculo extends Sorpresa{
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

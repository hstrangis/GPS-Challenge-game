package edu.fiuba.algo3.modelo;

public class Especial extends Sorpresa{


    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }

}

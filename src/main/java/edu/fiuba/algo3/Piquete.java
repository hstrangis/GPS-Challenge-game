package edu.fiuba.algo3;

public class Piquete extends Obstaculo{
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

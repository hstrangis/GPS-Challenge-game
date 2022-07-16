package edu.fiuba.algo3.modelo;

public class Pozo extends Obstaculo {

    public String nombre(){return "pozo";}
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

package edu.fiuba.algo3.modelo;


public class Piquete extends Obstaculo {

    public String nombre(){return "piquete";}
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

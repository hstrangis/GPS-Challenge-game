package edu.fiuba.algo3;

public class Piquete extends Obstaculo{
    public boolean interactuar(Vehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

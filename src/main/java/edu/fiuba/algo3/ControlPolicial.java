package edu.fiuba.algo3;

public class ControlPolicial extends Obstaculo {
    public boolean interactuar(Vehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

package edu.fiuba.algo3;


public class Moto extends Vehiculo{
    public boolean interactuar(Pozo pozo){
        movimientos += 3;
        return true;
    }

    public boolean interactuar(ControlPolicial control){
        return true;
    }

    public boolean interactuar(Piquete piquete){
        movimientos += 2;
        return true;
    }
}

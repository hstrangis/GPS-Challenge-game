package edu.fiuba.algo3;


public class Moto extends Vehiculo{
    @Override
    protected boolean interactuar(Pozo pozo){
        movimientos += 3;
        return true;
    }
    @Override
    protected boolean interactuar(ControlPolicial control){
        return true;
    }
    @Override
    protected boolean interactuar(Piquete piquete){
        movimientos += 2;
        return true;
    }
}

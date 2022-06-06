package edu.fiuba.algo3;

public class Auto extends Vehiculo {

    @Override
    protected boolean interactuar(Pozo pozo){
        movimientos += 3;
        return true;
    }
    @Override
    protected boolean interactuar(ControlPolicial control){
        if(control.probabilidadDetencion() < 0.5){
            movimientos += 3;
        }

        return true;
    }
    @Override
    protected boolean interactuar(Piquete piquete){
        return false;
    }
}

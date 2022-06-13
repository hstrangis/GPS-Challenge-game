package edu.fiuba.algo3;

public class Auto extends Vehiculo {

    Auto(){
        this.movimientos = 0;
    }
    Auto(double movimientos){
        this.movimientos = movimientos;
    }

    @Override
    public boolean interactuar(Pozo pozo){
        movimientos += 3;
        return true;
    }
    @Override
    public boolean interactuar(ControlPolicial control){
        if(control.probabilidadDetencion(0.5)){
            movimientos += 3;
        }
        return true;
    }
    @Override
    public boolean interactuar(Piquete piquete){
        return false;
    }

    public Vehiculo crearSiguiente(){
        return new CuatroxCuatro(movimientos);
    }
}

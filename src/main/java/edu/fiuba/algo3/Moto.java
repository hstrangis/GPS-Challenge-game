package edu.fiuba.algo3;


public class Moto extends Vehiculo{
    Moto(){
        this.movimientos = 0;
    }
    Moto(int movimientos){
        this.movimientos = movimientos;
    }
    @Override
    public boolean interactuar(Pozo pozo){
        movimientos += 3;
        return true;
    }
    @Override
    public boolean interactuar(ControlPolicial control){
        if(control.probabilidadDetencion(0.8)){
            movimientos += 3;
        }
        return true;
    }
    @Override
    public boolean interactuar(Piquete piquete){
        movimientos += 2;
        return true;
    }

    public Vehiculo crearSiguiente(){
        return new Auto(movimientos);
    }
}

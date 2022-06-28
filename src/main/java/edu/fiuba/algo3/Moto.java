package edu.fiuba.algo3;


import javafx.scene.image.Image;

public class Moto extends EstadoVehiculo {
    Moto(){}
    Moto(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    @Override
    public boolean interactuar(Pozo pozo){
        vehiculo.movimientos.sumar(3);
        return true;
    }
    @Override
    public boolean interactuar(ControlPolicial control){
        if(control.probabilidadDetencion(0.8)){
            vehiculo.movimientos.sumar(3);
        }
        return true;
    }
    @Override
    public boolean interactuar(Piquete piquete){
        vehiculo.movimientos.sumar(2);
        return true;
    }

    public EstadoVehiculo crearSiguiente(){
        return new Auto(vehiculo);
    }

    public String diseño(){ return "file:src\\main\\java\\edu\\fiuba\\algo3\\moto.png"; }
}

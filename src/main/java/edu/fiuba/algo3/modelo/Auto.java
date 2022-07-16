package edu.fiuba.algo3.modelo;

public class Auto extends EstadoVehiculo {

    public Auto(){}
    Auto(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    @Override
    public boolean interactuar(Pozo pozo){
        vehiculo.movimientos().sumar(3);
        return true;
    }
    @Override
    public boolean interactuar(ControlPolicial control){
        if(control.probabilidadDetencion(0.5)){
            vehiculo.movimientos().sumar(3);
        }
        return true;
    }
    @Override
    public boolean interactuar(Piquete piquete){
        return false;
    }

    public EstadoVehiculo crearSiguiente(){
        return new CuatroxCuatro(vehiculo);
    }

    public String nombre(){ return "auto"; }
}

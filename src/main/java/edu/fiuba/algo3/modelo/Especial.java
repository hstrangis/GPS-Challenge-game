package edu.fiuba.algo3.modelo;

public class Especial extends Sorpresa{
    public Especial(){};

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }

    //@Override
    //public String nombre(){return "moto";}
}

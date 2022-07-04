package edu.fiuba.algo3.modelo;

public class Desfavorable extends Sorpresa {

    public Desfavorable(){
    };
    public void interactuar(EstadoVehiculo vehiculo){
        vehiculo.interactuar(this);
    }

    public void actuar(Movimientos movimientos) {
        movimientos.multiplicar(1.25);
    }
}



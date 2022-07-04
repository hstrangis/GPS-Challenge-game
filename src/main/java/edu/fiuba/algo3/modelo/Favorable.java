package edu.fiuba.algo3.modelo;

public class Favorable extends Sorpresa {

    public Favorable(){
    };

    public void interactuar(EstadoVehiculo vehiculo){
        vehiculo.interactuar(this);
    }

    public void actuar(Movimientos movimientos) {
        movimientos.multiplicar(0.80);
    }

}

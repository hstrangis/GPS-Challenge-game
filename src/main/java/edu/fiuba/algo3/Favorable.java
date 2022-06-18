package edu.fiuba.algo3;

public class Favorable extends Sorpresa{

    Favorable(){};
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }

    public void actuar(Movimientos movimientos) {
        movimientos.multiplicar(0.80);
    }
}

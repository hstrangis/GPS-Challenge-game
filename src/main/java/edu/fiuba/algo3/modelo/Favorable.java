package edu.fiuba.algo3.modelo;

public class Favorable extends Sorpresa {

    public Favorable(){
    };

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }

    public void actuar(Movimientos movimientos) {
        movimientos.multiplicar(0.80);
    }

}

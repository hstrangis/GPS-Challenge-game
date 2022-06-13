package edu.fiuba.algo3;

public class Favorable extends Sorpresa{
    public boolean interactuar(Vehiculo vehiculo){
        return vehiculo.interactuar(this);
    }

    public double actuar(double movimientos) {
        movimientos = movimientos * 0.80;
        return movimientos;
    }
}

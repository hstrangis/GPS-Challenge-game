package edu.fiuba.algo3;

public class Desfavorable extends Sorpresa{
    public boolean interactuar(Vehiculo vehiculo){
        return vehiculo.interactuar(this);
    }

    public double actuar(double movimientos) {
        movimientos = movimientos * 1.25;
        return movimientos;
    }
}



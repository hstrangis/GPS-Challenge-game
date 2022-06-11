package edu.fiuba.algo3;

public class Desfavorable extends Sorpresa{
    public boolean interactuar(Vehiculo vehiculo){
        return vehiculo.interactuar(this);
    }

    public int actuar(int movimientos) {
        movimientos = (int) Math.round(movimientos * 1.25);
        return movimientos;
    }
}



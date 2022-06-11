package edu.fiuba.algo3;

public class Favorable extends Sorpresa{
    public boolean interactuar(Vehiculo vehiculo){
        return vehiculo.interactuar(this);
    }

    public int actuar(int movimientos) {
        movimientos = (int) Math.round(movimientos * 0.80);
        return movimientos;
    }
}

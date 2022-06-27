package edu.fiuba.algo3;

public class Desfavorable extends Sorpresa{

    Desfavorable(Grafica diseño){
        this.diseño = diseño;
    };
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }

    public void actuar(Movimientos movimientos) {
        movimientos.multiplicar(1.25);
    }
}


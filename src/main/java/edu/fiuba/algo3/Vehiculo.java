
package edu.fiuba.algo3;


public abstract class Vehiculo {
    protected int movimientos;

    protected Jugador conductor;

    public void agregarConductor(Jugador jugador){
        conductor = jugador;
    }
    public void moverse(){
        movimientos += 1;
    }
    protected boolean interactuar(Favorable favorable){
        movimientos = favorable.actuar(movimientos);
        return true;
    }
    protected boolean interactuar(Desfavorable desfavorable){
        movimientos = desfavorable.actuar(movimientos);
        return true;
    }
    protected boolean interactuar(CambioVehiculo cambioVehiculo){
        conductor.cambiarVehiculo();
        return true;
    }
    protected abstract boolean interactuar(Pozo pozo);
    protected abstract boolean interactuar(ControlPolicial control);
    protected abstract boolean interactuar(Piquete piquete);
    protected abstract Vehiculo crearSiguiente();

}

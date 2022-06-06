
package edu.fiuba.algo3;

import java.util.HashMap;

public abstract class Vehiculo {
    protected int movimientos;
    public void moverse(){
        movimientos += 1;
    }
    protected abstract boolean interactuar(Pozo pozo);
    protected abstract boolean interactuar(ControlPolicial control);
    protected abstract boolean interactuar(Piquete piquete);

}

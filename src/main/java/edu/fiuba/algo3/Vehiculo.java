
package edu.fiuba.algo3;


public abstract class Vehiculo {
    protected int movimientos;
    public void moverse(){
        movimientos += 1;
    }
    public boolean interactuar(Elemento elemento){return true;}
    public boolean interactuar(Obstaculo elemento){return true;}
    protected abstract boolean interactuar(Pozo elemento);
    protected abstract boolean interactuar(ControlPolicial elemento);
    protected abstract boolean interactuar(Piquete elemento);

}

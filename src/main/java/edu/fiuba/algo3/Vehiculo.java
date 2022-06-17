
package edu.fiuba.algo3;


public class Vehiculo {
    protected Movimientos movimientos;
    protected EstadoVehiculo estado;

    Vehiculo(EstadoVehiculo estado){
        this.estado = estado;
        estado.configurar(this);
        movimientos = new Movimientos();
    }

    public void moverse(){
        movimientos.sumar(1);
    }
    public boolean interactuar(Elemento elemento){
        return elemento.interactuar(estado);
    }
    public void cambiarEstado(EstadoVehiculo estadoNuevo){
        estado = estadoNuevo;
    }

}

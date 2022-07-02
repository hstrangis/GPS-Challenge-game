
package edu.fiuba.algo3.modelo;


public class Vehiculo {
    protected Movimientos movimientos;
    private EstadoVehiculo estado;

    public Vehiculo(EstadoVehiculo estado, Movimientos movimientos){
        this.estado = estado;
        estado.configurar(this);
        this.movimientos = movimientos;
    }

    public Vehiculo(EstadoVehiculo estado){
        this.estado = estado;
        estado.configurar(this);
        movimientos = new Movimientos();
    }

    public void moverse(){
        movimientos.sumar(1);
    }

    public boolean interactuar(Elemento elemento){
        boolean permisoParaPasar = elemento.interactuar(estado);
        return permisoParaPasar;
    }
    public void cambiarEstado(EstadoVehiculo estadoNuevo){
        estado = estadoNuevo;
        estado.configurar(this);
    }

    public String estado(){return estado.diseño();}

}

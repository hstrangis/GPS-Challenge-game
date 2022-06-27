
package edu.fiuba.algo3;


import javafx.scene.Group;

public class Vehiculo {
    protected Movimientos movimientos;
    protected EstadoVehiculo estado;
    private Grafica diseño;

    Vehiculo(EstadoVehiculo estado, Movimientos movimientos, Grafica diseño){
        this.estado = estado;
        estado.configurar(this);
        this.movimientos = movimientos;
        this.diseño = diseño;
    }

    Vehiculo(EstadoVehiculo estado){
        this.estado = estado;
        estado.configurar(this);
        movimientos = new Movimientos();
    }

    public void moverse(){
        movimientos.sumar(1);
    }

    public void moverGrafica(Sentido sentido){
        diseño.moverse(sentido);
    }
    public boolean interactuar(Elemento elemento){
        boolean permisoParaPasar = elemento.interactuar(estado);
        return permisoParaPasar;
    }
    public void cambiarEstado(EstadoVehiculo estadoNuevo){
        estado = estadoNuevo;
        diseño.cambiarDiseño(estado.diseño());
    }

    public void implementarGrafica(int x, int y, Group root){
        diseño.configurarGrafica(root);
        diseño.ubicar(x, y);
        diseño.cambiarDiseño(estado.diseño());
    }

}

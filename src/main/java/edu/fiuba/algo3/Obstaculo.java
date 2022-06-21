package edu.fiuba.algo3;

import javafx.scene.image.Image;

abstract class Obstaculo implements Elemento{

    protected GraficaElemento diseño;
    Obstaculo(){};

    public boolean sosEliminable(){
        return false;
    }
    abstract public void agregarGrafica(GraficaElemento diseño);
    abstract public boolean interactuar(EstadoVehiculo vehiculo);
}

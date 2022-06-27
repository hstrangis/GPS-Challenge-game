package edu.fiuba.algo3;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract class Obstaculo implements Elemento{

    protected Grafica diseño;
    Obstaculo(){};

    public boolean sosEliminable(){
        return false;
    }
    abstract public void implementarGrafica();
    abstract public boolean interactuar(EstadoVehiculo vehiculo);

    public void moverGrafica(Sentido sentido){
        diseño.moverse(sentido);
    }

    public Grafica grafica(){
        return diseño;
    }
}

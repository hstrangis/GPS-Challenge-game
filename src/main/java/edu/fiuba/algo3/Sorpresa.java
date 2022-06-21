package edu.fiuba.algo3;

import javafx.scene.image.Image;

abstract class Sorpresa implements Elemento {

    private GraficaElemento diseño;

    Sorpresa(){};

    public void agregarGrafica(GraficaElemento diseño){
        this.diseño = diseño;
        diseño.cambiarDiseño(new Image("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\sorpresa.png"));
    }

    public boolean sosEliminable(){
        return true;
    }

    abstract public boolean interactuar(EstadoVehiculo vehiculo);
}


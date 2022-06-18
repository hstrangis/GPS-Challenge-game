package edu.fiuba.algo3;

import javafx.scene.image.Image;

public class Pozo extends Obstaculo {
    Pozo(){};

    public void agregarGrafica(GraficaElemento diseño){
        this.diseño = diseño;
        diseño.cambiarDiseño(new Image("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\pozo.png"));
    }

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

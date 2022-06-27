package edu.fiuba.algo3;

import javafx.scene.image.Image;

public class Pozo extends Obstaculo {
    Pozo(Grafica diseño){
        this.diseño = diseño;
    };
    public void implementarGrafica(){
        diseño.cambiarDiseño("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\pozo.png");
    }

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

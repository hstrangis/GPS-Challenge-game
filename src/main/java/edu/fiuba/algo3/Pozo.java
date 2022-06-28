package edu.fiuba.algo3;

import javafx.scene.Group;
import javafx.scene.image.Image;

public class Pozo extends Obstaculo {
    Pozo(Grafica diseño){
        this.diseño = diseño;
    };
    public void implementarGrafica(int x, int y, Group root){
        diseño.configurarGrafica(root);
        diseño.ubicar(x, y);
        diseño.cambiarDiseño("file:src\\main\\java\\edu\\fiuba\\algo3\\pozo.png");
    }

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

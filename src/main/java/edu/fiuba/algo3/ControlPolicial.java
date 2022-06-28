package edu.fiuba.algo3;
import javafx.scene.Group;
import javafx.scene.image.Image;

import java.util.Random;

public class ControlPolicial extends Obstaculo {

    ControlPolicial(Grafica diseño){
        this.diseño = diseño;
    };

    public void implementarGrafica(int x, int y, Group root){
        diseño.configurarGrafica(root);
        diseño.ubicar(x, y);
        diseño.cambiarDiseño("file:src\\main\\java\\edu\\fiuba\\algo3\\controlPolicial.png");
    }
    public boolean probabilidadDetencion(double probabilidad) {
        Random numeroAleatorio = new Random();
        return (numeroAleatorio.nextDouble() < probabilidad);
    }

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

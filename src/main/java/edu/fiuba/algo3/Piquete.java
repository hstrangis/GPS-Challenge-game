package edu.fiuba.algo3;

import javafx.scene.Group;
import javafx.scene.image.Image;

public class Piquete extends Obstaculo{
    Piquete(Grafica diseño){
        this.diseño = diseño;
    };

    public void implementarGrafica(int x, int y, Group root){
        diseño.configurarGrafica(root);
        diseño.ubicar(x, y);
        diseño.cambiarDiseño("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\piquete.png");
    }

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

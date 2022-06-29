package edu.fiuba.algo3;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract class Sorpresa implements Elemento {

    protected Grafica diseño;

    public boolean sosEliminable(){
        diseño.eliminarDiseño();
        return true;
    }

    abstract public boolean interactuar(EstadoVehiculo vehiculo);

    public void implementarGrafica(int x, int y, Group root){
        diseño.configurarGrafica(root);
        diseño.ubicar(x, y);
        diseño.cambiarDiseño("file:src\\main\\java\\edu\\fiuba\\algo3\\sorpresa.png");
    }

    public void moverGrafica(Sentido sentido){
        diseño.moverse(sentido);
    }
}


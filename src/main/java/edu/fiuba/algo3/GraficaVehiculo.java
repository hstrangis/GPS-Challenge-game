package edu.fiuba.algo3;

import javafx.scene.image.ImageView;

public class GraficaVehiculo extends Grafica{

    GraficaVehiculo(ImageView skin){
        this.skin = skin;
        this.skin.setFitHeight(40);
        this.skin.setFitWidth(60);
    }
    public void moverse(Sentido sentido){
        sentido.moverGraficaVehiculo(this);
    }


}

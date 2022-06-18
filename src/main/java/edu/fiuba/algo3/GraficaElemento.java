package edu.fiuba.algo3;

import javafx.scene.image.ImageView;

public class GraficaElemento extends Grafica{

    GraficaElemento(ImageView skin){
        this.skin = skin;
        this.skin.setFitHeight(30);
        this.skin.setFitWidth(50);
    }
    public void moverse(Sentido sentido){
        sentido.moverGraficaElemento(this);
    }
}

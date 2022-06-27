package edu.fiuba.algo3;

import javafx.scene.image.ImageView;

public class GraficaElemento extends Grafica{

    GraficaElemento(){
        ImageView imageView = new ImageView();
        skin = imageView;
        cambiarTamaño(25, 35);
    }
    public void moverse(Sentido sentido){
        sentido.moverGraficaElemento(this);
    }
}

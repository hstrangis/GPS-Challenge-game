package edu.fiuba.algo3;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GraficaVacia extends Grafica{

    GraficaVacia(){
        ImageView imageView = new ImageView();
        skin = imageView;
    }
    @Override
    public void cambiarDiseño(String direccion){}

    public void moverse(Sentido sentido){}
}

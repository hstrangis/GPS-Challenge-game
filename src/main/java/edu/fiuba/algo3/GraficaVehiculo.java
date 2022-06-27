package edu.fiuba.algo3;

import javafx.scene.image.ImageView;

public class GraficaVehiculo extends Grafica{

    GraficaVehiculo(){
        ImageView imageView = new ImageView();
        skin = imageView;
        cambiarTamaño(35,40);
    }

    public void moverse(Sentido sentido){
        sentido.moverGraficaVehiculo(this);
    }


}

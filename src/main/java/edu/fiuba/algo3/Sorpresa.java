package edu.fiuba.algo3;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract class Sorpresa implements Elemento {

    protected Grafica diseño;

    public boolean sosEliminable(){
        diseño.eliminarDiseño();
        return true;
    }

    abstract public boolean interactuar(EstadoVehiculo vehiculo);

    public void implementarGrafica(){
        diseño.cambiarDiseño("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\sorpresa.png");
    }

    public Grafica grafica(){
        return diseño;
    }
    public void moverGrafica(Sentido sentido){
        diseño.moverse(sentido);
    }


}


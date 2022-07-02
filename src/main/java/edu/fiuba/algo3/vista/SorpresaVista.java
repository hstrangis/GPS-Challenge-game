package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Sorpresa;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static edu.fiuba.algo3.vista.MapaVista.*;


public class SorpresaVista extends ImageView {

    private Sorpresa sorpresa;

    SorpresaVista(Sorpresa sorpresa){
       this.sorpresa = sorpresa;
        Image diseño = new Image(sorpresa.nombre());
        this.setImage(diseño);
        this.setFitHeight(35);
        this.setFitWidth(35);
        this.setX(INICIAL_X + sorpresa.coordenadaX()*DISTANCIA_PUNTOS);
        this.setY(INICIAL_Y + sorpresa.coordenadaY()*DISTANCIA_PUNTOS);
    }
}
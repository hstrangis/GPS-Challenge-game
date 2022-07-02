package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Meta;
import edu.fiuba.algo3.modelo.Sentido;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MetaVista extends ImageView {

    private Meta meta;
    MetaVista(Meta meta){
        this.meta = meta;
        Image diseño = new Image("file:src\\main\\java\\edu\\fiuba\\algo3\\meta.png");
        this.setImage(diseño);
        this.setFitHeight(75);
        this.setFitWidth(65);
        this.setX(273 + meta.coordenadaX()*122);
        this.setY(315 + meta.coordenadaY()*122);
    }
}

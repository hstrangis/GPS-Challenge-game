package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Meta;
import edu.fiuba.algo3.modelo.Sentido;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static edu.fiuba.algo3.vista.MapaVista.DISTANCIA_PUNTOS;

public class MetaVista extends ImageView {

    private Meta meta;
    MetaVista(Meta meta){
        this.meta = meta;
        Image diseño = new Image("file:src\\main\\java\\resources\\meta.png");
        this.setImage(diseño);
        this.setFitHeight(75);
        this.setFitWidth(65);
        this.setX(243 + meta.coordenadaX()*DISTANCIA_PUNTOS);
        this.setY(230 + meta.coordenadaY()*DISTANCIA_PUNTOS);
    }
}

package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Obstaculo;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static edu.fiuba.algo3.vista.MapaVista.*;


public class ObstaculoVista extends ImageView {

    ObstaculoVista(Obstaculo obstaculo){
        Image diseño = new Image("file:src\\main\\java\\resources\\" + obstaculo.nombre() + ".png");
        this.setImage(diseño);
        this.setFitHeight(35);
        this.setFitWidth(35);
        this.setX(INICIAL_X + obstaculo.coordenadaX()*DISTANCIA_PUNTOS);
        this.setY(INICIAL_Y + obstaculo.coordenadaY()*DISTANCIA_PUNTOS);
    }
}

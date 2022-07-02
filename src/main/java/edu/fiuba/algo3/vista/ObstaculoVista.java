package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Obstaculo;
import edu.fiuba.algo3.modelo.Sorpresa;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static edu.fiuba.algo3.vista.MapaVista.*;


public class ObstaculoVista extends ImageView {

    private Obstaculo obstaculo;

    ObstaculoVista(Obstaculo obstaculo){
        this.obstaculo = obstaculo;
        Image diseño = new Image(obstaculo.nombre());
        this.setImage(diseño);
        this.setFitHeight(35);
        this.setFitWidth(35);
        this.setX(INICIAL_X + obstaculo.coordenadaX()*DISTANCIA_PUNTOS);
        this.setY(INICIAL_Y + obstaculo.coordenadaY()*DISTANCIA_PUNTOS);
    }
}

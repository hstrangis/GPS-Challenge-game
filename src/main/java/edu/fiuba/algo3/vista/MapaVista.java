package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Ciudad;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class MapaVista extends Group {
    static final int INICIAL_X = 293;
    static final int INICIAL_Y = 329;

    static final int DISTANCIA_PUNTOS = 122;
    MapaVista(int largo, int ancho){
        for (int fila = 0; fila < largo; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                this.getChildren().add(new Rectangle(210 + columna*120, 250 + fila*120, 80,80));
            }
        }
    }


}

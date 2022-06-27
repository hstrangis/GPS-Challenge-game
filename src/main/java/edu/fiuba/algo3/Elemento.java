package edu.fiuba.algo3;

import javafx.scene.Group;
import javafx.scene.image.ImageView;

public interface Elemento {
    boolean interactuar(EstadoVehiculo vehiculo);
    boolean sosEliminable();
    void moverGrafica(Sentido sentido);
    void implementarGrafica(int x, int y, Group root);
}

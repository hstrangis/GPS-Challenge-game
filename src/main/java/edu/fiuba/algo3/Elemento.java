package edu.fiuba.algo3;

import javafx.scene.image.ImageView;

public interface Elemento {
    boolean interactuar(EstadoVehiculo vehiculo);
    boolean sosEliminable();
    Grafica grafica();
    void moverGrafica(Sentido sentido);

    void implementarGrafica();
}

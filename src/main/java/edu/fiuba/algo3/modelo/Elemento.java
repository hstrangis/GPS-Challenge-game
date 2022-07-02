package edu.fiuba.algo3.modelo;

import javafx.scene.Group;

public interface Elemento {
    boolean interactuar(EstadoVehiculo vehiculo);
    boolean sosEliminable();

    void agregarCoordenadas(double x, double y, Sentido sentido);

}

package edu.fiuba.algo3;

public interface Elemento {
    boolean interactuar(EstadoVehiculo vehiculo);
    void agregarGrafica(GraficaElemento diseño);

    boolean sosEliminable();
}

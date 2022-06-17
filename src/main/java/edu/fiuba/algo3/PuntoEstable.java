package edu.fiuba.algo3;

public interface PuntoEstable {

    void agregarCuadra(Cuadra cuadra, Sentido sentido) ;
    boolean validarSentido(Sentido sentido);
    PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo);
}

package edu.fiuba.algo3;

public interface PuntoEstable {
    void agregarCuadra(Cuadra cuadra, int i) ;
    boolean validarSentido(Sentido sentido);
    PuntoEstable siguienteCruce(Sentido sentido, Vehiculo vehiculo);
}

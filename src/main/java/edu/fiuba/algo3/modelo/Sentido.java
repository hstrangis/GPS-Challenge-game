package edu.fiuba.algo3.modelo;




public abstract class Sentido {
    static final double MOVER_ELEMENTO = 0.25;
    static final int MOVER_PUNTO = 1;

    static final int SIN_MOVER = 0;
    public enum Direccion {izquierda, derecha}
    public abstract String clave();
    public abstract Direccion cuadra();
    public abstract Direccion volver();
    public boolean validar(Sentido sentido) {
        return (clave().equals(sentido.clave()));
    }
    abstract public void modificarCoordenada(Coordenada coordenada);
    abstract public void modificarCoordenadaElemento(Coordenada coordenada, double posicion);

}

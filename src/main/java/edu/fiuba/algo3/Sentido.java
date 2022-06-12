package edu.fiuba.algo3;


public abstract class Sentido {
    public enum Direccion {izquierda, derecha};
    public abstract String clave();
    public abstract Direccion cuadra();
    public abstract Direccion volver();
    public boolean validar(Sentido sentido) {
        return (clave().equals(sentido.clave()));
    }
}

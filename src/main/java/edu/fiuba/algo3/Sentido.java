package edu.fiuba.algo3;


public abstract class Sentido {
    public abstract int cuadra();
    public abstract int cruce();
    public abstract int volver();

    public abstract boolean validar(int direccion);

    public static final int izquierda = 0;
    public static final int derecha = 1;


}

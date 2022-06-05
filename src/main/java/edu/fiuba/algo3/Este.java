package edu.fiuba.algo3;

public class Este extends Sentido {
    public static final int este = 2;
    public int cuadra(){
        return derecha;
    }
    public int cruce(){
        return este;
    }
    public int volver(){
        return izquierda;
    }
    public boolean validar(int direccion){
        return (direccion == este);
    }
}

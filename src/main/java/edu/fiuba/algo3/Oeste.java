package edu.fiuba.algo3;

public class Oeste extends Sentido{
    public static final int oeste = 0;
    public int cuadra(){
        return izquierda;
    }
    public int cruce(){
        return oeste;
    }
    public int volver(){
        return derecha;
    }
    public boolean validar(int direccion){
        return (direccion == oeste);
    }
}

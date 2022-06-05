package edu.fiuba.algo3;


public class Norte extends Sentido {
    public static final int norte = 1;
    public int cuadra(){
        return izquierda;
    }
    public int cruce(){
        return norte;
    }
    public int volver(){
        return derecha;
    }
    public boolean validar(int direccion){
        return (direccion == norte);
    }
}

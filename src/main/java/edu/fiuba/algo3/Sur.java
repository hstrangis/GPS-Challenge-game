package edu.fiuba.algo3;

public class Sur extends Sentido{
    public static final int sur = 3;
    public int cuadra(){
        return derecha;
    }
    public int cruce(){
        return sur;
    }
    public int volver(){
        return izquierda;
    }

    public boolean validar(int direccion){
        return (direccion == sur);
    }
}

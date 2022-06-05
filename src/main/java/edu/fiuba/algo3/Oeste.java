package edu.fiuba.algo3;

import static edu.fiuba.algo3.Sentido.derecha;
import static edu.fiuba.algo3.Sentido.izquierda;

public class Oeste {
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

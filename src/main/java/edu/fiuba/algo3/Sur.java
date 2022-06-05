package edu.fiuba.algo3;

import static edu.fiuba.algo3.Sentido.derecha;
import static edu.fiuba.algo3.Sentido.izquierda;

public class Sur {
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

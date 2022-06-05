package edu.fiuba.algo3;

import static edu.fiuba.algo3.Sentido.derecha;
import static edu.fiuba.algo3.Sentido.izquierda;

public class Este {
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

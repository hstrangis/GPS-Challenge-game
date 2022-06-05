package edu.fiuba.algo3;

import static edu.fiuba.algo3.Sentido.derecha;
import static edu.fiuba.algo3.Sentido.izquierda;

public class Norte {
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

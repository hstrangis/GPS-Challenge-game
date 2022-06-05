package edu.fiuba.algo3;

import static edu.fiuba.algo3.Sentido.derecha;
import static edu.fiuba.algo3.Sentido.izquierda;

public class Cuadra {
    private PuntoEstable[] cruces;
    private Elemento[] elementos;

    Cuadra(PuntoEstable izquierdo, PuntoEstable derecho){
        cruces = new PuntoEstable[2];
        cruces[izquierda] = izquierdo;
        cruces[derecha] = derecho;
    }

    public PuntoEstable siguienteCruce(Sentido sentido, Vehiculo vehiculo) {
        PuntoEstable siguientePosicion;
        vehiculo.moverse();
        if (interactuar(vehiculo))
            siguientePosicion = cruces[sentido.cuadra()];
        else
            siguientePosicion = cruces[sentido.volver()];
        return siguientePosicion;
    }

    private boolean interactuar(Vehiculo vehiculo){
        boolean permisoParaPasar = true;
        for(int x=0;  x < elementos.length; x++){
            if (!vehiculo.interactuar(elementos[x])){
                permisoParaPasar = false;
            }
        }
        return permisoParaPasar;
    }
}

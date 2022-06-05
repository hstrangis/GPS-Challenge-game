package edu.fiuba.algo3;

import java.util.*;

import static edu.fiuba.algo3.Sentido.derecha;
import static edu.fiuba.algo3.Sentido.izquierda;

public class Cuadra {
    private PuntoEstable[] cruces;
    private List<Elemento> elementos;

    Cuadra(PuntoEstable izquierdo, PuntoEstable derecho){
        cruces = new PuntoEstable[2];
        cruces[izquierda] = izquierdo;
        cruces[derecha] = derecho;
        elementos = new ArrayList<Elemento>();
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

    private boolean interactuar(Vehiculo vehiculo) {
        boolean permisoParaPasar = true;

        for (Elemento elemento : elementos) {
            if (!vehiculo.interactuar(elemento)) {
                permisoParaPasar = false;
                break;
            }
        }
        return permisoParaPasar;
    }
    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }
}

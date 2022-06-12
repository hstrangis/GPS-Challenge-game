package edu.fiuba.algo3;

import java.util.*;
import static edu.fiuba.algo3.Sentido.Direccion;

public class Cuadra {
    private PuntoEstable[] cruces;
    private List<Elemento> elementos;

    Cuadra() {
        cruces = new PuntoEstable[2];
        elementos = new ArrayList<>();
    }

    Cuadra(PuntoEstable izquierdo, PuntoEstable derecho){
        cruces = new PuntoEstable[2];
        cruces[Direccion.izquierda.ordinal()] = izquierdo;
        cruces[Direccion.derecha.ordinal()] = derecho;
        elementos = new ArrayList<Elemento>();
    }

    public PuntoEstable siguientePunto(Sentido sentido, Jugador jugador) {
        PuntoEstable siguientePosicion;
        if (interactuar(jugador))
            siguientePosicion = cruces[sentido.cuadra().ordinal()];
        else
            siguientePosicion = cruces[sentido.volver().ordinal()];
        return siguientePosicion;
    }

    private boolean interactuar(Jugador jugador) {
        boolean permisoParaPasar = true;
        for (Elemento elemento : elementos) {
            if (!jugador.interactuar(elemento)) {
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

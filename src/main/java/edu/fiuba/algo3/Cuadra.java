package edu.fiuba.algo3;

import java.util.*;
import java.util.ListIterator;
import static edu.fiuba.algo3.Sentido.Direccion;

public class Cuadra {
    private Hashtable<Direccion, PuntoEstable> cruces;
    private List<Elemento> elementos;

    Cuadra(PuntoEstable izquierdo, PuntoEstable derecho){
        cruces = new Hashtable<>();
        cruces.put(Direccion.izquierda, izquierdo);
        cruces.put(Direccion.derecha, derecho);
        elementos = new ArrayList<>();
    }

    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo) {
        PuntoEstable siguientePosicion;
        if (interactuar(vehiculo)) {
            siguientePosicion = cruces.get(sentido.cuadra());
            //vehiculo.actualizarGrafica(sentido);
        }
        else
            siguientePosicion = cruces.get(sentido.volver());
        return siguientePosicion;
    }

    private boolean interactuar(Vehiculo vehiculo) {
        boolean permisoParaPasar = true;
        ListIterator<Elemento> iter = elementos.listIterator();
        while (iter.hasNext()){
            Elemento elemento = iter.next();
            if (!vehiculo.interactuar(elemento)) {
                permisoParaPasar = false;
                break;
            }
            if (elemento.sosEliminable()){
                iter.remove();
            }
        }
        return permisoParaPasar;
    }
    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }
}

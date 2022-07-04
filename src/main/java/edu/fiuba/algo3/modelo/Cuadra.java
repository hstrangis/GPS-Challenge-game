package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.ListIterator;
import static edu.fiuba.algo3.modelo.Sentido.Direccion;

public class Cuadra {
    private Hashtable<Direccion, PuntoEstable> cruces;
    private List<Obstaculo> obstaculos;
    private List<Sorpresa> sorpresas;

    Cuadra(PuntoEstable izquierdo, PuntoEstable derecho){
        cruces = new Hashtable<>();
        cruces.put(Direccion.izquierda, izquierdo);
        cruces.put(Direccion.derecha, derecho);
        obstaculos = new ArrayList<>();
        sorpresas = new ArrayList<>();
    }

    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo) {
        PuntoEstable siguientePosicion;
        boolean permiso;

        if (sentido.cuadra() == Direccion.izquierda) {
            interactuarSorpresa(vehiculo);
            permiso = interactuarObstaculo(vehiculo);
        }
        else {
            permiso = interactuarObstaculo(vehiculo);
            if(permiso) {
                interactuarSorpresa(vehiculo);
            }
        }
        if (permiso) {
            siguientePosicion = cruces.get(sentido.cuadra());
        }
        else
            siguientePosicion = cruces.get(sentido.volver());
        return siguientePosicion;
    }

    private boolean interactuarObstaculo(Vehiculo vehiculo) {
        boolean permisoParaPasar = true;
        ListIterator<Obstaculo> iter = obstaculos.listIterator();
        while (iter.hasNext()){
            Obstaculo obstaculo = iter.next();
            if (!vehiculo.interactuarObstaculo(obstaculo)) {
                permisoParaPasar = false;
                break;
            }
        }
        return permisoParaPasar;
    }

    private void interactuarSorpresa(Vehiculo vehiculo) {
        ListIterator<Sorpresa> iter = sorpresas.listIterator();
        while (iter.hasNext()){
            Sorpresa sorpresa = iter.next();
            vehiculo.interactuarSorpresa(sorpresa);
            iter.remove();
        }
    }
    public void agregarObstaculo(Obstaculo obstaculo) {
        obstaculos.add(obstaculo);
    }
    public void agregarSorpresa(Sorpresa sorpresa) {
        sorpresas.add(sorpresa);
    }

}

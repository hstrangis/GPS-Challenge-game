package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.ListIterator;
import static edu.fiuba.algo3.modelo.Sentido.Direccion;

public class Cuadra {
    static final double DESAPARECER = 100000000;

    static final int MAX_ELEMENTOS = 3;
    static final Sentido ARRIBA = new Norte();
    private final Hashtable<Direccion, PuntoEstable> cruces;
    private final List<Obstaculo> obstaculos;
    private final List<Sorpresa> sorpresas;

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
        permiso = interactuar(vehiculo, sentido);
        if (permiso) {
            siguientePosicion = cruces.get(sentido.cuadra());
        }
        else
            siguientePosicion = cruces.get(sentido.volver());
        return siguientePosicion;
    }

    private boolean interactuarObstaculo(Vehiculo vehiculo) {
        boolean permisoParaPasar = true;
        for (Obstaculo obstaculo: obstaculos) {
            if (!vehiculo.interactuarObstaculo(obstaculo)) {
                permisoParaPasar = false;
                break;
            }
        }
        return permisoParaPasar;
    }

    private boolean interactuarSorpresa(Vehiculo vehiculo) {
        boolean permisoParaPasar = true;
        ListIterator<Sorpresa> iter = sorpresas.listIterator();
        while (iter.hasNext()){
            Sorpresa sorpresa = iter.next();
            sorpresa.actualizarCoordenada(ARRIBA, DESAPARECER);
            iter.remove();
            if (!vehiculo.interactuarSorpresa(sorpresa)) {
                permisoParaPasar = false;
                break;
            }
        }
        return permisoParaPasar;
    }
    public void agregarObstaculo(Obstaculo obstaculo, Sentido sentido) {
        double cantidadElementos = obstaculos.size();
        if (cantidadElementos < MAX_ELEMENTOS) {

            obstaculos.add(obstaculo);
            obstaculo.actualizarCoordenada(sentido, cantidadElementos + 1);
        }
        else{
            obstaculo.actualizarCoordenada(ARRIBA, DESAPARECER);
        }
    }
    public void agregarSorpresa(Sorpresa sorpresa, Sentido sentido) {
        double cantidadElementos = obstaculos.size() + sorpresas.size();
        if (cantidadElementos < MAX_ELEMENTOS) {
            sorpresas.add(sorpresa);
            sorpresa.actualizarCoordenada(sentido, cantidadElementos + 1);
        }
        else{
            sorpresa.actualizarCoordenada(ARRIBA, DESAPARECER);
        }
    }

    public boolean interactuar(Vehiculo vehiculo, Sentido sentido){
        boolean permiso = false;
        if (sentido.cuadra() == Direccion.izquierda) {
            Collections.reverse(sorpresas);
            Collections.reverse(obstaculos);
            if ( interactuarSorpresa(vehiculo) )
             permiso = interactuarObstaculo(vehiculo);
            Collections.reverse(obstaculos);
        }
        else {
            if( interactuarObstaculo(vehiculo) ) {
                permiso = interactuarSorpresa(vehiculo);
            }
        }
        return permiso;
    }

}

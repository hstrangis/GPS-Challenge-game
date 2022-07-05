package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.ListIterator;
import static edu.fiuba.algo3.modelo.Sentido.Direccion;

public class Cuadra {
    static final double DESAPARECER = 100000000;
    static final Sentido ARRIBA = new Norte();
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
            sorpresa.actualizarCoordenada(ARRIBA, DESAPARECER);
            iter.remove();
        }
    }
    public void agregarObstaculo(Obstaculo obstaculo, Sentido sentido) {
        double cantidadElementos = obstaculos.size();
        if (cantidadElementos<3) {
            obstaculos.add(obstaculo);
            obstaculo.actualizarCoordenada(sentido, cantidadElementos + 1);
        }
        else{
            obstaculo.actualizarCoordenada(ARRIBA, DESAPARECER);
        }
    }
    public void agregarSorpresa(Sorpresa sorpresa, Sentido sentido) {
        double cantidadElementos = obstaculos.size() + sorpresas.size();
        if (cantidadElementos<3) {
            sorpresas.add(sorpresa);
            sorpresa.actualizarCoordenada(sentido, cantidadElementos + 1);
        }
        else{
            sorpresa.actualizarCoordenada(ARRIBA, DESAPARECER);
        }
    }

    public boolean interactuar(Vehiculo vehiculo, Sentido sentido){
        boolean permiso;
        if (sentido.cuadra() == Direccion.izquierda) {
            Collections.reverse(sorpresas);
            Collections.reverse(obstaculos);
            interactuarSorpresa(vehiculo);
            permiso = interactuarObstaculo(vehiculo);
            Collections.reverse(obstaculos);
        }
        else {
            permiso = interactuarObstaculo(vehiculo);
            if(permiso) {
                interactuarSorpresa(vehiculo);
            }
        }
        return permiso;
    }

}

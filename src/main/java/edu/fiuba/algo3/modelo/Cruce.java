package edu.fiuba.algo3.modelo;

import java.util.Hashtable;

public class Cruce extends PuntoEstable {

    private Hashtable<String, Cuadra> cuadras;
    Cruce(int x, int y) {
        super(x, y);
        cuadras = new Hashtable<>();
    }
    public boolean validarSentido(Sentido sentido){
        return true;
    }
    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo){
        Cuadra cuadra = cuadras.get(sentido.clave());
        return cuadra.siguientePunto(sentido, vehiculo);
    }

    public void agregarCuadra(Cuadra cuadra, Sentido sentido) {
        cuadras.put(sentido.clave(), cuadra);
    }
    public void agregarElemento(Elemento elemento, Sentido sentido) {
        cuadras.get(sentido.clave()).agregarElemento(elemento);
    }
    public void llegadaJugador(){}
}

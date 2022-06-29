package edu.fiuba.algo3;
import java.util.Hashtable;

public class Cruce implements PuntoEstable {

    private Hashtable<String, Cuadra> cuadras;
    Cruce() {
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
        cuadras.get(sentido.clave()).agregarElemento(elemento, sentido);
    }
    public void llegadaJugador(){}
}


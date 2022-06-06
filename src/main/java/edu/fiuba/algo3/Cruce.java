package edu.fiuba.algo3;

public class Cruce implements PuntoEstable {
    private Cuadra[] cuadras;

    Cruce(){
        cuadras = new Cuadra[4];
    }
    public boolean validarSentido(Sentido sentido){
        return true;
    }
    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo){
        Cuadra cuadra = cuadras[sentido.cruce()];
        return cuadra.siguientePunto(sentido, vehiculo);
    }

    public void agregarCuadra(Cuadra cuadra, int i) {
        cuadras[i] = cuadra;
    }
    public void agregarElemento(Elemento elemento, Sentido sentido) {
        cuadras[sentido.cruce()].agregarElemento(elemento);
    }
}


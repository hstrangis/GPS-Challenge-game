package edu.fiuba.algo3.modelo;

abstract public class PuntoEstable {

    protected Coordenada coordenada;

    PuntoEstable(int x, int y){
        coordenada = new Coordenada(x, y);
    }

    PuntoEstable(){}
    abstract void agregarCuadra(Cuadra cuadra, Sentido sentido) ;
    abstract boolean validarSentido(Sentido sentido);
    abstract PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo);
    abstract void llegadaJugador();

    public Double coordenadaX(){return coordenada.coordenadaX();}
    public Double coordenadaY(){return coordenada.coordenadaY();}

}

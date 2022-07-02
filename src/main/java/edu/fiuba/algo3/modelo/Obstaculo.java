package edu.fiuba.algo3.modelo;


import edu.fiuba.algo3.modelo.Elemento;
import edu.fiuba.algo3.modelo.EstadoVehiculo;
import edu.fiuba.algo3.modelo.Sentido;


public abstract class Obstaculo implements Elemento {
    protected Coordenada coordenada;
    Obstaculo(){};
    abstract public boolean interactuar(EstadoVehiculo vehiculo);

    public boolean sosEliminable(){
        return false;
    }

    public void agregarCoordenadas(double x, double y, Sentido sentido){
        coordenada = new Coordenada(x, y);
        sentido.modificarCoordenadaElemento(coordenada);
    }

    abstract public String nombre();

    public double coordenadaX(){return coordenada.coordenadaX();}

    public double coordenadaY(){return coordenada.coordenadaY();}


}

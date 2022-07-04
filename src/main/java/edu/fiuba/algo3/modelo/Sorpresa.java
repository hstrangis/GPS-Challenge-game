package edu.fiuba.algo3.modelo;


public abstract class Sorpresa {

   protected Coordenada coordenada;

    abstract public void interactuar(EstadoVehiculo vehiculo);

    public String nombre(){return "file:src\\main\\java\\edu\\fiuba\\algo3\\sorpresa.png";}

    public void agregarCoordenadas(double x, double y, Sentido sentido){
        coordenada = new Coordenada(x, y);
        sentido.modificarCoordenadaElemento(coordenada);
    }

    public double coordenadaX(){return coordenada.coordenadaX();}

    public double coordenadaY(){return coordenada.coordenadaY();}
}


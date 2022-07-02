package edu.fiuba.algo3.modelo;


public abstract class Sorpresa implements Elemento {

   protected Coordenada coordenada;

    public boolean sosEliminable(){
        return true;
    }

    abstract public boolean interactuar(EstadoVehiculo vehiculo);

    public String nombre(){return "file:src\\main\\java\\edu\\fiuba\\algo3\\sorpresa.png";}

    public void agregarCoordenadas(double x, double y, Sentido sentido){
        coordenada = new Coordenada(x, y);
        sentido.modificarCoordenadaElemento(coordenada);
    }

    public double coordenadaX(){return coordenada.coordenadaX();}

    public double coordenadaY(){return coordenada.coordenadaY();}
}


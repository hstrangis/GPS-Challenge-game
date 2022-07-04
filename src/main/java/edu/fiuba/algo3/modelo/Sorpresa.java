package edu.fiuba.algo3.modelo;


public abstract class Sorpresa {

   protected Coordenada coordenada;

    abstract public void interactuar(EstadoVehiculo vehiculo);

    public String nombre(){return "file:src\\main\\java\\edu\\fiuba\\algo3\\sorpresa.png";}

    public void agregarCoordenadas(double x, double y){
        coordenada = new Coordenada(x, y);
    }

    public void actualizarCoordenada(Sentido sentido, double posicion){
        sentido.modificarCoordenadaElemento(coordenada, posicion);
    }

    public double coordenadaX(){return coordenada.coordenadaX();}

    public double coordenadaY(){return coordenada.coordenadaY();}
}


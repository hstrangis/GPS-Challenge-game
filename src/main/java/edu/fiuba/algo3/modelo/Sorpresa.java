package edu.fiuba.algo3.modelo;


public abstract class Sorpresa {

   protected Coordenada coordenada;

    abstract public boolean interactuar(EstadoVehiculo vehiculo);

    public String nombre(){return "sorpresa";}

    public void agregarCoordenadas(double x, double y){
        coordenada = new Coordenada(x, y);
    }

    public void actualizarCoordenada(Sentido sentido, double posicion){
        sentido.modificarCoordenadaElemento(coordenada, posicion);
    }

    public double coordenadaX(){return coordenada.coordenadaX();}

    public double coordenadaY(){return coordenada.coordenadaY();}
}


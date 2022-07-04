package edu.fiuba.algo3.modelo;


public abstract class Obstaculo {
    protected Coordenada coordenada;
    Obstaculo(){};
    abstract public boolean interactuar(EstadoVehiculo vehiculo);

    public void agregarCoordenadas(double x, double y){
        coordenada = new Coordenada(x, y);
    }

    public void actualizarCoordenada(Sentido sentido, double posicion){
        sentido.modificarCoordenadaElemento(coordenada, posicion);
    }

    abstract public String nombre();

    public double coordenadaX(){return coordenada.coordenadaX();}

    public double coordenadaY(){return coordenada.coordenadaY();}


}

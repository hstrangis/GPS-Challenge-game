package edu.fiuba.algo3.modelo;


public class Meta extends PuntoEstable {
    private boolean llegadaJugador = false;

    public Meta() {}

    public void asignarCoordenadas(int x, int y){
        coordenada = new Coordenada(x, y);
    }

    public void agregarCuadra(Cuadra cuadra, Sentido sentido) {
        sentido.modificarCoordenada(coordenada);
    }
    public boolean validarSentido(Sentido sentido) {
        return false;
    }
    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo) {
        return this;
    }

    public boolean consultarVictoria(){
        return llegadaJugador;
    }

    public void llegadaJugador(){
        llegadaJugador = true;
    }
}


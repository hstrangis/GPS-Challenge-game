package edu.fiuba.algo3.modelo;


public class Meta extends PuntoEstable {
    private Juego juego;

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
    public void agregarJuego(Juego juego) {
        this.juego = juego;
    }
    public void llegadaJugador(){
        juego.terminar();
    }
}


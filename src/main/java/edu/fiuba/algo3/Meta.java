package edu.fiuba.algo3;

public class Meta implements PuntoEstable{
    private Jugador jugador;
    public void agregarCuadra(Cuadra cuadra, Sentido sentido) {}

    public void configurar(Jugador jugador){
        this.jugador = jugador;
    }
    public boolean validarSentido(Sentido sentido) {
        return false;
    }
    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo) {
        return this;
    }

    public boolean consultarVictoria(){
        return jugador.consultarPosicion(this);
    }
}


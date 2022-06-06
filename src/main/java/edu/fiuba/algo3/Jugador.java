package edu.fiuba.algo3;

public class Jugador {
    private String nick;
    private PuntoEstable ubicacion;
    private Vehiculo vehiculo;

    Jugador(String nick, Vehiculo vehiculo, PuntoEstable puntoPartida){
        this.nick = nick;
        ubicacion = puntoPartida;
        this.vehiculo = vehiculo;
    }

    public void moverse(Sentido sentido){
        if (ubicacion.validarSentido(sentido))
            ubicacion = ubicacion.siguientePunto(sentido, vehiculo);
    }

    public PuntoEstable ubicacion(){
        return ubicacion;
    }
}

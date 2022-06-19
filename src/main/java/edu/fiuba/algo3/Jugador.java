package edu.fiuba.algo3;

public class Jugador {
    private String nick;
    protected PuntoEstable ubicacion;
    private Vehiculo vehiculo;

    Jugador(String nick, Vehiculo vehiculo, PuntoEstable puntoPartida){
        this.nick = nick;
        ubicacion = puntoPartida;
        this.vehiculo = vehiculo;
    }

    public void moverse(Sentido sentido) {
        if (ubicacion.validarSentido(sentido)) {
            vehiculo.moverse();
            ubicacion = ubicacion.siguientePunto(sentido, vehiculo);
        }
    }

    public boolean consultarPosicion(PuntoEstable posicion){
        return (ubicacion == posicion);
    }

    //Para pruebas
    public Movimientos movimientos(){
        return vehiculo.movimientos;
    }

}

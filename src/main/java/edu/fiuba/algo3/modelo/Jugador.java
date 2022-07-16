package edu.fiuba.algo3.modelo;

public class Jugador {
    private final String nick;
    private PuntoEstable ubicacion;
    private final Vehiculo vehiculo;

    public Jugador(String nick, Vehiculo vehiculo){
        this.nick = nick;
        this.vehiculo = vehiculo;
    }

    public void asignarPuntoPartida(PuntoEstable puntoPartida){
        ubicacion = puntoPartida;
    }

    public void moverse(Sentido sentido) {
        if (ubicacion.validarSentido(sentido)) {
            ubicacion = ubicacion.siguientePunto(sentido, vehiculo);
            vehiculo.moverse();
            ubicacion.llegadaJugador();
        }
    }

    //Para pruebas
    public Movimientos movimientos(){
        return vehiculo.movimientos();
    }

    public String nombre() { return nick; }

    public boolean tieneMasOIgualMovimientosQue(Jugador jugador) {
        return Double.compare(this.movimientos().cantidad(), jugador.movimientos().cantidad()) >= 0;
    }
    public boolean mismoJugador(Jugador jugador) {
        return jugador.nick.equals(this.nick);
    }

    public Vehiculo vehiculo(){
        return vehiculo;
    }

    public PuntoEstable ubicacion() {return ubicacion;}
}

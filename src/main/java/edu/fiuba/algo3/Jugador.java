package edu.fiuba.algo3;

public class Jugador {
    private final String nick;
    protected PuntoEstable ubicacion;
    private final Vehiculo vehiculo;

    Jugador(String nick, Vehiculo vehiculo){
        this.nick = nick;
        this.vehiculo = vehiculo;
    }

    public void asignarPuntoPartida(PuntoEstable puntoPartida){
        ubicacion = puntoPartida;
    }

    public void moverse(Sentido sentido) {
        if (ubicacion.validarSentido(sentido)) {
            vehiculo.moverse();
            ubicacion = ubicacion.siguientePunto(sentido, vehiculo);
            ubicacion.llegadaJugador();
        }
    }

    public boolean consultarPosicion(PuntoEstable posicion){
        return (ubicacion == posicion);
    }

    //Para pruebas
    public Movimientos movimientos(){
        return vehiculo.movimientos;
    }

    public String nombre() { return nick; }

    public boolean tieneMasOIgualMovimientosQue(Jugador jugador) {
        return Double.compare(this.movimientos().mostrar(), jugador.movimientos().mostrar()) >= 0;
    }
    public boolean mismoJugador(Jugador jugador) {
        return jugador.nick.equals(this.nick);
    }

    public Vehiculo vehiculo(){
        return vehiculo;
    }
}

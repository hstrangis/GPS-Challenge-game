package edu.fiuba.algo3;

public class Jugador {
    private String nick;
    private PuntoEstable ubicacion;
    private Vehiculo vehiculo;

    Jugador(String nick, Vehiculo vehiculo, PuntoEstable puntoPartida){
        this.nick = nick;
        ubicacion = puntoPartida;
        this.vehiculo = vehiculo;
        vehiculo.agregarConductor(this);
    }

    public void moverse(Sentido sentido) {
        if (ubicacion.validarSentido(sentido)) {
            vehiculo.moverse();
            ubicacion = ubicacion.siguientePunto(sentido, this);
        }
    }

    public boolean interactuar(Elemento elemento){
        return elemento.interactuar(vehiculo);
    }

    public void cambiarVehiculo(){
        vehiculo = vehiculo.crearSiguiente();
        vehiculo.agregarConductor(this);
    }

    //Para pruebas
    public int movimientos(){
        return vehiculo.movimientos;
    }

    public PuntoEstable ubicacion(){
        return ubicacion;
    }
}

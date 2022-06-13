package edu.fiuba.algo3;

public class Juego {
    private Ciudad ciudad;
    private Jugador jugador;

    Juego(int largo, int ancho){
        ciudad = new Ciudad(largo, ancho);
    }

    public void jugar(String nick, Vehiculo vehiculo){
        jugador = new Jugador(nick, vehiculo, ciudad.puntoPartida());
    }

    public void moverse(Sentido sentido){
        jugador.moverse(sentido);
    }

    public void agregarElemento(Elemento elemento, int fila, int columna, Sentido sentido) {
        ciudad.agregarElemento(elemento, fila, columna, sentido);
    }
    public Cruce puntoPartida(){
        return ciudad.puntoPartida();
    }
    public PuntoEstable puntoJugador(){
        return jugador.ubicacion();
    }
    public double movimientosJugador(){return jugador.movimientos();}

    //Para pruebas
    public Vehiculo obtenerVehiculo(String nickJugador) {
        return jugador.obtenerVehiculo();
    }

}

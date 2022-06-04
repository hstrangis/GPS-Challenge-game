package edu.fiuba.algo3;

public class Juego {
    private Ciudad ciudad;
    private Jugador jugador;

    Juego(int largo, int ancho){
        ciudad = new Ciudad(largo, ancho);
    }

    public void jugar(String nick, Vehiculo vehiculo){
        jugador = new Jugador(nick, vehiculo, ciudad.puntoPartida());
        ciudad.colocarElementos();
    }

    public void moverse(Sentido sentido){
        jugador.moverse(sentido);
    }
}

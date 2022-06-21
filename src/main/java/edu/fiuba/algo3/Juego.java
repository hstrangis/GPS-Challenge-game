package edu.fiuba.algo3;

import javafx.scene.Group;

public class Juego {
    private Ciudad ciudad;
    protected Jugador jugador;
    private boolean juegoTerminado;

    Juego(int largo, int ancho){
        ciudad = new Ciudad(largo, ancho);
    }

    Juego(int largo, int ancho, Group root){
        ciudad = new Ciudad(largo, ancho);
    }

    public void jugar(String nick, Vehiculo vehiculo){
        jugador = new Jugador(nick, vehiculo);
        ciudad.prepararJugador(jugador);
    }

    public void moverse(Sentido sentido){
        if (!juegoTerminado) {
            jugador.moverse(sentido);
            juegoTerminado = ciudad.chequearVictoria();
        }
    }

    public void agregarElemento(Elemento elemento, int fila, int columna, Sentido sentido) {
        ciudad.agregarElemento(elemento, fila, columna, sentido);
    }
    //Para pruebas


}

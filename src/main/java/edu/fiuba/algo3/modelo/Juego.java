package edu.fiuba.algo3.modelo;

import javafx.scene.Group;

public class Juego {
    private Ciudad ciudad;
    private Jugador jugador;
    public Ranking ranking;
    private Meta meta;
    private boolean juegoTerminado;

    public Juego(int largo, int ancho, Meta meta) {
        ciudad = new Ciudad(largo, ancho, meta);
        this.meta = meta;
        meta.agregarJuego(this);
        ranking = new Ranking();
    }


    public void jugar(String nick, Vehiculo vehiculo){
        jugador = new Jugador(nick, vehiculo);
        ciudad.prepararJugador(jugador);
    }

    public void moverse(Sentido sentido){
        if (!juegoTerminado) {
            jugador.moverse(sentido);
        }
    }

    public void agregarObstaculo(Obstaculo obstaculo, int fila, int columna, Sentido sentido) {
        ciudad.agregarObstaculo(obstaculo, fila, columna, sentido);
    }
    public void agregarSorpresa(Sorpresa sorpresa, int fila, int columna, Sentido sentido) {
        ciudad.agregarSorpresa(sorpresa, fila, columna, sentido);
    }

    public void terminar(){
        juegoTerminado = true;
        ranking.agregarJugador(jugador);
    }
    public boolean terminado(){
        return juegoTerminado;
    }
    public Ranking obtenerRanking() {
        return ranking;
    }
    //Para pruebas

    public Jugador jugador(){
        return jugador;
    }


}

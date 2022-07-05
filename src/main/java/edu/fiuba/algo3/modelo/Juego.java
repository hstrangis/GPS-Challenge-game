package edu.fiuba.algo3.modelo;

import javafx.scene.Group;

public class Juego {
    private Ciudad ciudad;
    private Jugador jugador;
    public Ranking ranking;
    private boolean juegoTerminado;

    private int largo;

    private int ancho;

    public Juego(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        ranking = new Ranking();
    }

    public void jugar(String nick, Vehiculo vehiculo, Meta meta){
        juegoTerminado = false;
        ciudad = new Ciudad(largo, ancho, meta);
        meta.agregarJuego(this);
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

package edu.fiuba.algo3.modelo;

import javafx.scene.Group;

public class Juego {
    private Ciudad ciudad;
    private Jugador jugador;
    protected Ranking ranking;
    private Meta meta;
    private boolean juegoTerminado;

    public Juego(int largo, int ancho, Meta meta) {
        ciudad = new Ciudad(largo, ancho, meta);
        this.meta = meta;
        ranking = new Ranking();
    }


    public void jugar(String nick, Vehiculo vehiculo){
        jugador = new Jugador(nick, vehiculo);
        ciudad.prepararJugador(jugador);
    }

    public void moverse(Sentido sentido){
        if (!juegoTerminado) {
            jugador.moverse(sentido);
            juegoTerminado = meta.consultarVictoria();
            if(juegoTerminado) {
                ranking.agregarJugador(jugador);
            }
        }
    }

    public void agregarElemento(Elemento elemento, int fila, int columna, Sentido sentido) {
        ciudad.agregarElemento(elemento, fila, columna, sentido);
    }

    public void juegoTerminado(){
        juegoTerminado = true;
        ranking.agregarJugador(jugador);
    }
    public void verRanking() {
        ranking.mostrar();
    }
    //Para pruebas

    public Jugador jugador(){
        return jugador;
    }


}

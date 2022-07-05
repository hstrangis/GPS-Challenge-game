package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Comparator;

public class Ranking {

    private ArrayList<Jugador> ranking;
    private Integer maxRanking = 10;

    public Ranking() {
        ranking = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        if(estaEnRanking(jugador)) { actualizarPuntaje(jugador); }
        else { ranking.add(jugador); }
        ranking.sort(Comparator.comparingDouble(a -> a.movimientos().cantidad()));
    }
    private void actualizarPuntaje(Jugador jugador) {
        for(Jugador j : ranking) {
            if(j.mismoJugador(jugador) & j.tieneMasOIgualMovimientosQue(jugador)) {
                quitarJugador(j);
                ranking.add(jugador);
            }
        }
    }
    private boolean estaEnRanking(Jugador jugador) {
        for(Jugador j : ranking) {
            if(j.mismoJugador(jugador)) { return true; }
        }
        return false;
    }
    private void quitarJugador(Jugador jugador) {
        ranking.remove(jugador);
    }
    public void limpiar() {
        ranking.clear();
    }
    public void setearMaximo(Integer max) {
        maxRanking = max;
    }
    public Jugador primerPuesto() {
        return ranking.get(0);
    }

    public ArrayList<Jugador> obtenerJugadoresYPuntajes() {
        return ranking;
    }

}


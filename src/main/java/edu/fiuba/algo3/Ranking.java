package edu.fiuba.algo3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ranking {

    private ArrayList<Jugador> ranking;
    private Integer maxRanking = 10;

    Ranking() {
        ranking = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        ranking.add(jugador);
        ranking.sort(Comparator.comparingDouble(a -> a.movimientos().mostrar()));
    }

    public void quitarJugador(Jugador jugador) {
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

    public void mostrar() {
        int contador = 1;
        Iterator<Jugador> iter = ranking.iterator();

        while(iter.hasNext() & contador <= maxRanking) {
            Jugador jugador = iter.next();
            System.out.println(contador + " - " + jugador.nombre() + " con " + jugador.movimientos().mostrar() + " movimientos.");
            contador++;
        }
    }
}


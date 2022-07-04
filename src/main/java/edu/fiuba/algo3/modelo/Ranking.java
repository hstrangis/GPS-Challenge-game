package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Jugador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ranking {

    private ArrayList<Jugador> ranking;
    private Integer maxRanking = 10;

    public Ranking() {
        ranking = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        if(estaEnRanking(jugador)) { actualizarPuntaje(jugador); }
        else { ranking.add(jugador); }
        ranking.sort(Comparator.comparingDouble(a -> a.movimientos().mostrar()));
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
//    public void mostrar() {
//        int contador = 1;
//        Iterator<Jugador> iter = ranking.iterator();
//        while(iter.hasNext() & contador <= maxRanking) {
//            Jugador jugador = iter.next();
//            System.out.println(contador + " - " + jugador.nombre() + " con " + jugador.movimientos().mostrar() + " movimientos.");
//            contador++;
//        }
//   }
}


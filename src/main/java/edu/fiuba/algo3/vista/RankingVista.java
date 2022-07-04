package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.*;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class RankingVista extends Group {

    private Juego juego;
    private Ranking ranking;
    RankingVista (Juego juego) {
        this.ranking = juego.obtenerRanking();
    }

    public void inicializar() {

        Jugador j1 = new Jugador("Juan", new Vehiculo(new Moto()));
        Jugador j2 = new Jugador("Tito", new Vehiculo(new Moto()));
        Jugador j3 = new Jugador("Jose", new Vehiculo(new Moto()));
        Jugador j4 = new Jugador("Jua", new Vehiculo(new Moto()));
        Jugador j5 = new Jugador("Tit", new Vehiculo(new Moto()));
        Jugador j6 = new Jugador("Jos", new Vehiculo(new Moto()));
        Jugador j7 = new Jugador("Ju", new Vehiculo(new Moto()));
        Jugador j8 = new Jugador("Ti", new Vehiculo(new Moto()));
        Jugador j9 = new Jugador("Je", new Vehiculo(new Moto()));

        ranking.agregarJugador(j1);
        ranking.agregarJugador(j2);
        ranking.agregarJugador(j3);
        ranking.agregarJugador(j4);
        ranking.agregarJugador(j5);
        ranking.agregarJugador(j6);
        ranking.agregarJugador(j7);
        ranking.agregarJugador(j8);
        ranking.agregarJugador(j9);

        Label jugador = new Label("Jugador");
        jugador.setMinWidth(100);
        jugador.setTranslateX(30);
        this.getChildren().add(jugador);

        Label puntaje = new Label("Puntaje");
        puntaje.setMinWidth(100);
        puntaje.setTranslateX(120);
        this.getChildren().add(puntaje);

        ArrayList<Jugador> listaJugadores = ranking.obtenerJugadoresYPuntajes();
        int x = 40;
        for(Jugador j : listaJugadores) {
            escribirFila(j.nombre(), j.movimientos().cantidad(),x);
            x = x+20;
        }
    }
    public void escribirFila(String nombre, Double puntaje, double posicion) {

        Text nick = new Text(nombre);
        Text movimientos = new Text(puntaje.toString());

        nick.setTranslateY(posicion);
        nick.setTranslateX(30);
        movimientos.setTranslateX(120);
        movimientos.setTranslateY(posicion);
        this.getChildren().add(nick);
        this.getChildren().add(movimientos);
    }

    public int alturaPantalla() {
        return ranking.obtenerJugadoresYPuntajes().size() * 20;
    }
}

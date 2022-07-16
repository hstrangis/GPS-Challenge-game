package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.*;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class RankingVista extends Group {
    private final Ranking ranking;
    RankingVista (Juego juego) {
        this.ranking = juego.obtenerRanking();
    }

    public void inicializar() {


        Label jugador = new Label("Jugador");
        jugador.setMinWidth(100);
        jugador.setTranslateX(30);
        this.getChildren().add(jugador);

        Label puntaje = new Label("Puntaje");
        puntaje.setMinWidth(100);
        puntaje.setTranslateX(120);
        this.getChildren().add(puntaje);

        ArrayList<Jugador> listaJugadores = ranking.obtenerJugadoresYPuntajes();
        int posicionInicial = 40;
        for(Jugador j : listaJugadores) {
            escribirFila(j.nombre(), j.movimientos().cantidad(), posicionInicial);
            posicionInicial = posicionInicial + 20;
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

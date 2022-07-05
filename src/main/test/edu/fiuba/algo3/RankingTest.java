package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RankingTest {

    @Test
    public void testRankingSeAgregaUnJugadorYTienePrimerPuesto() {
        Vehiculo moto = new Vehiculo(new Moto());
        Jugador jugador1 = new Jugador("Beto", moto);
        moto.moverse();
        Ranking ranking = new Ranking();
        ranking.agregarJugador(jugador1);
        assertEquals(jugador1, ranking.primerPuesto());
    }
    @Test
    public void testRankingDeTresJugadoresConDistintosMovimientos() {
        Vehiculo moto = new Vehiculo(new Moto());
        Vehiculo auto = new Vehiculo(new Auto());
        Vehiculo camio = new Vehiculo(new CuatroxCuatro());
        Jugador jugador1 = new Jugador("Beto", camio);
        Jugador jugador2 = new Jugador("Juan", auto);
        Jugador jugador3 = new Jugador("Belu", moto);
        moto.moverse();
        auto.moverse();
        auto.moverse();
        camio.moverse();
        camio.moverse();
        camio.moverse();
        Ranking ranking = new Ranking();
        ranking.agregarJugador(jugador1);
        ranking.agregarJugador(jugador2);
        ranking.agregarJugador(jugador3);
        assertEquals(jugador3, ranking.primerPuesto());
    }
    @Test
    public void testSeAgregaElPuntajeDeUnJugadorYLuegoSeMejora() {
        Ranking ranking = new Ranking();
        Vehiculo moto = new Vehiculo(new Moto());
        moto.moverse();
        moto.moverse();
        Jugador jugador1 = new Jugador("Beto", moto);
        Vehiculo auto = new Vehiculo(new Auto());
        auto.moverse();
        Jugador jugador2 = new Jugador("Beto", auto);
        ranking.agregarJugador(jugador1);
        ranking.agregarJugador(jugador2);
        assertEquals(jugador2, ranking.primerPuesto());
    }
}

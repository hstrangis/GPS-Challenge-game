package edu.fiuba.algo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RankingTest {
    @Test
    public void testUnaHaceDosMovimientosYEncuentraMeta() {
        Vehiculo moto = new Vehiculo(new Moto());
        Vehiculo auto = new Vehiculo(new Auto());
        Vehiculo camio = new Vehiculo(new CuatroxCuatro());
        moto.moverse();
        auto.moverse();
        auto.moverse();
        camio.moverse();
        camio.moverse();
        camio.moverse();
        Jugador jugador1 = new Jugador("Beto", camio);
        Jugador jugador2 = new Jugador("Juan", auto);
        Jugador jugador3 = new Jugador("Belu", moto);
        Ranking ranking = new Ranking();
        ranking.agregarJugador(jugador2);
        ranking.agregarJugador(jugador1);
        ranking.agregarJugador(jugador3);
        ranking.mostrar();
        assertEquals("Belu", ranking.primerPuesto().nombre());
    }
}

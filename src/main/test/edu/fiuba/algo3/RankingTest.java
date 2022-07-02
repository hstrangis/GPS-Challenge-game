package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RankingTest {
    @Test
    public void testRankingDeTresJugadoresConDistintosMovimientos() {
        Vehiculo moto = new Vehiculo(new Moto());
        Vehiculo auto = new Vehiculo(new Auto());
        Vehiculo camio = new Vehiculo(new CuatroxCuatro());
        Vehiculo moto2 = new Vehiculo(new Moto());
        moto.moverse();
        auto.moverse();
        auto.moverse();
        camio.moverse();
        camio.moverse();
        camio.moverse();
        Jugador jugador1 = new Jugador("Beto", camio);
        Jugador jugador2 = new Jugador("Juan", auto);
        Jugador jugador3 = new Jugador("Belu", moto);
        Jugador jugador4 = new Jugador("Beto", moto2);
        Ranking ranking = new Ranking();
        ranking.agregarJugador(jugador2);
        ranking.agregarJugador(jugador1);
        ranking.agregarJugador(jugador3);
        ranking.agregarJugador(jugador4);
        ranking.mostrar();
        assertEquals("Beto", ranking.primerPuesto().nombre());
    }
}

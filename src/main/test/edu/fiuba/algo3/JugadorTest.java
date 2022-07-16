package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JugadorTest {
    @Test
    public void testMuevoJugadorYVerificoQueCambiaSuUbicacion() {
        Vehiculo vehiculo = new Vehiculo(new Moto(), new Movimientos());
        Juego juego = new Juego(4,4);
        juego.jugar("carlos", vehiculo, new Meta());
        PuntoEstable UbicacionVieja = juego.jugador().ubicacion();
        juego.moverse(new Este());
        assertNotEquals(UbicacionVieja, juego.jugador().ubicacion());
    }
    @Test
    public void testJugadorSeMueve3VecesYNoEncuentraObstaculos() {
        Vehiculo vehiculo = new Vehiculo(new Moto(), new Movimientos());
        Juego juego = new Juego(4,4);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.moverse(new Este());
        juego.moverse(new Este());
        juego.moverse(new Este());
        assertEquals(3, juego.jugador().movimientos().cantidad());
    }

    @Test
    public void testJugadorLlegaALaMeta() {
        Vehiculo vehiculo = new Vehiculo(new Moto(), new Movimientos());
        Juego juego = new Juego(4,4);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.moverse(new Este());
        juego.moverse(new Este());
        juego.moverse(new Este());
        juego.moverse(new Oeste());
        juego.moverse(new Sur());
        juego.moverse(new Este());
        juego.moverse(new Oeste());
        juego.moverse(new Sur());
        juego.moverse(new Este());
        juego.moverse(new Oeste());
        juego.moverse(new Sur());
        juego.moverse(new Este());
        assertTrue(juego.terminado());
    }
}

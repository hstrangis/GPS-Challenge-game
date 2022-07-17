package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordenadaTest {
    @Test
    public void testJugadorSeMueveHaciaElEsteYCambianSusCoordenadasEnX() {
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), new Movimientos());
        Juego juego = new Juego(4, 4);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.moverse(new Este());
        assertEquals(juego.jugador().ubicacion().coordenadaX(), 1);
        assertEquals(juego.jugador().ubicacion().coordenadaY(), 0);
    }
    @Test
    public void testJugadorSeMueveHaciaElOesteYCambianSusCoordenadasEnX() {
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), new Movimientos());
        Juego juego = new Juego(4, 4);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.moverse(new Oeste());
        assertEquals(juego.jugador().ubicacion().coordenadaX(), -1);
        assertEquals(juego.jugador().ubicacion().coordenadaY(), 0);
    }
    @Test
    public void testJugadorSeMueveHaciaElSurYCambianSusCoordenadasEnY() {
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), new Movimientos());
        Juego juego = new Juego(4, 4);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.moverse(new Sur());
        assertEquals(juego.jugador().ubicacion().coordenadaX(), 0);
        assertEquals(juego.jugador().ubicacion().coordenadaY(), 1);
    }
    @Test
    public void testJugadorSeMueveHaciaElNorteYCambianSusCoordenadasEnY() {
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), new Movimientos());
        Juego juego = new Juego(4, 4);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.moverse(new Norte());
        assertEquals(juego.jugador().ubicacion().coordenadaX(), 0);
        assertEquals(juego.jugador().ubicacion().coordenadaY(), -1);
    }
}

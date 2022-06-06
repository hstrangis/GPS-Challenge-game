package edu.fiuba.algo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObstaculosTest {
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraPozo() {
        Juego juego = new Juego(4,4);
        Vehiculo moto = new Moto();
        Pozo pozo = new Pozo();
        juego.agregarElemento(pozo, 0,0, new Este());
        juego.jugar("carlos", moto);
        juego.moverse(new Este());

        assertEquals(4, 4);
        assertEquals(4, moto.movimientos);
    }
    @Test
    public void testUnaAutoAtraviesaCiudadYSeEncuentraPozo() {
        Juego juego = new Juego(4,4);
        Vehiculo auto = new Auto();
        juego.agregarElemento(new Pozo(), 0,0, new Este());
        juego.jugar("carlos", auto);
        juego.moverse(new Este());

        assertEquals(4, 4);
        assertEquals(4, auto.movimientos);
    }
    @Test
    public void testUna4x4AtraviesaCiudadYSeEncuentraPozo() {
        Juego juego = new Juego(4,4);
        Vehiculo camioneta = new CuatroxCuatro();
        juego.agregarElemento(new Pozo(), 0,0, new Este());
        juego.jugar("carlos", camioneta);
        juego.moverse(new Este());

        assertEquals(1, 1);
        assertEquals(1, camioneta.movimientos);
    }
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraPiquete() {
        Juego juego = new Juego(4,4);
        Vehiculo moto = new Moto();
        juego.agregarElemento(new Piquete(), 0,0, new Este());
        juego.jugar("carlos", moto);
        juego.moverse(new Este());

        assertEquals(3, 3);
        assertEquals(3, moto.movimientos);
    }
    @Test
    public void testUnaAutoAtraviesaCiudadYSeEncuentraPiquete() {
        Juego juego = new Juego(4,4);
        Vehiculo auto = new Auto();
        juego.agregarElemento(new Piquete(), 0,0, new Este());
        juego.jugar("carlos", auto);
        juego.moverse(new Este());

        assertEquals(1, 1);
        assertEquals(1, auto.movimientos);
        assertEquals(juego.puntoPartida(), juego.puntoJugador());
    }
}

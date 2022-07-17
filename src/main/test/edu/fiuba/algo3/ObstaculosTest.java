package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObstaculosTest {
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraPozo() {
        //Una moto se desplaza desde el origen hacia el Este, encuentra un pozo y suma 3 movimientos
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Moto(), movimientos);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.agregarObstaculo(new Pozo(), 0,0, new Este());
        juego.moverse(new Este());

        assertEquals(4, movimientos.cantidad());
    }
    @Test
    public void testUnaAutoAtraviesaCiudadYSeEncuentraPozo() {
        //Un auto se desplaza desde el origen hacia el Este, encuentra un pozo y suma 3 movimientos
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.agregarObstaculo(new Pozo(), 0,0, new Este());
        juego.moverse(new Este());

        assertEquals(4, movimientos.cantidad());
    }
    @Test
    public void testUna4x4AtraviesaCiudadYSeEncuentraPozo() {
        //Una 4x4 se desplaza desde el origen hacia el Este, encuentra un pozo y no suma movimientos (primer pozo)
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), movimientos);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.agregarObstaculo(new Pozo(), 0,0, new Este());
        juego.moverse(new Este());

        assertEquals(1, movimientos.cantidad());
    }
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraPiquete() {
        //Una moto se desplaza desde el origen hacia el Este, encuentra un piquete y suma 2 movimientos
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Moto(), movimientos);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.agregarObstaculo(new Piquete(), 0,0, new Este());
        juego.moverse(new Este());

        assertEquals(3, movimientos.cantidad());
    }
    @Test
    public void testUnaAutoAtraviesaCiudadYSeEncuentraPiquete() {
        //Un auto se desplaza desde el origen hacia el Este, encuentra un piquete y vuelve al origen
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.agregarObstaculo(new Piquete(), 0,0, new Este());
        PuntoEstable posicionInicial = juego.jugador().ubicacion();
        juego.moverse(new Este());

        assertEquals(1, movimientos.cantidad());
        assertEquals(posicionInicial, juego.jugador().ubicacion());
    }
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraControlPolicial() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Moto(), movimientos);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.agregarObstaculo(new ControlPolicial(), 0,0, new Este());
        juego.moverse(new Este());
        assert( movimientos.cantidad() == 1 || movimientos.cantidad() == 4);
    }
    @Test
    public void testUnAutoAtraviesaPozoIntermitentementeEnAmbosSentidos() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.jugar("carlos", vehiculo, new Meta());
        juego.agregarObstaculo(new Pozo(), 0,1, new Este());
        juego.moverse(new Este());
        for(int i = 0; i < 10; i++) {
            juego.moverse(new Este());
            juego.moverse(new Sur());
            juego.moverse(new Oeste());
            juego.moverse(new Norte());
        }
        assertEquals(71, movimientos.cantidad());
    }
}

package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.vista.MetaVista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObstaculosTest {
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraPozo() {
        //Una moto se desplaza desde el origen hacia el Este, encuentra un pozo y suma 3 movimientos
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4, new Meta());
        Vehiculo vehiculo = new Vehiculo(new Moto(), movimientos);
        juego.agregarObstaculo(new Pozo(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        juego.moverse(new Este());

        assertEquals(4, movimientos.mostrar());
    }
    @Test
    public void testUnaAutoAtraviesaCiudadYSeEncuentraPozo() {
        //Un auto se desplaza desde el origen hacia el Este, encuentra un pozo y suma 3 movimientos
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4, new Meta());
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.agregarObstaculo(new Pozo(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        juego.moverse(new Este());

        assertEquals(4, movimientos.mostrar());
    }
    @Test
    public void testUna4x4AtraviesaCiudadYSeEncuentraPozo() {
        //Una 4x4 se desplaza desde el origen hacia el Este, encuentra un pozo y no suma movimientos (primer pozo)
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4, new Meta());
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), movimientos);
        juego.agregarObstaculo(new Pozo(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        juego.moverse(new Este());

        assertEquals(1, movimientos.mostrar());
    }
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraPiquete() {
        //Una moto se desplaza desde el origen hacia el Este, encuentra un piquete y suma 2 movimientos
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4, new Meta());
        Vehiculo vehiculo = new Vehiculo(new Moto(), movimientos);
        juego.agregarObstaculo(new Piquete(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        juego.moverse(new Este());

        assertEquals(3, movimientos.mostrar());
    }
    @Test
    public void testUnaAutoAtraviesaCiudadYSeEncuentraPiquete() {
        //Un auto se desplaza desde el origen hacia el Este, encuentra un piquete y vuelve al origen
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4, new Meta());
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.agregarObstaculo(new Piquete(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        PuntoEstable posicionInicial = juego.jugador().ubicacion();
        juego.moverse(new Este());

        assertEquals(1, movimientos.mostrar());
        assertEquals(posicionInicial, juego.jugador().ubicacion());
    }

}

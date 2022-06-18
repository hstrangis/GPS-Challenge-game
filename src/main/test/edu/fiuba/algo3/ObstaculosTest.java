package edu.fiuba.algo3;

import javafx.scene.Group;
import javafx.scene.Scene;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObstaculosTest {
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraPozo() {
        //Una moto se desplaza desde el origen hacia el Este, encuentra un pozo y suma 3 movimientos
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Moto());
        juego.agregarElemento(new Pozo(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        juego.moverse(new Este());

        assertEquals(4, vehiculo.movimientos.mostrar());
    }
    @Test
    public void testUnaAutoAtraviesaCiudadYSeEncuentraPozo() {
        //Un auto se desplaza desde el origen hacia el Este, encuentra un pozo y suma 3 movimientos
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto());
        juego.agregarElemento(new Pozo(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        juego.moverse(new Este());

        assertEquals(4, vehiculo.movimientos.mostrar());
    }
    @Test
    public void testUna4x4AtraviesaCiudadYSeEncuentraPozo() {
        //Una 4x4 se desplaza desde el origen hacia el Este, encuentra un pozo y no suma movimientos (primer pozo)
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro());
        juego.agregarElemento(new Pozo(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        juego.moverse(new Este());

        assertEquals(1, vehiculo.movimientos.mostrar());
    }
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraPiquete() {
        //Una moto se desplaza desde el origen hacia el Este, encuentra un piquete y suma 2 movimientos
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Moto());
        juego.agregarElemento(new Piquete(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        juego.moverse(new Este());

        assertEquals(3, vehiculo.movimientos.mostrar());
    }
    @Test
    public void testUnaAutoAtraviesaCiudadYSeEncuentraPiquete() {
        //Un auto se desplaza desde el origen hacia el Este, encuentra un piquete y vuelve al origen
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto());
        juego.agregarElemento(new Piquete(), 0,0, new Este());
        juego.jugar("carlos", vehiculo);
        juego.moverse(new Este());

        assertEquals(1, vehiculo.movimientos.mostrar());
        assertEquals(juego.puntoPartida(), juego.jugador.ubicacion);
    }

}

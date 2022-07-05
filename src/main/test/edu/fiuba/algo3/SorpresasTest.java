package edu.fiuba.algo3;
import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SorpresasTest {
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaFavorable() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        juego.iniciarMapa(new Meta());
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.agregarSorpresa(new Favorable(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(0.8,  movimientos.cantidad());
    }
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaDesfavorable() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        juego.iniciarMapa(new Meta());
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.agregarSorpresa(new Desfavorable(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(1.25, movimientos.cantidad());
    }
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        juego.iniciarMapa(new Meta());
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.agregarSorpresa(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(1, movimientos.cantidad());
        //assertTrue(vehiculo.estado instanceof CuatroxCuatro);
    }
    @Test
    public void testMotoAtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        juego.iniciarMapa(new Meta());
        Vehiculo vehiculo = new Vehiculo(new Moto(), movimientos);
        juego.agregarSorpresa(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(1, movimientos.cantidad());
        assertTrue(vehiculo.estado() == "file:src\\main\\java\\edu\\fiuba\\algo3\\auto.png");
    }
    @Test
    public void test4x4AtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        juego.iniciarMapa(new Meta());
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), movimientos);
        juego.agregarSorpresa(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(1, movimientos.cantidad());
        //assertTrue(vehiculo.estado instanceof Moto);
    }

    @Test
    public void test4x4AtraviesaCiudadYEncuentraSorpresaCambioDeVehiculoDespuesVuelveParaAtrasPeroLaSorpresaYaNoEsta() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        juego.iniciarMapa(new Meta());
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), movimientos);
        juego.agregarSorpresa(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());
        juego.moverse(new Oeste());

        assertEquals(2, movimientos.cantidad());
        //assertTrue(vehiculo.estado instanceof Moto);
    }
}

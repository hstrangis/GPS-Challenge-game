package edu.fiuba.algo3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SorpresasTest {
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaFavorable() {
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto());
        juego.agregarElemento(new Favorable(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(0.8,  vehiculo.movimientos.mostrar());
    }
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaDesfavorable() {
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto());
        juego.agregarElemento(new Desfavorable(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(1.25, vehiculo.movimientos.mostrar());
    }
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto());
        juego.agregarElemento(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(1, vehiculo.movimientos.mostrar());
        assertTrue(vehiculo.estado instanceof CuatroxCuatro);
    }
    @Test
    public void testMotoAtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Moto());
        juego.agregarElemento(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(1, vehiculo.movimientos.mostrar());
        assertTrue(vehiculo.estado instanceof Auto);
    }
    @Test
    public void test4x4AtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro());
        juego.agregarElemento(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());

        assertEquals(1, vehiculo.movimientos.mostrar());
        assertTrue(vehiculo.estado instanceof Moto);
    }

    @Test
    public void test4x4AtraviesaCiudadYEncuentraSorpresaCambioDeVehiculoDespuesVuelveParaAtrasPeroLaSorpresaYaNoEsta() {
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro());
        juego.agregarElemento(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", vehiculo);
        juego.moverse(new Este());
        juego.moverse(new Oeste());

        assertEquals(2, vehiculo.movimientos.mostrar());
        assertTrue(vehiculo.estado instanceof Moto);
    }
}

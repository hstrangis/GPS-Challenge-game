package edu.fiuba.algo3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SorpresasTest {
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaFavorable() {
        Juego juego = new Juego(4,4);

        juego.agregarElemento(new Favorable(), 0,0, new Este());
        juego.jugar("Seba", new Auto());
        juego.moverse(new Este());

        assertEquals(0.8,  juego.movimientosJugador());
    }
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaDesfavorable() {
        Juego juego = new Juego(4,4);

        juego.agregarElemento(new Desfavorable(), 0,0, new Este());
        juego.jugar("Seba", new Auto());
        juego.moverse(new Este());

        assertEquals(1.25, juego.movimientosJugador());
    }
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Juego juego = new Juego(4,4);

        juego.agregarElemento(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", new Auto());
        juego.moverse(new Este());

        assertEquals(1, juego.movimientosJugador());
        assertTrue(juego.obtenerVehiculo("Seba") instanceof CuatroxCuatro);
    }
    @Test
    public void testMotoAtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Juego juego = new Juego(4,4);

        juego.agregarElemento(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", new Moto());
        juego.moverse(new Este());

        assertEquals(1, juego.movimientosJugador());
        assertTrue(juego.obtenerVehiculo("Seba") instanceof Auto);
    }
    @Test
    public void test4x4AtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Juego juego = new Juego(4,4);

        juego.agregarElemento(new CambioVehiculo(), 0,0, new Este());
        juego.jugar("Seba", new CuatroxCuatro());
        juego.moverse(new Este());

        assertEquals(1, juego.movimientosJugador());
        assertTrue(juego.obtenerVehiculo("Seba") instanceof Moto);
    }
}

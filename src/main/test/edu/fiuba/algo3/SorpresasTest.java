package edu.fiuba.algo3;
import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SorpresasTest {
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaFavorable() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.jugar("Seba", vehiculo, new Meta());
        juego.agregarSorpresa(new Favorable(), 0,1, new Este());
        juego.moverse(new Este());
        juego.moverse(new Este());

        assertEquals(1.8,  movimientos.cantidad());
    }
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaDesfavorable() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.jugar("Seba", vehiculo, new Meta());
        juego.agregarSorpresa(new Desfavorable(), 0,1, new Este());
        juego.moverse(new Este());
        juego.moverse(new Este());

        assertEquals(2.25, movimientos.cantidad());
    }
    @Test
    public void testAutoAtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        juego.jugar("Seba", vehiculo, new Meta());
        juego.agregarSorpresa(new CambioVehiculo(), 0,0, new Este());
        juego.moverse(new Este());

        assertEquals(1, movimientos.cantidad());
        assertEquals(vehiculo.estado(),"4x4");
    }
    @Test
    public void testMotoAtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new Moto(), movimientos);
        juego.jugar("Seba", vehiculo, new Meta());
        juego.agregarSorpresa(new CambioVehiculo(), 0,0, new Este());
        juego.moverse(new Este());

        assertEquals(1, movimientos.cantidad());
        assertEquals(vehiculo.estado(), "auto");
    }
    @Test
    public void test4x4AtraviesaCiudadYEncuentraSorpresaCambioDeVehiculo() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), movimientos);
        juego.jugar("Seba", vehiculo, new Meta());
        juego.agregarSorpresa(new CambioVehiculo(), 0,0, new Este());
        juego.moverse(new Este());

        assertEquals(1, movimientos.cantidad());
        assertEquals(vehiculo.estado(), "moto");
    }

    @Test
    public void test4x4AtraviesaCiudadYEncuentraSorpresaCambioDeVehiculoDespuesVuelveParaAtrasPeroLaSorpresaYaNoEsta() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), movimientos);
        juego.jugar("Seba", vehiculo, new Meta());
        juego.agregarSorpresa(new CambioVehiculo(), 0,0, new Este());
        juego.moverse(new Este());
        juego.moverse(new Oeste());

        assertEquals(2, movimientos.cantidad());
        assertEquals(vehiculo.estado(), "moto");
    }

    @Test
    public void test4x4AtraviesaCiudadYEncuentraSorpresaEspecialConMovimientosPares() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), movimientos);
        juego.jugar("Seba", vehiculo, new Meta());
        juego.agregarSorpresa(new Especial(), 0,2, new Este());
        juego.moverse(new Este());
        juego.moverse(new Este());
        juego.moverse(new Este());
        assertEquals(3, movimientos.cantidad());
        assertEquals(vehiculo.estado(), "moto");
    }

    @Test
    public void test4x4AtraviesaCiudadYEncuentraSorpresaEspecialConMovimientosImpares() {
        Movimientos movimientos = new Movimientos();
        Juego juego = new Juego(4,4);
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), movimientos);
        juego.jugar("Seba", vehiculo, new Meta());
        juego.agregarSorpresa(new Especial(), 0,1, new Este());
        juego.moverse(new Este());
        PuntoEstable posicionInicial = juego.jugador().ubicacion();
        juego.moverse(new Este());
        assertEquals(2, movimientos.cantidad());
        assertEquals(posicionInicial, juego.jugador().ubicacion());
    }
}

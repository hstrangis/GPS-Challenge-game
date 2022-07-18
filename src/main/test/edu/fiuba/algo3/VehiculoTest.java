package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculoTest {
    @Test
    public void testVehiculoTeniaEstadoMotoYLeCambioElEstadoAAuto() {
        Vehiculo vehiculo = new Vehiculo(new Moto(), new Movimientos());
        EstadoVehiculo auto = new Auto();
        vehiculo.cambiarEstado(auto);
        assertEquals(vehiculo.estado(), auto.nombre());
    }
    @Test
    public void testVehiculoTeniaEstadoMotoYLeCambioElEstadoA4x4() {
        Vehiculo vehiculo = new Vehiculo(new Moto(), new Movimientos());
        EstadoVehiculo camio = new CuatroxCuatro();
        vehiculo.cambiarEstado(camio);
        assertEquals(vehiculo.estado(), camio.nombre());
    }
    @Test
    public void testVehiculoTeniaEstado4x4YLeCambioElEstadoAAuto() {
        Vehiculo vehiculo = new Vehiculo(new CuatroxCuatro(), new Movimientos());
        EstadoVehiculo auto = new CuatroxCuatro();
        vehiculo.cambiarEstado(auto);
        assertEquals(vehiculo.estado(), auto.nombre());
    }
    @Test
    public void testVehiculoSeMueveYAumentaUnMovimiento() {
        Vehiculo vehiculo = new Vehiculo(new Moto(), new Movimientos());
        Juego juego = new Juego(4,4);
        juego.jugar("carlos", vehiculo, new Meta());
        vehiculo.moverse();
        assertEquals(1, juego.jugador().movimientos().cantidad());
    }
}

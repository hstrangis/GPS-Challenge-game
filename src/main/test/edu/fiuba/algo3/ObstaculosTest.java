package edu.fiuba.algo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObstaculosTest {
    @Test
    public void testUnaMotoAtraviesaCiudadYSeEncuentraPozo() {
        Juego juego = new Juego(4,4);
        Vehiculo moto = new Moto();
        juego.agregarElemento(new Pozo(), 0,0, new Este());
        juego.jugar("carlos", moto);
        juego.moverse(new Este());

        assertEquals(4, moto.movimientos);
    }

}

package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Cuadra;
import edu.fiuba.algo3.modelo.PuntoEstable;
import edu.fiuba.algo3.modelo.Sentido;
import edu.fiuba.algo3.modelo.Vehiculo;

import java.util.Hashtable;

public class SinSalida extends PuntoEstable {

    SinSalida(int x, int y) {
        super(x, y);
    }
    protected Cuadra cuadraSinSalida;
    protected Sentido sentidoIngreso;
    public void agregarCuadra(Cuadra cuadra, Sentido sentido) {
        cuadraSinSalida = cuadra;
        sentidoIngreso = sentido;
        sentidoIngreso.modificarCoordenada(coordenada);
    }
    public boolean validarSentido(Sentido sentido) {
        return sentido.validar(sentidoIngreso);
    }
    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo) {
        return cuadraSinSalida.siguientePunto(sentido, vehiculo);
    }

    public void llegadaJugador(){}
}

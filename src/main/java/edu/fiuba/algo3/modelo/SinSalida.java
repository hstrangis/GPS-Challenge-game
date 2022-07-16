package edu.fiuba.algo3.modelo;


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

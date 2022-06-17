package edu.fiuba.algo3;

public class SinSalida implements PuntoEstable{
    private Cuadra cuadraSinSalida;
    private Sentido sentidoIngreso;
    public void agregarCuadra(Cuadra cuadra, Sentido sentido) {
        cuadraSinSalida = cuadra;
        sentidoIngreso = sentido;
    }
    public boolean validarSentido(Sentido sentido) {
        return sentido.validar(sentidoIngreso);
    }
    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo) {
        return cuadraSinSalida.siguientePunto(sentido, vehiculo);
    }
}

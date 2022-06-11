package edu.fiuba.algo3;

public class SinSalida implements PuntoEstable{
    private Cuadra cuadraSinSalida;
    private int direccion;

    public void agregarCuadra(Cuadra cuadra, int i) {
        cuadraSinSalida = cuadra;
        direccion = i;
    }
    public boolean validarSentido(Sentido sentido) {
        return sentido.validar(direccion);
    }

    public PuntoEstable siguientePunto(Sentido sentido, Jugador jugador) {
        return cuadraSinSalida.siguientePunto(sentido, jugador);
    }
}

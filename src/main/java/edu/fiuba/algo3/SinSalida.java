package edu.fiuba.algo3;

public class SinSalida implements PuntoEstable{
    private Cuadra cuadraSinSalida;
    private int direccion;

    public void agregarCuadra(Cuadra cuadra, int i) {
        cuadraSinSalida = cuadra;
        direccion = i;
    }
    public boolean validarSentido(Sentido sentido) {
        return false;
    }

    public PuntoEstable siguienteCruce(Sentido sentido, Vehiculo vehiculo) {
        return cuadraSinSalida.siguienteCruce(sentido, vehiculo);
    }
}

package edu.fiuba.algo3;

public class Meta implements PuntoEstable{
    private Jugador ocupante;
    private Cuadra cuadraSinSalida;
    private Sentido sentidoIngreso;

    public void agregarCuadra(Cuadra cuadra, Sentido sentido) {
        cuadraSinSalida = cuadra;
        sentidoIngreso = sentido;
    }

    public boolean validarSentido(Sentido sentido) {
        return false;
    }
    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo) {
        return this;
    }

    //public void consultarMetaVictoria(){}
}


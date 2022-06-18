package edu.fiuba.algo3;


public abstract class Sentido {
    static final int MOVER_ELEMENTO = 50;
    static final int MOVER_VEHICULO_X = 120;
    static final int MOVER_VEHICULO_Y = 90;
    static final int SIN_MOVER = 0;
    public enum Direccion {izquierda, derecha};
    public abstract String clave();
    public abstract Direccion cuadra();
    public abstract Direccion volver();
    public boolean validar(Sentido sentido) {
        return (clave().equals(sentido.clave()));
    }
    public abstract void moverGraficaVehiculo(GraficaVehiculo vehiculoGrafica);
    public abstract void moverGraficaElemento(GraficaElemento elementoGrafica);
}

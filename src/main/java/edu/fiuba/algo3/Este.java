package edu.fiuba.algo3;

public class Este extends Sentido {
    public String clave() {
        return "este";
    }
    public Direccion cuadra(){
        return Direccion.derecha;
    }
    public Direccion volver(){
        return Direccion.izquierda;
    }

    public void moverGraficaVehiculo(GraficaVehiculo vehiculoGrafica){
        vehiculoGrafica.avanzar(MOVER_VEHICULO_X, SIN_MOVER);
    }
    public void moverGraficaElemento(GraficaElemento elementoGrafica){
        elementoGrafica.avanzar(MOVER_ELEMENTO,SIN_MOVER);
    }
}

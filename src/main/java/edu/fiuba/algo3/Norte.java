package edu.fiuba.algo3;

public class Norte extends Sentido {
    public String clave() {
        return "norte";
    }
    public Direccion cuadra(){
        return Direccion.izquierda;
    }
    public Direccion volver(){
        return Direccion.derecha;
    }

    public void moverGraficaVehiculo(GraficaVehiculo vehiculoGrafica){
        vehiculoGrafica.avanzar(SIN_MOVER, -MOVER_VEHICULO_Y);
    }
    public void moverGraficaElemento(GraficaElemento elementoGrafica){
        elementoGrafica.avanzar(SIN_MOVER,-MOVER_ELEMENTO);
    }
}

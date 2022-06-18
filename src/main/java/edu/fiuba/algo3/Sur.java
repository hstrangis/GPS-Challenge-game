package edu.fiuba.algo3;

public class Sur extends Sentido{
    public String clave() {
        return "sur";
    }
    public Direccion cuadra(){
        return Direccion.derecha;
    }
    public Direccion volver() {
        return Direccion.izquierda;
    }

    public void moverGraficaVehiculo(GraficaVehiculo vehiculoGrafica){
        vehiculoGrafica.avanzar(SIN_MOVER,MOVER_VEHICULO_Y);
    }
    public void moverGraficaElemento(GraficaElemento elementoGrafica){
        elementoGrafica.avanzar(SIN_MOVER,MOVER_ELEMENTO);
    }
}

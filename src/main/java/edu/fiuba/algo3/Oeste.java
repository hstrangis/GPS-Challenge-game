package edu.fiuba.algo3;

public class Oeste extends Sentido{

    public String clave() {
        return "oeste";
    }
    public Direccion cuadra(){
        return Direccion.izquierda;
    }
    public Direccion volver(){
        return Direccion.derecha;
    }

    public void moverGraficaVehiculo(GraficaVehiculo vehiculoGrafica){
        vehiculoGrafica.avanzar(-MOVER_VEHICULO_X, SIN_MOVER);
    }
    public void moverGraficaElemento(GraficaElemento elementoGrafica){
        elementoGrafica.avanzar(-MOVER_ELEMENTO,SIN_MOVER);
    }
}

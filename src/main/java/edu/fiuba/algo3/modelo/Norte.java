package edu.fiuba.algo3.modelo;


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
    public void modificarCoordenada(Coordenada coordenada){
        coordenada.mover(SIN_MOVER,MOVER_PUNTO);
    }
    public void modificarCoordenadaElemento(Coordenada coordenada, double posicion){
        coordenada.mover(SIN_MOVER,-MOVER_ELEMENTO * posicion);
    }
}

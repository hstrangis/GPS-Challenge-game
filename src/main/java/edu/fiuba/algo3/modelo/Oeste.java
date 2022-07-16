package edu.fiuba.algo3.modelo;


public class Oeste extends Sentido {

    public String clave() {
        return "oeste";
    }
    public Direccion cuadra(){
        return Direccion.izquierda;
    }
    public Direccion volver(){
        return Direccion.derecha;
    }
    public void modificarCoordenada(Coordenada coordenada){
        coordenada.mover(MOVER_PUNTO,SIN_MOVER);
    }
    public void modificarCoordenadaElemento(Coordenada coordenada, double posicion){
        coordenada.mover(-MOVER_ELEMENTO * posicion, SIN_MOVER);
    }
}

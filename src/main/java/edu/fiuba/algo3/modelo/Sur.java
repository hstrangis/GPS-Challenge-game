package edu.fiuba.algo3.modelo;


public class Sur extends Sentido {
    public String clave() {
        return "sur";
    }
    public Direccion cuadra(){
        return Direccion.derecha;
    }
    public Direccion volver() {
        return Direccion.izquierda;
    }

    public void modificarCoordenada(Coordenada coordenada){
        coordenada.mover(SIN_MOVER,-MOVER_PUNTO);
    }
    public void modificarCoordenadaElemento(Coordenada coordenada, double posicion){
        coordenada.mover(SIN_MOVER, MOVER_ELEMENTO*posicion);
    }
}

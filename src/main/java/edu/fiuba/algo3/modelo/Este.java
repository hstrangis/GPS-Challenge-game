package edu.fiuba.algo3.modelo;


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
    public void modificarCoordenada(Coordenada coordenada){
        coordenada.mover(-MOVER_PUNTO,SIN_MOVER);
    }
    public void modificarCoordenadaElemento(Coordenada coordenada){
        coordenada.mover(MOVER_ELEMENTO,SIN_MOVER);
    }
}

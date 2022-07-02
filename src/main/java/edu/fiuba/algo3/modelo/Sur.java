package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.vista.SorpresaVista;
import edu.fiuba.algo3.vista.VehiculoVista;

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
    public void modificarCoordenadaElemento(Coordenada coordenada){
        coordenada.mover(SIN_MOVER,MOVER_ELEMENTO);
    }
}

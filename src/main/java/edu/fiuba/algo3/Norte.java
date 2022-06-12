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
}

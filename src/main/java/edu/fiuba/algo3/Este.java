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
}

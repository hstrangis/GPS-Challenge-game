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
}

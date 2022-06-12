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
}

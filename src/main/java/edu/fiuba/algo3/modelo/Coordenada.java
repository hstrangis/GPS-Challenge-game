package edu.fiuba.algo3.modelo;

public class Coordenada {
    private double x;
    private double y;

    Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y){
        this.x += x;
        this.y += y;
    }

    public Double coordenadaX(){
        return x;
    }
    public Double coordenadaY(){
        return y;
    }
}

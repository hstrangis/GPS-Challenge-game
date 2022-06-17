package edu.fiuba.algo3;

public class Movimientos {
    private double movimientos;

    Movimientos(){
        movimientos = 0;
    }

    public void sumar(int movimientos){
        this.movimientos += movimientos;
    }

    public void multiplicar(double porcentaje){
        this.movimientos *= porcentaje;
    }

    public double mostrar(){return movimientos;}
}

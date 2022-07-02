package edu.fiuba.algo3.modelo;

import javafx.scene.text.Text;

public class Movimientos {
    private double movimientos;

    public Movimientos(){
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

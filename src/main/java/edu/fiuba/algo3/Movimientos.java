package edu.fiuba.algo3;

import javafx.scene.text.Text;

public class Movimientos {
    private double movimientos;

    private Text aviso;

    Movimientos(){
        movimientos = 0;
    }

    Movimientos(Text aviso){
        movimientos = 0;
        this.aviso = aviso;
        this.aviso.setX(350);
        this.aviso.setY(200);
        String cartel = "Movimientos realizados: " + movimientos;
        aviso.setText(cartel);
    }

    private void actualizarAviso(){
        String cartel = "Movimientos realizados: " + movimientos;
        aviso.setText(cartel);
    }

    public void sumar(int movimientos){
        this.movimientos += movimientos;
        actualizarAviso();
    }

    public void multiplicar(double porcentaje){
        this.movimientos *= porcentaje;
        actualizarAviso();
    }

    public double mostrar(){return movimientos;}
}

package edu.fiuba.algo3.modelo;

public class Pozo extends Obstaculo {
    public Pozo(){};

    public String nombre(){return "file:src\\main\\java\\edu\\fiuba\\algo3\\pozo.png";}
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

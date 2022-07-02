package edu.fiuba.algo3.modelo;


import java.util.Random;

public class ControlPolicial extends Obstaculo {

    public ControlPolicial(){};

    public String nombre(){return "file:src\\main\\java\\edu\\fiuba\\algo3\\controlPolicial.png";}
    public boolean probabilidadDetencion(double probabilidad) {
        Random numeroAleatorio = new Random();
        return (numeroAleatorio.nextDouble() < probabilidad);
    }

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

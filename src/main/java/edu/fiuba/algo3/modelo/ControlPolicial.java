package edu.fiuba.algo3.modelo;


import java.util.Random;

public class ControlPolicial extends Obstaculo {

    public String nombre(){return "controlPolicial";}
    public boolean probabilidadDetencion(double probabilidad) {
        Random numeroAleatorio = new Random();
        return (numeroAleatorio.nextDouble() < probabilidad);
    }

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

package edu.fiuba.algo3;
import java.util.Random;

public class ControlPolicial extends Obstaculo {
    public boolean probabilidadDetencion(double probabilidad) {
        Random numeroAleatorio = new Random();
        return (numeroAleatorio.nextDouble() < probabilidad);
    }

    public boolean interactuar(Vehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

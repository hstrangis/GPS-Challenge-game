package edu.fiuba.algo3;
import java.util.Random;

public class ControlPolicial extends Obstaculo {
    public double probabilidadDetencion() {
        Random probabilidad = new Random();
        return probabilidad.nextDouble();
    }

    public boolean interactuar(Vehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

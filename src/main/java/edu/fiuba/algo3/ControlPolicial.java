package edu.fiuba.algo3;
import javafx.scene.image.Image;

import java.util.Random;

public class ControlPolicial extends Obstaculo {

    ControlPolicial(){};

    public void agregarGrafica(GraficaElemento diseño){
        this.diseño = diseño;
        diseño.cambiarDiseño(new Image("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\controlPolicial.png"));
    }
    public boolean probabilidadDetencion(double probabilidad) {
        Random numeroAleatorio = new Random();
        return (numeroAleatorio.nextDouble() < probabilidad);
    }

    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

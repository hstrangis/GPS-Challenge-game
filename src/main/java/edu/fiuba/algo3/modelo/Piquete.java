package edu.fiuba.algo3.modelo;


import edu.fiuba.algo3.modelo.Obstaculo;


public class Piquete extends Obstaculo {
    public Piquete(){};

    public String nombre(){return "file:src\\main\\java\\edu\\fiuba\\algo3\\piquete.png";}
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

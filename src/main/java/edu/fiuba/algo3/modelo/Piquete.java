package edu.fiuba.algo3.modelo;


import edu.fiuba.algo3.modelo.Obstaculo;


public class Piquete extends Obstaculo {
    public Piquete(){};

    public String nombre(){return "piquete";}
    public boolean interactuar(EstadoVehiculo vehiculo){
        return vehiculo.interactuar(this);
    }
}

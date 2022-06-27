package edu.fiuba.algo3;

import javafx.scene.image.Image;

public class CuatroxCuatro extends EstadoVehiculo {
    private int pozosPisados;

    CuatroxCuatro(){}
    CuatroxCuatro(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    @Override
    public boolean interactuar(Pozo pozo) {
        pozosPisados += 1;
        if (pozosPisados == 3) {
            vehiculo.movimientos.sumar(2);
            pozosPisados = 0;
        }
        return true;
    }
    @Override
    public boolean interactuar(ControlPolicial control){
        if(control.probabilidadDetencion(0.3)){
            vehiculo.movimientos.sumar(3);
        }
        return true;
    }
    @Override
    public boolean interactuar(Piquete piquete){
        return false;
    }

    public EstadoVehiculo crearSiguiente(){
        return new Moto(vehiculo);
    }

    public String diseño(){ return "file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\4x4.png"; }
}

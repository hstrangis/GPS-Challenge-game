package edu.fiuba.algo3;

public class CuatroxCuatro extends Vehiculo{
    private int pozosPisados;

    CuatroxCuatro(){
        this.movimientos = 0;
    }
    CuatroxCuatro(int movimientos){
        this.movimientos = movimientos;
    }
    @Override
    public boolean interactuar(Pozo pozo) {
        pozosPisados += 1;
        if (pozosPisados == 3) {
            movimientos += 2;
            pozosPisados = 0;
        }
        return true;
    }
    @Override
    public boolean interactuar(ControlPolicial control){
        if(control.probabilidadDetencion(0.3)){
            movimientos += 3;
        }
        return true;
    }
    @Override
    public boolean interactuar(Piquete piquete){
        return false;
    }

    public Vehiculo crearSiguiente(){
        return new Moto(movimientos);
    }
}

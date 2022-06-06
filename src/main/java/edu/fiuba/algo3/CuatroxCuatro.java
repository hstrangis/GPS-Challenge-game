package edu.fiuba.algo3;

public class CuatroxCuatro extends Vehiculo{
    private int pozosPisados;
    @Override
    protected boolean interactuar(Pozo pozo) {
        pozosPisados += 1;
        if (pozosPisados == 3) {
            movimientos += 2;
            pozosPisados = 0;
        }
        return true;
    }
    @Override
    protected boolean interactuar(ControlPolicial control){
        return true;
    }
    @Override
    protected boolean interactuar(Piquete piquete){
        return false;
    }
}

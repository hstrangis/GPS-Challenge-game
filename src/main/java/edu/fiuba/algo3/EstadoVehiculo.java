package edu.fiuba.algo3;

public abstract class EstadoVehiculo {
    protected Vehiculo vehiculo;
    public void configurar(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    protected boolean interactuar(Favorable favorable){
        favorable.actuar(vehiculo.movimientos);
        return true;
    }
    protected boolean interactuar(Desfavorable desfavorable){
        desfavorable.actuar(vehiculo.movimientos);
        return true;
    }
    protected boolean interactuar(CambioVehiculo cambioVehiculo){
        vehiculo.cambiarEstado(crearSiguiente());
        return true;
    }
    protected abstract boolean interactuar(Pozo pozo);
    protected abstract boolean interactuar(ControlPolicial control);
    protected abstract boolean interactuar(Piquete piquete);
    protected abstract EstadoVehiculo crearSiguiente();
}

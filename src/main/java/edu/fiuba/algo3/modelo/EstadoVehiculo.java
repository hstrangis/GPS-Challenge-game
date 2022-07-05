package edu.fiuba.algo3.modelo;

public abstract class EstadoVehiculo {
    protected Vehiculo vehiculo;
    public void configurar(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    protected void interactuar(Favorable favorable){
        favorable.actuar(vehiculo.movimientos);
    }
    protected void interactuar(Desfavorable desfavorable){
        desfavorable.actuar(vehiculo.movimientos);
    }
    protected void interactuar(CambioVehiculo cambioVehiculo){
        vehiculo.cambiarEstado(crearSiguiente());
    }
    protected abstract boolean interactuar(Pozo pozo);
    protected abstract boolean interactuar(ControlPolicial control);
    protected abstract boolean interactuar(Piquete piquete);
    protected abstract EstadoVehiculo crearSiguiente();

    protected abstract String nombre();
}

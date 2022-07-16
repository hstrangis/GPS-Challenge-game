package edu.fiuba.algo3.modelo;

public abstract class EstadoVehiculo {
    protected Vehiculo vehiculo;
    public void configurar(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    protected boolean interactuar(Favorable favorable){
        favorable.actuar(vehiculo.movimientos());
        return true;
    }
    protected boolean interactuar(Desfavorable desfavorable){
        desfavorable.actuar(vehiculo.movimientos());
        return true;
    }
    protected boolean interactuar(CambioVehiculo cambioVehiculo){
        vehiculo.cambiarEstado(crearSiguiente());
        return true;
    }

    protected boolean interactuar(Especial especial){
        boolean permiso;
        if (vehiculo.movimientos().cantidad() % 2 == 0) {
            permiso = this.interactuar(new CambioVehiculo());
        }
        else
            permiso = this.interactuar(new Piquete());
        return permiso;
    }
    protected abstract boolean interactuar(Pozo pozo);
    protected abstract boolean interactuar(ControlPolicial control);
    protected abstract boolean interactuar(Piquete piquete);
    protected abstract EstadoVehiculo crearSiguiente();

    public abstract String nombre();
}

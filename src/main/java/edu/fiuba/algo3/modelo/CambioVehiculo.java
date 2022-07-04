package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Sorpresa;

public class CambioVehiculo extends Sorpresa {

    public CambioVehiculo(){};
    public void interactuar(EstadoVehiculo vehiculo){ vehiculo.interactuar(this);
    }
}

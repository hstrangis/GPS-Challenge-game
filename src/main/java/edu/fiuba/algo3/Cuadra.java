package edu.fiuba.algo3;

public class Cuadra {
    private PuntoEstable[] cruces;
    private Elemento[] elementos;

    Cuadra(PuntoEstable izquierdo, PuntoEstable derecho){
        cruces = new PuntoEstable[2];
        cruces[0] = izquierdo;
        cruces[1] = derecho;
    }

    public PuntoEstable siguienteCruce(Sentido sentido, Vehiculo vehiculo) {
        interactuar(vehiculo);
        return cruces[sentido.cuadra()];
    }

    private void interactuar(Vehiculo vehiculo){
        for(int x=0;  x < elementos.length; x++){
            vehiculo.interactuar(elementos[x]);
        }
    }
}

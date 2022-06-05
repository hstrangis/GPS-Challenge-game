package edu.fiuba.algo3;

import static edu.fiuba.algo3.Este.este;
import static edu.fiuba.algo3.Norte.norte;
import static edu.fiuba.algo3.Oeste.oeste;
import static edu.fiuba.algo3.Sur.sur;

public class Ciudad {
    private Cruce[][] matrizMapa;

    Ciudad(int largo, int ancho) {
        crearMapa(largo, ancho);
    }

    private void crearMapa(int largo, int ancho) {
        Cruce actual;
        SinSalida borde;
        matrizMapa = new Cruce[largo][ancho];
        for (int fila = 0; fila < largo; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                actual = new Cruce();
                matrizMapa[fila][columna] = actual;
                if (columna != 0)
                    crearCuadra(matrizMapa[fila][columna - 1], actual, este, oeste);
                else {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, este, oeste);
                }
                if (fila != 0)
                    crearCuadra(matrizMapa[fila - 1][columna], actual, sur, norte);
                else {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, sur, norte);
                }
                if (columna == ancho-1) {
                    borde = new SinSalida();
                    crearCuadra(actual, borde, este, oeste);
                }
                if (fila == largo-1) {
                    borde = new SinSalida();
                    crearCuadra(actual, borde, sur, norte);

                }
            }
        }
    }

    private void crearCuadra(PuntoEstable cruce, PuntoEstable cruceLlegada, int direccion, int direccionInversa){
        Cuadra cuadra = new Cuadra(cruce, cruceLlegada);
        cruce.agregarCuadra(cuadra, direccion);
        cruceLlegada.agregarCuadra(cuadra, direccionInversa);
    }


    public void agregarElemento(Elemento elemento, int fila, int columna, Sentido sentido){
        matrizMapa[fila][columna].agregarElemento(elemento, sentido);
    }

    public Cruce puntoPartida(){
        return matrizMapa[0][0];
    }


}

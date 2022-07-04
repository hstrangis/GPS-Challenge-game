package edu.fiuba.algo3.modelo;

import javafx.scene.Group;
import javafx.scene.shape.Rectangle;

import java.util.concurrent.ThreadLocalRandom;

public class Ciudad {

    private Cruce[][] matrizMapa;
    private int largoMapa = 0;
    private int anchoMapa = 0;

    Ciudad(int largo, int ancho, Meta meta) {
        crearMapa(largo, ancho, meta);
    }


    private void crearMapa(int largo, int ancho, Meta meta) {
        Cruce actual;
        SinSalida borde;
        largo = largo - 1;
        ancho = ancho - 1;
        largoMapa = largo;
        anchoMapa = ancho;
        int filaMeta = (int) (Math.random() * (largo));
        matrizMapa = new Cruce[largo][ancho];
        for (int fila = 0; fila < largo; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                actual = new Cruce(columna, fila);
                matrizMapa[fila][columna] = actual;
                if (columna != 0)
                    crearCuadra(matrizMapa[fila][columna - 1], actual, new Este(), new Oeste());
                else {
                    borde = new SinSalida(columna, fila);
                    crearCuadra(borde, actual, new Este(), new Oeste());
                }
                if (fila != 0)
                    crearCuadra(matrizMapa[fila - 1][columna], actual, new Sur(), new Norte());
                else {
                    borde = new SinSalida(columna, fila);
                    crearCuadra(borde, actual, new Sur(), new Norte());
                }
                if (columna == ancho-1 && fila == filaMeta) {
                    meta.asignarCoordenadas(columna, fila);
                    crearCuadra(actual, meta, new Este(), new Oeste());
                }
                else if (columna == ancho-1) {
                    borde = new SinSalida(columna, fila);
                    crearCuadra(actual, borde, new Este(), new Oeste());
                }
                if (fila == largo-1) {
                    borde = new SinSalida(columna, fila);
                    crearCuadra(actual, borde, new Sur(), new Norte());
                }
            }
        }
    }

    private void crearCuadra(PuntoEstable cruce, PuntoEstable cruceLlegada, Sentido sentido, Sentido sentidoInverso){
        Cuadra cuadra = new Cuadra(cruce, cruceLlegada);
        cruce.agregarCuadra(cuadra, sentido);
        cruceLlegada.agregarCuadra(cuadra, sentidoInverso);
    }

    public void agregarObstaculo(Obstaculo obstaculo, int fila, int columna, Sentido sentido){
        matrizMapa[fila][columna].agregarObstaculo(obstaculo, sentido);
        obstaculo.agregarCoordenadas(columna, fila, sentido);
    }
    public void agregarSorpresa(Sorpresa sorpresa, int fila, int columna, Sentido sentido){
        matrizMapa[fila][columna].agregarSorpresa(sorpresa, sentido);
        sorpresa.agregarCoordenadas(columna, fila, sentido);
    }
    public void prepararJugador(Jugador jugador){
        jugador.asignarPuntoPartida(matrizMapa[0][0]);
    }

}


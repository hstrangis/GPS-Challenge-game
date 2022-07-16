package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.*;

public class SorteadorElementos {

    private final MapaVista mapa;

    private final Juego juego;

    private final int ancho;
    private final int largo;

    public SorteadorElementos(Juego juego, MapaVista mapa, int largo, int ancho){
        this.mapa = mapa;
        this.juego = juego;
        this.largo = largo-1;
        this.ancho = ancho-1;
        this.llenarCiudad();
    }

    private void crearSorpresa(){
        Sorpresa sorpresa;
        int sorteo = (int) (Math.random() * (4));
        switch (sorteo) {
            case 0:
                sorpresa = new Favorable();
                break;
            case 1:
                sorpresa = new Desfavorable();
                break;
            case 2:
                sorpresa = new Especial();
                break;
            default:
                sorpresa = new CambioVehiculo();
                break;
        }
        juego.agregarSorpresa(sorpresa, (int) (Math.random() * (largo)), (int) (Math.random() * (ancho)), sorteoSentido());
        SorpresaVista sorpresaVista = new SorpresaVista(sorpresa);
        mapa.agregarSorpresa(sorpresaVista);
    }

    private void crearObstaculo(){
        Obstaculo obstaculo;
        int sorteo = (int) (Math.random() * (3));
        switch (sorteo) {
            case 0:
                obstaculo = new Piquete();
                break;
            case 1:
                obstaculo = new Pozo();
                break;
            default:
                obstaculo = new ControlPolicial();
                break;
        }
        juego.agregarObstaculo(obstaculo, (int) (Math.random() * (largo)), (int) (Math.random() * (ancho)), sorteoSentido());
        ObstaculoVista obstaculoVista = new ObstaculoVista(obstaculo);
        mapa.agregarVista(obstaculoVista);
    }

    private void llenarCiudad() {
        for (int i = 0; i < 6; i++) {
            crearObstaculo();
        }
        for (int i = 0; i < 6; i++) {
            crearSorpresa();
        }
    }

    public Sentido sorteoSentido() {
        Sentido sentido;
        int sorteo = (int) (Math.random() * (2));
        switch (sorteo) {
            case 0:
                sentido = new Este();
                break;
            default:
                sentido = new Sur();
                break;
        }
        return sentido;
    }

}

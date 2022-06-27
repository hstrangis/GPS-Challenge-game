package edu.fiuba.algo3;

import javafx.scene.Group;

public class Meta implements PuntoEstable{
    private Jugador jugador;

    private Grafica diseño;

    Meta(Grafica diseño){
        this.diseño = diseño;
    }
    public void agregarCuadra(Cuadra cuadra, Sentido sentido) {}

    public void configurar(Jugador jugador){
        this.jugador = jugador;
    }
    public boolean validarSentido(Sentido sentido) {
        return false;
    }
    public PuntoEstable siguientePunto(Sentido sentido, Vehiculo vehiculo) {
        return this;
    }

    public boolean consultarVictoria(){
        return jugador.consultarPosicion(this);
    }

    public void implementarGrafica(int x, int y, Group root){
        diseño.configurarGrafica(root);
        diseño.ubicar(x, y);
        diseño.cambiarDiseño("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\meta.png");
        diseño.cambiarTamaño(60,60);
    }

}


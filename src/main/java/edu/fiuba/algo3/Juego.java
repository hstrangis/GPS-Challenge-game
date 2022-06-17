package edu.fiuba.algo3;

public class Juego {
    private Ciudad ciudad;
    protected Jugador jugador;

    Juego(int largo, int ancho){
        ciudad = new Ciudad(largo, ancho);
    }

    public void jugar(String nick, Vehiculo vehiculo){
        jugador = new Jugador(nick, vehiculo, ciudad.puntoPartida());
    }

    public void moverse(Sentido sentido){
        jugador.moverse(sentido);
    }

    public void agregarElemento(Elemento elemento, int fila, int columna, Sentido sentido) {
        ciudad.agregarElemento(elemento, fila, columna, sentido);
    }
    //Para pruebas
    public Cruce puntoPartida(){
        return ciudad.puntoPartida();
    }




}

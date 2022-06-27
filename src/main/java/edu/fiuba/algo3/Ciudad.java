package edu.fiuba.algo3;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ciudad {
    static final int INICIAL_X = 280;
    static final int INICIAL_Y = 325;
    private Cruce[][] matrizMapa;
    private int largoMapa = 0;
    private int anchoMapa = 0;

    private Meta meta;
    private final Group root;

    Ciudad(int largo, int ancho, Meta meta) {
        this.root = new Group();
        //root.setManaged(false);
        this.meta = meta;
        crearMapa(largo, ancho);
        for (int fila = 0; fila < largo; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                this.root.getChildren().add(new Rectangle(210 + columna*120, 250 + fila*120, 80,80));
            }
        }
    }

    Ciudad(int largo, int ancho, Group root, Meta meta) {
        this.root = root;
        this.meta = meta;
        crearMapa(largo, ancho);
        for (int fila = 0; fila < largo; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                this.root.getChildren().add(new Rectangle(210 + columna*120, 250 + fila*120, 80,80));
            }
        }
    }

    private void crearMapa(int largo, int ancho) {
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
                actual = new Cruce();
                matrizMapa[fila][columna] = actual;
                if (columna != 0)
                    crearCuadra(matrizMapa[fila][columna - 1], actual, new Este(), new Oeste());
                else {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, new Este(), new Oeste());
                }
                if (fila != 0)
                    crearCuadra(matrizMapa[fila - 1][columna], actual, new Sur(), new Norte());
                else {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, new Sur(), new Norte());
                }
                if (columna == ancho-1 && fila == filaMeta) {
                    crearCuadra(actual, meta, new Este(), new Oeste());
                    colocarGraficaMeta(fila, columna);
                }
                else if (columna == ancho-1) {
                    borde = new SinSalida();
                    crearCuadra(actual, borde, new Este(), new Oeste());
                }
                if (fila == largo-1) {
                    borde = new SinSalida();
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

    public void agregarElemento(Elemento elemento, int fila, int columna, Sentido sentido){
        elemento.implementarGrafica(INICIAL_X + 12 + (columna)*120, INICIAL_Y + 12 + (fila)*120,root);
        matrizMapa[fila][columna].agregarElemento(elemento, sentido);
    }
    private PuntoEstable puntoPartidaAleatorio() {
        int filaAleartoria, columnaAleatoria;
        columnaAleatoria = ThreadLocalRandom.current().nextInt(1, anchoMapa);
        if (columnaAleatoria == 1) {
            filaAleartoria = ThreadLocalRandom.current().nextInt(1, largoMapa);
        }
        else filaAleartoria = new Random().nextBoolean() ? 1 : largoMapa - 1;
        return matrizMapa[filaAleartoria][columnaAleatoria];
    }
    public void prepararJugador(Jugador jugador){
        jugador.asignarPuntoPartida(matrizMapa[0][0]);
        jugador.vehiculo().implementarGrafica(INICIAL_X + 5 + (0)*120, INICIAL_Y + 3 + (0)*90, root);
        //jugador.asignarPuntoPartida(puntoPartidaAleatorio());
        meta.configurar(jugador);
    }

    public boolean chequearVictoria(){
        boolean victoria = meta.consultarVictoria();
        if (victoria){
            Text text = new Text("Felicitaciones, has llegado a la meta!!");
            text.setTabSize(200);
            text.resizeRelocate(340, 50, 100, 100);
            root.getChildren().add(text);
        }
        return victoria;
    }

    private void colocarGraficaMeta(int fila, int columna){
        meta.implementarGrafica(INICIAL_X + 5 + (columna)*170, INICIAL_Y + (fila)*120, root);
    }

}


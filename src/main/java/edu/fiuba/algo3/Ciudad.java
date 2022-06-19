package edu.fiuba.algo3;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Ciudad {
    static final int INICIAL_X = 280;
    static final int INICIAL_Y = 300;
    private Cruce[][] matrizMapa;

    private Meta meta;
    private final Group root;

    Ciudad(int largo, int ancho, Group root) {
        this.root = root;
        colocarGraficaMeta();
        crearMapa(largo, ancho);
        for (int fila = 0; fila < largo; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                this.root.getChildren().add(new Rectangle(210 + columna*120, 250 + fila*90, 80,60));
            }
        }
    }

    private void crearMapa(int largo, int ancho) {
        Cruce actual;
        SinSalida borde;
        largo = largo - 1;
        ancho = ancho - 1;
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
                if (columna == ancho-1 && fila == 1) {
                    crearCuadra(actual, meta, new Este(), new Oeste());
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
        matrizMapa[fila][columna].agregarElemento(elemento, sentido);
        ImageView imageView = new ImageView();
        root.getChildren().add(imageView);
        GraficaElemento elementoDiseño = new GraficaElemento(imageView);
        elementoDiseño.ubicar(INICIAL_X + 5 + (columna)*120, INICIAL_Y + 10 + (fila)*90);
        elementoDiseño.moverse(sentido);
        elemento.agregarGrafica(elementoDiseño);
    }

    public Cruce puntoPartida(Vehiculo vehiculo){
        ImageView imageView = new ImageView();
        root.getChildren().add(imageView);
        GraficaVehiculo vehiculoDiseño = new GraficaVehiculo(imageView);
        vehiculoDiseño.ubicar(INICIAL_X,INICIAL_Y);
        vehiculo.agregarGrafica(vehiculoDiseño);
        return matrizMapa[0][0];
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

    public void agregarMeta(Jugador jugador){
        meta.configurar(jugador);
    }

    private void colocarGraficaMeta(){
        meta = new Meta();
        Image meta = new Image("file:D:\\Documentos\\FIUBA\\programacion\\java\\algo3_tp2\\src\\main\\java\\edu\\fiuba\\algo3\\meta.png");
        ImageView imageView = new ImageView(meta);
        imageView.setFitHeight(60);
        imageView.setFitWidth(110);
        imageView.setX(600);
        imageView.setY(385);
        this.root.getChildren().add(imageView);
    }

}


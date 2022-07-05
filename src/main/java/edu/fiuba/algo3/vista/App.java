package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controles.ComenzarJuego;
import edu.fiuba.algo3.controles.ControlesMoverse;
import edu.fiuba.algo3.controles.FinalizarJuego;
import edu.fiuba.algo3.controles.VerRanking;
import edu.fiuba.algo3.modelo.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Un paseo en Buenos Aires");

        //Inicializacion mapa
        Movimientos movimientos = new Movimientos();
        Meta meta = new Meta();
        Vehiculo vehiculo = new Vehiculo(new Auto(), movimientos);
        Juego juego = new Juego(4,4, meta);
        CambioVehiculo cambioVehiculo = new CambioVehiculo();
        Favorable favorable = new Favorable();
        Piquete piquete = new Piquete();
        Pozo pozo = new Pozo();
        juego.agregarObstaculo(piquete, 0,0, new Sur());
        juego.agregarObstaculo(pozo, 0,0, new Este());
        juego.agregarObstaculo(new ControlPolicial(), 0,1, new Este());
        juego.agregarObstaculo(new Piquete(), 1,1, new Este());
        juego.agregarObstaculo(new Pozo(), 1,1, new Este());
        juego.agregarSorpresa(cambioVehiculo, 0,0, new Sur());
        juego.agregarSorpresa(favorable, 0,0, new Sur());



        //Inicializacion de la entrada
        MapaVista mapa = new MapaVista(4,4);
        Principal principal = new Principal(juego, movimientos, mapa);
        MetaVista metaVista = new MetaVista(meta);
        RankingVista rankingVista = new RankingVista(juego);
        SorpresaVista cambioVehiculoVista = new SorpresaVista(cambioVehiculo);
        SorpresaVista favorableVista = new SorpresaVista(favorable);
        ObstaculoVista piqueteVista = new ObstaculoVista(piquete);
        ObstaculoVista pozoVista = new ObstaculoVista(pozo);
        mapa.agregarSorpresa(cambioVehiculoVista);
        mapa.agregarSorpresa(favorableVista);
        mapa.agregarVista(metaVista);
        mapa.agregarVista(piqueteVista);
        mapa.agregarVista(pozoVista);
        FinalizarJuego accionTerminar = new FinalizarJuego(stage);
        ComenzarJuego accionComenzar = new ComenzarJuego(juego, vehiculo, principal, stage);

        VerRanking accionVerRanking = new VerRanking(stage, rankingVista);
        Entrada inicio = new Entrada(juego, vehiculo, accionComenzar);
        Salida salida = new Salida(juego, accionTerminar, accionVerRanking, accionComenzar);
        Scene entrada = new Scene(inicio, 240, 100);
        mapa.agregarSalida(salida);
        stage.setScene(entrada);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
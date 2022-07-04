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

    //public inicializarVistas
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
        juego.agregarSorpresa(cambioVehiculo, 0,0, new Sur());
        juego.agregarObstaculo(piquete, 1,0, new Sur());
        juego.agregarObstaculo(pozo, 0,0, new Este());
        juego.agregarObstaculo(new ControlPolicial(), 0,1, new Este());
        juego.agregarSorpresa(favorable, 1,1, new Este());
        juego.agregarObstaculo(new Piquete(), 1,1, new Este());
        juego.agregarObstaculo(new Pozo(), 1,1, new Este());



        //Inicializacion de la entrada
        Principal principal = new Principal(juego, movimientos);
        MetaVista metaVista = new MetaVista(meta);
        RankingVista rankingVista = new RankingVista(juego);
        SorpresaVista cambioVehiculoVista = new SorpresaVista(cambioVehiculo);
        SorpresaVista favorableVista = new SorpresaVista(favorable);
        ObstaculoVista piqueteVista = new ObstaculoVista(piquete);
        ObstaculoVista pozoVista = new ObstaculoVista(pozo);
        principal.agregarVista(cambioVehiculoVista);
        principal.agregarVista(favorableVista);
        principal.agregarVista(metaVista);
        principal.agregarVista(piqueteVista);
        principal.agregarVista(pozoVista);
        ComenzarJuego accionComenzar = new ComenzarJuego(juego, vehiculo, principal, stage);
        FinalizarJuego accionTerminar = new FinalizarJuego(stage);
        VerRanking accionVerRanking = new VerRanking(stage, rankingVista);
        Entrada inicio = new Entrada(juego, vehiculo, accionComenzar);
        Salida salida = new Salida(juego, accionTerminar, accionVerRanking, accionComenzar);
        Scene entrada = new Scene(inicio, 240, 100);
        Scene fin = new Scene(salida,240, 140);
        //stage.setScene(entrada);
        stage.setScene(fin);

        stage.setResizable(false);

        stage.show();
        //stage.setOnCloseRequest(e->accionTerminar);

    }

    public static void main(String[] args) {
        launch();
    }

}
package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controles.ComenzarJuego;
import edu.fiuba.algo3.controles.ControlesMoverse;
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
        juego.agregarElemento(cambioVehiculo, 0,0, new Sur());
        juego.agregarElemento(piquete, 1,0, new Sur());
        juego.agregarElemento(pozo, 0,0, new Este());
        juego.agregarElemento(new ControlPolicial(), 0,1, new Este());
        juego.agregarElemento(favorable, 1,1, new Este());
        juego.agregarElemento(new Piquete(), 1,1, new Este());
        juego.agregarElemento(new Pozo(), 1,1, new Este());



        //Inicializacion de la entrada
        Principal principal = new Principal(juego, movimientos);
        MetaVista metaVista = new MetaVista(meta);
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
        Entrada inicio = new Entrada(juego, vehiculo, accionComenzar);
        Scene entrada = new Scene(inicio, 240, 100);
        stage.setScene(entrada);




        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}
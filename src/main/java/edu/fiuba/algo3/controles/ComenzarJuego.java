package edu.fiuba.algo3.controles;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.Movimientos;
import edu.fiuba.algo3.modelo.Vehiculo;
import edu.fiuba.algo3.vista.Principal;
import edu.fiuba.algo3.vista.VehiculoVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ComenzarJuego implements EventHandler<ActionEvent> {
    private Vehiculo vehiculo;
    private Juego juego;
    private TextField nombre;
    private Stage stage;

    private Principal principal;


    public ComenzarJuego(Juego juego, Vehiculo vehiculo, Principal principal, Stage stage){
        this.juego = juego;
        this.vehiculo = vehiculo;
        this.nombre = nombre;
        this.stage = stage;
        this.principal = principal;
    }

    public void agregarNombreJugador(TextField nombre){
        this.nombre = nombre;
    }

    public void handle(ActionEvent e) {
        juego.jugar(nombre.getText(), vehiculo);
        stage.close();
        Scene pantallaJuego = new Scene(principal, 840, 780);
        principal.inicializar(pantallaJuego, vehiculo);
        stage.setScene(pantallaJuego);
        stage.show();
    }
}

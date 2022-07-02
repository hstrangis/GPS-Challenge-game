package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controles.ControlesMoverse;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.Movimientos;
import edu.fiuba.algo3.modelo.Vehiculo;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class Principal extends Group {
    private MovimientosVista movimientosVista;
    private Juego juego;

   public Principal(Juego juego, Movimientos movimientos){
       this.getChildren().add(new MapaVista(4,4, 1,1));
       movimientosVista = new MovimientosVista(movimientos, 1, 1);
       this.getChildren().add(movimientosVista);
       this.juego = juego;
   }

   public void inicializar(Scene escena, Vehiculo vehiculo){
       VehiculoVista vehiculoVista = new VehiculoVista(vehiculo, juego.jugador());
       this.getChildren().add(vehiculoVista);
       ControlesMoverse controles = new ControlesMoverse(juego, movimientosVista, vehiculoVista);
       escena.setOnKeyPressed(controles);
       vehiculoVista.actualizar();
   }


    public void agregarVista(ImageView vista){
        this.getChildren().add(vista);
    }

}

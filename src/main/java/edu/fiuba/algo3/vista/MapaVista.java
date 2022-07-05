package edu.fiuba.algo3.vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class MapaVista extends Group {
    static final int INICIAL_X = 270;
    static final int INICIAL_Y = 390;

    static final int DISTANCIA_PUNTOS = 190;

    private VehiculoVista vehiculo;

    private Salida salida;

    private List<SorpresaVista> sorpresas;

    MapaVista(int largo, int ancho){
        sorpresas = new ArrayList<>();
        for (int fila = 0; fila < largo; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                this.getChildren().add(new Rectangle(130 + columna*190, 250 + fila*190, 120,120));
            }
        }
    }

    public void agregarVehiculo(VehiculoVista vehiculo){
        this.vehiculo = vehiculo;
        this.getChildren().add(vehiculo);
    }

    public void agregarSorpresa(SorpresaVista sorpresa){
        sorpresas.add(sorpresa);
        this.getChildren().add(sorpresa);
    }

    public void agregarVista(ImageView vista){
        this.getChildren().add(vista);
    }

    public void agregarSalida(Salida salida) {
        this.salida = salida;
    }

    public void actualizar(){
        vehiculo.actualizar();
        for (SorpresaVista sorpresa : sorpresas){
            sorpresa.actualizar();
        }
    }
    public void agregarBotonContinuar() {
        Button continuarButton = new Button("Continuar");
        continuarButton.setTranslateY(150);
        continuarButton.setTranslateX(97);
        this.getChildren().add(continuarButton);
        continuarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = new Stage();
                Scene fin = new Scene(salida,240, 140);
                stage.initModality(Modality.WINDOW_MODAL);
                stage.setScene(fin);
                stage.show();
            }
        });
    }
}

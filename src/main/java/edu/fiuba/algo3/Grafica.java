package edu.fiuba.algo3;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Grafica {
    protected ImageView skin;

    public void configurarGrafica(Group root){
        root.getChildren().add(skin);
    }

    public void cambiarTamaño(int largo, int ancho){
        this.skin.setFitHeight(largo);
        this.skin.setFitWidth(ancho);
    }

    public void cambiarDiseño(String direccion){
        Image imagen = new Image(direccion);
        skin.setImage(imagen);
    }

    public void eliminarDiseño(){
        skin.setImage(null);
    }

    public void ubicar(int x, int y){
        skin.setX(x);
        skin.setY(y);
    }

    public void avanzar(int x, int y){
        skin.setX(skin.getX() + x);
        skin.setY(skin.getY() + y);
    }

    public abstract void moverse(Sentido sentido);
}

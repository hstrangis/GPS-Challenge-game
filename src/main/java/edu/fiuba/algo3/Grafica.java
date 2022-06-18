package edu.fiuba.algo3;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Grafica {
    protected ImageView skin;

    public void cambiarDiseño(Image imagen){
        skin.setImage(imagen);
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

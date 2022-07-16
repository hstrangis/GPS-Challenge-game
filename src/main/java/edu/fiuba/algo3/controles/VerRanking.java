package edu.fiuba.algo3.controles;


import edu.fiuba.algo3.vista.RankingVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VerRanking implements EventHandler<ActionEvent> {
    private final RankingVista ranking;
    private final Stage stage;

    public VerRanking(Stage stage, RankingVista ranking){
        this.ranking = ranking;
        this.stage = stage;
    }

    public void handle(ActionEvent e) {
        stage.close();
        ranking.inicializar();
        Scene pantallaRanking = new Scene(ranking,200, 50 + ranking.alturaPantalla());
        stage.setScene(pantallaRanking);
        stage.show();
    }
}

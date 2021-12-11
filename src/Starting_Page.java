import javafx.animation.TranslateTransition;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.Node;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Starting_Page implements Initializable {
    @FXML
    private ImageView newgame;
    @FXML
    private ImageView exit;
    @FXML
    private ImageView load;
    @FXML
    private ImageView armorhero;
    @FXML
    private ImageView tigerhero;
    @FXML
    private ImageView orc;
    @FXML
    private ImageView orcboss;
    @FXML
    private ImageView princess;
    @FXML
    private ImageView logo;
    @FXML
    private ImageView comeon;



    private Stage stage;
    private Scene scene;
    // private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition newgame_A=new TranslateTransition();
        newgame_A.setNode(newgame);
        newgame_A.setByY(-3);
        newgame_A.setCycleCount(1000);
        newgame_A.setAutoReverse(true);
        newgame_A.setDuration(Duration.millis(500));
        newgame_A.play();

        TranslateTransition exit_A=new TranslateTransition();
        exit_A.setNode(exit);
        exit_A.setByY(-3);
        exit_A.setCycleCount(1000);
        exit_A.setAutoReverse(true);
        exit_A.setDuration(Duration.millis(500));
        exit_A.play();

        TranslateTransition load_A=new TranslateTransition();
        load_A.setNode(load);
        load_A.setByY(-3);
        load_A.setCycleCount(1000);
        load_A.setAutoReverse(true);
        load_A.setDuration(Duration.millis(500));
        load_A.play();

        TranslateTransition armorhero_A=new TranslateTransition();
        armorhero_A.setNode(armorhero);
        armorhero_A.setByY(-120);
        armorhero_A.setCycleCount(1000);
        armorhero_A.setAutoReverse(true);
        armorhero_A.setDuration(Duration.millis(900));
        armorhero_A.play();

        TranslateTransition tigerhero_A=new TranslateTransition();
        tigerhero_A.setNode(tigerhero);
        tigerhero_A.setByY(-120);
        tigerhero_A.setCycleCount(1000);
        tigerhero_A.setAutoReverse(true);
        tigerhero_A.setDuration(Duration.millis(700));
        tigerhero_A.play();

        TranslateTransition orc_A=new TranslateTransition();
        orc_A.setNode(orc);
        orc_A.setByY(-120);
        orc_A.setCycleCount(1000);
        orc_A.setAutoReverse(true);
        orc_A.setDuration(Duration.millis(850));
        orc_A.play();

        TranslateTransition comeon_A=new TranslateTransition();
        comeon_A.setNode(comeon);
        comeon_A.setByY(-120);
        comeon_A.setCycleCount(1000);
        comeon_A.setAutoReverse(true);
        comeon_A.setDuration(Duration.millis(850));
        comeon_A.play();

        TranslateTransition orcboss_A=new TranslateTransition();
        orcboss_A.setNode(orcboss);
        orcboss_A.setByY(-40);
        orcboss_A.setCycleCount(1000);
        orcboss_A.setAutoReverse(true);
        orcboss_A.setDuration(Duration.millis(500));
        orcboss_A.play();

        TranslateTransition princess_A=new TranslateTransition();
        princess_A.setNode(princess);
        princess_A.setByY(-30);
        princess_A.setCycleCount(1000);
        princess_A.setAutoReverse(true);
        princess_A.setDuration(Duration.millis(650));
        princess_A.play();

        TranslateTransition logo_A=new TranslateTransition();
        logo_A.setNode(logo);
        logo_A.setByY(-5);
        logo_A.setCycleCount(1000);
        logo_A.setAutoReverse(true);
        logo_A.setDuration(Duration.millis(750));
        logo_A.play();



    }
    


    

    public void new_game(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Newgame.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void exit(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("The_World.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void load(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Loadgame.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}


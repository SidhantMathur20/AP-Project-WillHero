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

public class forloadgame implements Initializable{

    @FXML
    private ImageView entername;
    @FXML
    private ImageView Back;

    private Stage stage;
    private Scene scene;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        TranslateTransition entername_A=new TranslateTransition();
        entername_A.setNode(entername);
        entername_A.setByY(-3);
        entername_A.setCycleCount(1000);
        entername_A.setAutoReverse(true);
        entername_A.setDuration(Duration.millis(500));
        entername_A.play();

        TranslateTransition Back_A=new TranslateTransition();
        Back_A.setNode(Back);
        Back_A.setByY(-3);
        Back_A.setCycleCount(1000);
        Back_A.setAutoReverse(true);
        Back_A.setDuration(Duration.millis(500));
        Back_A.play();
        
        
    }

    public void goBack(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
}

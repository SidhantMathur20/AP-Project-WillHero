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

public class forpause implements Initializable{

    @FXML
    private ImageView Back;

    @FXML
    private ImageView exit;
    


    private Stage stage;
    private Scene scene;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }

    public void goBack(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("checking.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void ex(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
}

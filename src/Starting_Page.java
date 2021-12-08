import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.*;
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


    private Stage stage;
    private Scene scene;
    private Parent root;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        newgame.setStyle("-fx-font-weight: bold");
        exit.setStyle("-fx-font-weight: bold");
        load.setStyle("-fx-font-weight: bold");

    }
}


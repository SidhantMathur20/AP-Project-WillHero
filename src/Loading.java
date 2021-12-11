import javafx.animation.AnimationTimer;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Loading implements Initializable {

    @FXML
    private ImageView rotator;

    @FXML
    private ImageView hero;

    int time=0;

    private Stage stage;
    private Scene scene;
   

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        TranslateTransition hero_A=new TranslateTransition();
        hero_A.setNode(hero);
        hero_A.setByY(-20);
        hero_A.setCycleCount(Integer.MAX_VALUE);
        hero_A.setAutoReverse(true);
        hero_A.setDuration(Duration.millis(500));
        hero_A.play();


        RotateTransition rot=new RotateTransition();
        rot.setNode(rotator);
        rot.setCycleCount(100000);
        rot.setDuration(Duration.millis(400));
        rot.setByAngle(360);
        rot.play();

        

        class mytimer extends AnimationTimer {
           
            @Override
            public void handle(long l) {
                time++;
                if (time>500) {
                    try {
                        go();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

        AnimationTimer timer=new mytimer();
        timer.start();
    }

    public void go() throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
        // stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}

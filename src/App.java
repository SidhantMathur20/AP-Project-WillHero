// package com.example.hellofx;
//package FX_Practice;



import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.text.Font;
import javafx.util.Duration;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.*;


public class App extends Application {

    

    


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primarystage) throws IOException {
        Scanner sc=new Scanner(System.in);

        int check=1;//sc.nextInt();
        if (check==1) {
            try {
                Parent root=FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
                Scene scene=new Scene(root);

                primarystage.setScene(scene);
                primarystage.initStyle(StageStyle.TRANSPARENT);
                primarystage.show();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
        

        

}




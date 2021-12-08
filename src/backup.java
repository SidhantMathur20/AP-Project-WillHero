// package com.example.hellofx;
//package FX_Practice;



import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.util.Duration;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.*;


public class backup extends Application {


    public int distance=0;
    public int collected_coins=0;
    
    public boolean bool=true;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) throws IOException {

        ArrayList<Object_Dimenstions> blocks_dimensions=new ArrayList<>();
        ArrayList<ImageView> blocks=new ArrayList<>();
        ArrayList<Object_Dimenstions> coins=new ArrayList<>();
        ArrayList<ImageView> coins_=new ArrayList<>();

        


        primarystage.setTitle("Will Hero");
        Button btn=new Button("OK");


        Image background_image=new Image("file:///Users/sidhantmathur/IdeaProjects/HelloFX/src/main/resources/com/example/hellofx/Images/The_world_background.jpeg");
        ImageView background=new ImageView(background_image);

        background.setFitWidth(1000);
        background.setFitHeight(800);

        Image parent_block_image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/block1.jpg");
        ImageView parent_block=new ImageView(parent_block_image);
        blocks.add(parent_block);

        Image player_image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hero.png");
        ImageView Player=new ImageView(player_image);

        

        Player.setFitHeight(125);
        Player.setFitWidth(125);
//        Player.relocate(100,320);
        Player.setX(100);
        Player.setY(200);

        
        Label disLabel=new Label();
        disLabel.setText(Integer.toString(distance));
        disLabel.setStyle("-fx-text-fill:WHITE; -fx-font-size: 40; -fx-font-weight: bold;");
        disLabel.relocate(480, 0);

        Label coinLabel=new Label();
        coinLabel.setText(Integer.toString(collected_coins));
        coinLabel.setStyle("-fx-text-fill:YELLOW; -fx-font-size: 40; -fx-font-weight: bold;");
        coinLabel.relocate(930, 0);

        



        btn.setOnAction(e -> { 
             
            disLabel.setText(Integer.toString(++distance));

            

            for (int i=0;i<blocks.size();i++) {
                blocks.get(i).setX(blocks.get(i).getX()-100);
            }
            for (int i=0;i<blocks_dimensions.size();i++) {
                blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()-100);
        
            }
        
            for (int i=0;i<coins_.size();i++) {
                coins_.get(i).setX(coins_.get(i).getX()-100);
            }
            for (int i=0;i<coins.size();i++) {
                coins.get(i).set_x(coins.get(i).get_x()-100);
        
            }
        });


        AnchorPane pane=new AnchorPane();
        pane.getChildren().addAll(background,btn,parent_block,Player,disLabel,coinLabel);


        parent_block.relocate(100,400);
        parent_block.setFitWidth(500);

        blocks_dimensions.add(new Object_Dimenstions(100,400,500,parent_block.getFitHeight()));

        double parentX=100;
        double parentY=400;

        for (int i=0;i<100;i++) {
            ImageView temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/block1.jpg");

            parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

            temp.relocate(parentX,parentY);

            double width=500-Math.random()*200;
            temp.setFitWidth(width);
//            System.out.println(width);

            double height=400-Math.random()*300;
            temp.setFitHeight(height);


            if (Math.random()>0.50) {
                Image weapon_Chest_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Weapon_Chest.png");
                ImageView Weapon_Chest = new ImageView(weapon_Chest_Image);

                Weapon_Chest.setFitHeight(70);
                Weapon_Chest.setFitWidth(70);

                Weapon_Chest.relocate(parentX + Math.random() * width * 0.8, 330);

                blocks.add(Weapon_Chest);
                pane.getChildren().add(Weapon_Chest);
            }


            if (Math.random()>0.50) {
            

                Image coin_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Coin.png");
                ImageView coin = new ImageView(coin_Image);

                coin.setFitHeight(40);
                coin.setFitWidth(40);

                // coin.relocate(parentX + Math.random() * width * 0.8, 330);
                coin.setX(parentX + Math.random() * width * 0.8);
                coin.setY(330);

                coins.add(new Object_Dimenstions(coin.getX(),coin.getY(),40,40));
                coins_.add(coin);
                pane.getChildren().add(coin);
            }

            blocks_dimensions.add(new Object_Dimenstions(parentX,parentY,width,height));

            blocks.add(temp);


            pane.getChildren().add(temp);


        }

        Scene scene=new Scene(pane,1000,800);

        primarystage.setScene(scene);
        primarystage.show();

        

        class mytimer extends AnimationTimer {
           
            @Override
            public void handle(long l) {
                
                int helper=0;

                Object_Dimenstions current_block=blocks_dimensions.get(0);

                boolean b=false;

                for (int i=0;i<blocks_dimensions.size()-1;i++) {

                    
                    if (blocks_dimensions.get(i).get_x()<240 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>135 && blocks_dimensions.get(i).get_y()>Player.getY()+105) {
                        
                        helper=1;
                        current_block=blocks_dimensions.get(i);
                        break;
                    }
  
                }

                if (bool==true) {
                    Player.setY(Player.getY()+3);
                    if(current_block.get_y()<Player.getY()+105) {
                        bool=false;
                    }
                }
                if (bool==false) {
                    Player.setY(Player.getY()-3);
                    System.out.println(Player.getY());
                    if(100>Player.getY()) {
                        bool=true;
                    }
                }
                if (helper==0 && Player.getY()>270) {
                    TranslateTransition trans=new TranslateTransition();
                    trans.setNode(Player);
                    trans.setByY(2000);
                    trans.play();
                }
                

                System.out.println(Player.getY());


                for (int i=0;i<coins.size();i++) {
                    
                    
                    if (coins.get(i).get_x()<180 && coins.get(i).get_x()>100 && coins.get(i).get_y()-60<=Player.getY()) {
                        
                        coins_.get(i).relocate(-1000, -1000);
                        b=true;
                        break;
                        
                    }
                }

                if (b==true) {
                    coinLabel.setText(Integer.toString(++collected_coins));
                }

                
            }
        };

        AnimationTimer timer=new mytimer();
        timer.start();

    }


}

class Object_Dimenstions {

    private double x;
    private double y;
    private double width;
    private double height;


    Object_Dimenstions(double x,double y,double width,double height) {
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public void set_x(double x) {
        this.x=x;
    }
    public double get_x() {
        return this.x;
    }

    public void set_y(double y) {
        this.y=y;
    }
    public double get_y() {
        return this.y;
    }

    public double get_width() {
        return this.width;
    }
    public double get_height() {
        return this.height;
    }



}


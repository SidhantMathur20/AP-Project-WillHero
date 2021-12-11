// package com.example.hellofx;
//package FX_Practice;



import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
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

    ArrayList<ImageView> scenery=new ArrayList<>(); 

    ArrayList<Object_Dimenstions> blocks_dimensions=new ArrayList<>();
    ArrayList<ImageView> blocks=new ArrayList<>();
    ArrayList<Object_Dimenstions> coins=new ArrayList<>();
    ArrayList<ImageView> coins_=new ArrayList<>();

    ArrayList<ImageView> weaponchest_imageArray=new ArrayList<>();
    ArrayList<Object_Dimenstions> weaponchest_dimentsionsArray=new ArrayList<>();

    public int distance=0;
    public int collected_coins=0;
    
    public boolean bool=true;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) throws IOException {
        try {
            Parent root=FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
            Scene scene=new Scene(root);
            scene.setFill(Color.TRANSPARENT);

            primarystage.setScene(scene);
            primarystage.initStyle(StageStyle.TRANSPARENT);
            primarystage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        

        


//         primarystage.setTitle("Will Hero");
//         Button btn=new Button("OK");


//         Image background_image=new Image("file:///Users/sidhantmathur/IdeaProjects/HelloFX/src/main/resources/com/example/hellofx/Images/The_world_background.jpeg");
//         ImageView background=new ImageView(background_image);

//         background.setFitWidth(1000);
//         background.setFitHeight(800);

//         Image parent_block_image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_4.png");
//         ImageView parent_block=new ImageView(parent_block_image);
//         blocks.add(parent_block);

//         Image player_image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hero.png");
//         ImageView Player=new ImageView(player_image);

        

//         Player.setFitHeight(125);
//         Player.setFitWidth(125);
// //        Player.relocate(100,320);
//         Player.setX(100);
//         Player.setY(200);

        
//         Label disLabel=new Label();
//         disLabel.setText(Integer.toString(distance));
//         disLabel.setStyle("-fx-text-fill:WHITE; -fx-font-size: 40; -fx-font-weight: bold;");
//         disLabel.relocate(480, 0);

//         Label coinLabel=new Label();
//         coinLabel.setText(Integer.toString(collected_coins));
//         coinLabel.setStyle("-fx-text-fill:YELLOW; -fx-font-size: 40; -fx-font-weight: bold;");
//         coinLabel.relocate(930, 0);

        



//         btn.setOnAction(e -> { 
             
//             disLabel.setText(Integer.toString(++distance));

//             // TranslateTransition trans=new TranslateTransition();

//             for (int i=0;i<blocks.size();i++) {
//                 // trans.setNode(blocks.get(i));
//                 // trans.setByX(blocks.get(i).getX()-100);
//                 blocks.get(i).setX(blocks.get(i).getX()-100);
//             }
//             for (int i=0;i<blocks_dimensions.size();i++) {
//                 blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()-100);
        
//             }
        
//             for (int i=0;i<coins_.size();i++) {
//                 // trans.setNode(coins_.get(i));
//                 // trans.setByX(coins_.get(i).getX()-100);
//                 coins_.get(i).setX(coins_.get(i).getX()-100);
//             }
//             for (int i=0;i<coins.size();i++) {
//                 coins.get(i).set_x(coins.get(i).get_x()-100);
        
//             }


//             for (int i=0;i<scenery.size();i++) {
//                 scenery.get(i).setX(scenery.get(i).getX()-20);
//             }
//         });


//         AnchorPane pane=new AnchorPane();
//         pane.getChildren().add(background);



//         // For Clouds and islands
//         double cloud_x=20;
//         double cloud_y=20;

//         double islands_x=20;
//         double islands_y=20;

//         for (int i=0;i<50;i++) {
            

//             ImageView cloud=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Cloud.png");
//             Random rand = new Random();
//             double x = cloud_x + rand.nextDouble(500);
//             double y = cloud_y + rand.nextDouble(500);

//             double opacity=rand.nextDouble(1);

//             cloud.setOpacity(opacity);

//             cloud.setX(x);
//             cloud.setY(y);

//             cloud_x=x;

//             scenery.add(cloud);

//             pane.getChildren().add(cloud);

//             int island_type=rand.nextInt(6)+1;

//             // ImageView temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/block1.jpg");
//             ImageView islands;
//             if (island_type==1) {
//                 islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_1.png");
                
//             }
//             else if (island_type==2) {
//                 islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_2.png");
                
//             }
//             else if (island_type==3) {
//                 islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_3.png");
                
//             }
//             else if (island_type==4) {
//                 islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_4.png");
                
//             }
//             else if (island_type==5) {
//                 islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_5.png");
                
//             }
//             else {
//                 islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_6.png");

//             }
     
//             double isl_x = islands_x + rand.nextDouble(500);
//             double isl_y = islands_y + rand.nextDouble(500);

//             opacity=rand.nextDouble(0.6);

//             islands.setOpacity(opacity);

//             islands.setX(isl_x);
//             islands.setY(isl_y);

//             islands_x=isl_x;
//             scenery.add(islands);

//             pane.getChildren().add(islands);
//         }

//         pane.getChildren().addAll(btn,parent_block,disLabel,coinLabel);

//         // parent_block.relocate(100,400);
//         parent_block.setX(100);
//         parent_block.setY(280);
//         parent_block.setFitWidth(500);

//         blocks_dimensions.add(new Object_Dimenstions("island_4",100,400,500,parent_block.getFitHeight()));

//         double parentX=100;
//         double parentY=400;

//         for (int i=0;i<50;i++) {
//             Random rand = new Random();
//             int island_type = rand.nextInt(6)+1;

//             // ImageView temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/block1.jpg");
//             double wid=500-Math.random()*200;


//             double heig=400-Math.random()*300;

//             ImageView temp;
//             if (island_type==1) {
//                 temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_1.png");
//                 parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

//                 // temp.relocate(parentX,270);
//                 temp.setX(parentX);
//                 int height=rand.nextInt(100);
//                 temp.setY(270+height);
//                 parentY=270+height+130;

//                 blocks_dimensions.add(new Object_Dimenstions("island_1",parentX,parentY,temp.getFitWidth(),heig));
//             }
//             else if (island_type==2) {
//                 temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_2.png");
//                 parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

//                 // temp.relocate(parentX,200);
//                 temp.setX(parentX);
//                 int height=rand.nextInt(100);
//                 temp.setY(380+height);
//                 parentY=380+height+10;

//                 blocks_dimensions.add(new Object_Dimenstions("island_2",parentX,parentY,temp.getFitWidth(),heig));
//             }
//             else if (island_type==3) {
//                 temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_3.png");
//                 parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

//                 // temp.relocate(parentX,380);
//                 temp.setX(parentX);
//                 int height=rand.nextInt(100);
//                 temp.setY(380+height);
//                 parentY=380+height+30;

//                 blocks_dimensions.add(new Object_Dimenstions("island_3",parentX,parentY,temp.getFitWidth(),heig));
//             }
//             else if (island_type==4) {
//                 temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_4.png");
//                 parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

//                 // temp.relocate(parentX,270);
//                 temp.setX(parentX);

//                 int height=rand.nextInt(100);
//                 temp.setY(270+height);
//                 parentY=270+height+120;

//                 blocks_dimensions.add(new Object_Dimenstions("island_4",parentX,parentY,temp.getFitWidth(),heig));
//             }
//             else if (island_type==5) {
//                 temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_5.png");
//                 parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

//                 // temp.relocate(parentX,270);
//                 temp.setX(parentX);
//                 int height=rand.nextInt(100);
//                 temp.setY(260+height);
//                 parentY=260+height+135;

//                 blocks_dimensions.add(new Object_Dimenstions("island_5",parentX,parentY,temp.getFitWidth(),heig));
//             }
//             else {
//                 temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_6.png");
//                 parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

//                 // temp.relocate(parentX,270);
//                 temp.setX(parentX);
//                 int height=rand.nextInt(100);
//                 temp.setY(260+height);
//                 parentY=260+height+190;

//                 blocks_dimensions.add(new Object_Dimenstions("island_6",parentX,parentY,temp.getFitWidth(),heig));

//             }
            
//             // temp.setPreserveRatio(true);

            
//             pane.getChildren().add(temp);

            



//             if (Math.random()>0.80) {
//                 Image weapon_Chest_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Weapon_Chest.png");
//                 ImageView Weapon_Chest = new ImageView(weapon_Chest_Image);

//                 Weapon_Chest.setFitHeight(70);
//                 Weapon_Chest.setFitWidth(90);

                

//                 if (island_type==1) {
//                     Weapon_Chest.setX(temp.getX() + 145);
//                     Weapon_Chest.setY(temp.getY()+ 64);
//                 }
//                 else if (island_type==2) {
//                     Weapon_Chest.setX(temp.getX() + 100);
//                     Weapon_Chest.setY(temp.getY()-52);
//                 }
//                 else if (island_type==3) {
//                     Weapon_Chest.setX(temp.getX() + 175);
//                     Weapon_Chest.setY(temp.getY()-35);
//                 }
//                 else if (island_type==4) {
//                     Weapon_Chest.setX(temp.getX() + 187);
//                     Weapon_Chest.setY(temp.getY()+60);
//                 }
//                 else if (island_type==5) {
//                     Weapon_Chest.setX(temp.getX() + 50);
//                     Weapon_Chest.setY(temp.getY()+75);
//                 }
//                 else {
//                     Weapon_Chest.setX(temp.getX() + 125);
//                     Weapon_Chest.setY(temp.getY()+125);
//                 }
                
//                 blocks.add(Weapon_Chest);
//                 weaponchest_imageArray.add(Weapon_Chest);
//                 // weaponchest_dimentsionsArray.add(new Object_Dimenstions("weapong_chest",Weapon_Chest.getX(),Weapon_Chest.getY(),Weapon_Chest.getFitWidth(),Weapon_Chest.getFitHeight()));
//                 pane.getChildren().add(Weapon_Chest);
//             }


//             if (Math.random()>0.50) {
            

//                 Image coin_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Coin.png");
//                 ImageView coin = new ImageView(coin_Image);

//                 coin.setFitHeight(40);
//                 coin.setFitWidth(40);

//                 // coin.relocate(parentX + Math.random() * width * 0.8, 330);
//                 coin.setX(parentX + Math.random() * wid * 0.8);
//                 coin.setY(330);

//                 coins.add(new Object_Dimenstions("coin",coin.getX(),coin.getY(),40,40));
//                 coins_.add(coin);
//                 pane.getChildren().add(coin);
//             }

            

//             blocks.add(temp);


            


//         }
//         pane.getChildren().addAll(Player);

//         Scene scene=new Scene(pane,1000,800);

//         primarystage.setScene(scene);
//         primarystage.show();

        

//         class mytimer extends AnimationTimer {
           
//             @Override
//             public void handle(long l) {
                
//                 int helper=0;

//                 // Object_Dimenstions current_block=blocks_dimensions.get(0);
//                 Object_Dimenstions current_block=null;

//                 boolean b=false;

//                 for (int i=0;i<blocks_dimensions.size()-1;i++) {

                    
//                     // if (blocks_dimensions.get(i).get_x()<240 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>135 && blocks_dimensions.get(i).get_y()>Player.getY()+105) {
                        
//                     //     helper=1;
//                     //     current_block=blocks_dimensions.get(i);
//                     //     break;
//                     // }

//                     //------------------

//                     if (blocks_dimensions.get(i).get_type().equals("island_1") && blocks_dimensions.get(i).get_x()<170 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-220) {
                        
//                         helper=1;
//                         current_block=blocks_dimensions.get(i);
//                         System.out.println("Stay_1");
//                         break;
//                     }
//                     if (blocks_dimensions.get(i).get_type().equals("island_2") && blocks_dimensions.get(i).get_x()<180 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-135) {
                        
//                         helper=1;
//                         current_block=blocks_dimensions.get(i);
//                         System.out.println("Stay_2");
//                         break;
//                     }
//                     if (blocks_dimensions.get(i).get_type().equals("island_3") && blocks_dimensions.get(i).get_x()<160 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-300) {
                        
//                         helper=1;
//                         current_block=blocks_dimensions.get(i);
//                         System.out.println("Stay_3");
//                         break;
//                     }
//                     if (blocks_dimensions.get(i).get_type().equals("island_4") && blocks_dimensions.get(i).get_x()<180 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-250) {
                        
//                         helper=1;
//                         current_block=blocks_dimensions.get(i);
//                         System.out.println("Stay_4");
//                         break;
//                     }
//                     if (blocks_dimensions.get(i).get_type().equals("island_5") && blocks_dimensions.get(i).get_x()<180 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-120) {
                        
//                         helper=1;
//                         current_block=blocks_dimensions.get(i);
//                         System.out.println("Stay_5");
//                         break;
//                     }
//                     if (blocks_dimensions.get(i).get_type().equals("island_6") && blocks_dimensions.get(i).get_x()<160 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-220) {
                        
//                         helper=1;
//                         current_block=blocks_dimensions.get(i);
//                         System.out.println("Stay_6");
//                         break;
//                     }
  
//                 }
                

//                 if (bool==true) {
//                     Player.setY(Player.getY()+3);
//                     if (current_block==null && Player.getY()>470) {
//                         RotateTransition rot=new RotateTransition();
//                         TranslateTransition trans=new TranslateTransition();
//                         rot.setNode(Player);
//                         trans.setNode(Player);
//                         rot.setDuration(Duration.millis(100));
//                         rot.setByAngle(180);
//                         trans.setByY(2000);
//                         trans.play();
//                         rot.play();
//                     }
//                     else if(current_block!=null && current_block.get_y()<Player.getY()+105) {
//                         bool=false;
//                     }
//                 }
//                 if (bool==false) {
//                     Player.setY(Player.getY()-3);
//                     if(100>Player.getY()) {
//                         bool=true;
//                     }
//                 }
//                 // if (current_block==null && Player.getY()>400) {
//                 //     TranslateTransition trans=new TranslateTransition();
//                 //     trans.setNode(Player);
//                 //     trans.setByY(2000);
//                 //     trans.play();
//                 // }
//                 if (helper==0) {
//                     System.out.println("fall");
//                 }
                





//                 for (int i=0;i<coins.size();i++) {
                    
                    
//                     if (coins.get(i).get_x()<180 && coins.get(i).get_x()>50 && coins.get(i).get_y()-60<=Player.getY()) {
//                         TranslateTransition trans=new TranslateTransition();
//                         RotateTransition rot = new RotateTransition();
//                         FadeTransition fade = new FadeTransition();
//                         trans.setNode(coins_.get(i));
//                         rot.setNode(coins_.get(i));
//                         rot.setAxis(Rotate.Y_AXIS);
//                         rot.setDuration(Duration.millis(100));
//                         rot.setByAngle(180);
//                         trans.setByY(-50);
//                         fade.setFromValue(1);
//                         fade.setToValue(0);
//                         fade.setDuration(Duration.millis(1000));
//                         rot.play();
//                         trans.play();
//                         fade.play();

//                         // coins_.get(i).relocate(-1000, -1000);
//                         b=true;
//                         break;
                        
//                     }
//                 }

//                 if (b==true) {
//                     coinLabel.setText(Integer.toString(++collected_coins));
//                 }

//                 for (int i=0;i<scenery.size();i++) {
//                     scenery.get(i).setX(scenery.get(i).getX()-0.05);
//                 }

                
//             }
//         };

//         AnimationTimer timer=new mytimer();
//         timer.start();
        


        
    }


}

class Object_Dimenstions {

    private String type;
    private double x;
    private double y;
    private double width;
    private double height;

    private ImageView image;


    Object_Dimenstions(String type,double x,double y,double width,double height) {
        this.type = type;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public void set_type(String type) {
        this.type = type;
    }
    public String get_type() {
        return this.type;
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


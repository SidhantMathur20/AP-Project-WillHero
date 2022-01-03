import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.transform.Rotate;

import javafx.util.Duration;

import javafx.scene.Node;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;


public class kyc implements Initializable {

    
    @FXML
    private AnchorPane pane;

    private Scene scene;

    private String Player_Name;
    private ArrayList<ImageView> scenery=new ArrayList<>(); 

    private ArrayList<Object_Dimenstions> blocks_dimensions=new ArrayList<>();
    private ArrayList<ImageView> blocks=new ArrayList<>();
    private ArrayList<Object_Dimenstions> coins=new ArrayList<>();
    private ArrayList<ImageView> coins_=new ArrayList<>();

    private ArrayList<ImageView> weaponchest_imageArray=new ArrayList<>();
    private ArrayList<Object_Dimenstions> weaponchest_dimentsionsArray=new ArrayList<>();
    private ArrayList<String> chest_type=new ArrayList<>();

    private ArrayList<ImageView> normalorc_imageArray=new ArrayList<>();
    private ArrayList<Object_Dimenstions> normalorc_dimentsionsArray=new ArrayList<>();

    private int distance=0;
    private int collected_coins=0;
    
    private boolean bool=true;
    private boolean bool2=false;

    private boolean boolforTNT=false;
    private int TNT_Time=0;

    // private Stage primarystage;

    private double TNTFade=1;
    private int Coin_Animation_Time=0;

    private Object_Dimenstions currentTNT=null;

    private boolean for_Collision=false;

    private int ForDie=0;

    private Object_Dimenstions boss_D;

    private ImageView weapon_in_Hand;
    private boolean is_hammer_allowed=false;
    private boolean is_sword_allowed=false;

    private int sword_damage=30;
    private int hammer_damage=30;

    private String current_weapon="Nothing";


    private int Boss_Health=120;


    private ImageView Exit_Layout;
    private ImageView Return_Layout;

    private Image Revive_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Revive.png");
    private ImageView Revive=new ImageView(Revive_Image);

    private Image Exit_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Exit.png");
    private ImageView Ex=new ImageView(Exit_Image);

    private Image Score_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Score.png");
    private ImageView Score=new ImageView(Score_Image);

    private Label forscore=new Label();
    
    private Image Distance_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Distance.png");
    private ImageView Distance=new ImageView(Distance_Image);

    private Label fordistance=new Label();

    private Image player_image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hero.png");
    private ImageView Player=new ImageView(player_image);
    

    private boolean killed=false;

    private int dyingtime=0;

    private TextField for_new_game;
    private TextField for_load_game;

    private ImageView Entername=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Enterthename.png");
    private ImageView LoadGame=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Enterthename.png");

    private AnimationTimer timer;

    private Label disLabel=new Label();

    private Label coinLabel=new Label();


    private Image transparent_image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/transparent.png");
    private ImageView transparent=new ImageView(transparent_image);

    private Image Sword_Slot_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Sword_Slot.png");
    private ImageView Sword_Slot=new ImageView(Sword_Slot_Image);

    private Image Hammer_Slot_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hammer_Slot.png");
    private ImageView Hammer_Slot=new ImageView(Hammer_Slot_Image);

    private boolean paused=false;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Image TNT_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/TNT.png");
        // ImageView TNT = new ImageView(TNT_Image);

        // TNT.setX(30);
        // TNT.setY(30);
        // TNT.setPreserveRatio(true);
        Scanner sc=new Scanner(System.in);

        int check=2;//sc.nextInt();
        // if (check==1) {
        //     try {
        //         Parent root=FXMLLoader.load(getClass().getResource("checking.fxml"));
        //         Scene scene=new Scene(root);
        //         // scene.setFill(Color.TRANSPARENT);

        //         primarystage.setScene(scene);
        //         primarystage.initStyle(StageStyle.TRANSPARENT);
        //         primarystage.show();
        //     }
        //     catch (Exception e) {
        //         e.printStackTrace();
        //     }
        // }
        

        
        if (check==2) {

            // primarystage.setTitle("Will Hero");
            Button btn=new Button("OK");
            btn.setLayoutX(-200);

            Image background_image=new Image("file:///Users/sidhantmathur/IdeaProjects/HelloFX/src/main/resources/com/example/hellofx/Images/The_world_background.jpeg");
            ImageView background=new ImageView(background_image);

            background.setFitWidth(1000);
            background.setFitHeight(800);

            Image parent_block_image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_4.png");
            ImageView parent_block=new ImageView(parent_block_image);
            blocks.add(parent_block);

            

            

            Player.setFitHeight(125);
            Player.setFitWidth(125);
    //        Player.relocate(100,320);
            Player.setX(100);
            Player.setY(200);

            
            
            disLabel.setText(Integer.toString(distance));
            disLabel.setStyle("-fx-text-fill:WHITE; -fx-font-size: 40; -fx-font-weight: bold;");
            disLabel.relocate(480, 0);

            Label coinLabel=new Label();
            coinLabel.setText(Integer.toString(collected_coins));
            coinLabel.setStyle("-fx-text-fill:YELLOW; -fx-font-size: 40; -fx-font-weight: bold;");
            coinLabel.relocate(930, 0);

            



            btn.setOnKeyPressed(e -> { 
                
                if (e.getCode() == KeyCode.SPACE && paused==false) {
                    disLabel.setText(Integer.toString(++distance));

                    // TranslateTransition trans=new TranslateTransition();

                    for (int i=0;i<blocks.size();i++) {
                        // trans.setNode(blocks.get(i));
                        // trans.setByX(blocks.get(i).getX()-100);
                        // for (int j=0;j<100;j++) {
                        blocks.get(i).setX(blocks.get(i).getX()-100);
                        // }
                    }
                    for (int i=0;i<blocks_dimensions.size();i++) {
                        // for (int j=0;j<100;j++) {
                        blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()-100);
                        // }
                        
                
                    }
                
                    for (int i=0;i<coins_.size();i++) {
                        // trans.setNode(coins_.get(i));
                        // trans.setByX(coins_.get(i).getX()-100);
                        // for (int j=0;j<100;j++) {
                        coins_.get(i).setX(coins_.get(i).getX()-100);
                        // }
                    }
                    for (int i=0;i<coins.size();i++) {
                        // for (int j=0;j<100;j++) {
                        coins.get(i).set_x(coins.get(i).get_x()-100);
                        // }
                
                    }

                    for (int i=0;i<weaponchest_dimentsionsArray.size();i++) {
                        // for (int j=0;j<-100;j++) {
                        weaponchest_dimentsionsArray.get(i).set_x(weaponchest_dimentsionsArray.get(i).get_x()-100);
                        // }
                    }


                    for (int i=0;i<scenery.size();i++) {
                        // for (int j=0;j<-20;j++) {
                        scenery.get(i).setX(scenery.get(i).getX()-20);
                        // }
                    }

                    // boss_D.set_x(boss_D.get_x()-100);
                }
            });


            // AnchorPane pane=new AnchorPane();
            pane.getChildren().add(background);



            // For Clouds and islands
            double cloud_x=20;
            double cloud_y=20;

            double islands_x=20;
            double islands_y=20;

            for (int i=0;i<20;i++) {
                

                ImageView cloud=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Cloud.png");
                Random rand = new Random();
                double x = cloud_x + rand.nextDouble(500);
                double y = cloud_y + rand.nextDouble(500);

                double opacity=rand.nextDouble(1);

                cloud.setOpacity(opacity);

                cloud.setX(x);
                cloud.setY(y);

                cloud_x=x;

                scenery.add(cloud);

                pane.getChildren().add(cloud);

                int island_type=rand.nextInt(6)+1;

                // ImageView temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/block1.jpg");
                ImageView islands;
                if (island_type==1) {
                    islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_1.png");
                    
                }
                else if (island_type==2) {
                    islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_2.png");
                    
                }
                else if (island_type==3) {
                    islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_3.png");
                    
                }
                else if (island_type==4) {
                    islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_4.png");
                    
                }
                else if (island_type==5) {
                    islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_5.png");
                    
                }
                else {
                    islands=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_6.png");

                }
        
                double isl_x = islands_x + rand.nextDouble(500);
                double isl_y = islands_y + rand.nextDouble(500);

                opacity=rand.nextDouble(0.6);

                islands.setOpacity(opacity);

                islands.setX(isl_x);
                islands.setY(isl_y);

                islands_x=isl_x;
                scenery.add(islands);

                pane.getChildren().add(islands);
            }

            pane.getChildren().addAll(btn,parent_block,disLabel,coinLabel);

            // parent_block.relocate(100,400);
            parent_block.setX(100);
            parent_block.setY(280);
            parent_block.setFitWidth(500);

            blocks_dimensions.add(new Object_Dimenstions("island_4",100,400,100,parent_block.getFitHeight()));

            double parentX=100;
            double parentY=400;

            for (int i=0;i<20;i++) {
                Random rand = new Random();
                int island_type = rand.nextInt(6)+1;

                // ImageView temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/block1.jpg");
                double wid=500-Math.random()*200;


                double heig=400-Math.random()*300;

                double f=Math.random();

                ImageView temp;
                if (island_type==1) {
                    temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_1.png");
                    parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

                    // temp.relocate(parentX,270);
                    temp.setX(parentX);
                    int height=rand.nextInt(100);
                    temp.setY(270+height);
                    parentY=270+height+130;

                    blocks_dimensions.add(new Object_Dimenstions("island_1",parentX,parentY,temp.getFitWidth(),heig));
                }
                else if (island_type==2) {
                    temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_2.png");
                    parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

                    // temp.relocate(parentX,200);
                    temp.setX(parentX);
                    int height=rand.nextInt(100);
                    temp.setY(380+height);
                    parentY=380+height+10;

                    blocks_dimensions.add(new Object_Dimenstions("island_2",parentX,parentY,temp.getFitWidth(),heig));
                }
                else if (island_type==3) {
                    temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_3.png");
                    parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

                    // temp.relocate(parentX,380);
                    temp.setX(parentX);
                    int height=rand.nextInt(100);
                    temp.setY(380+height);
                    parentY=380+height+30;

                    blocks_dimensions.add(new Object_Dimenstions("island_3",parentX,parentY,temp.getFitWidth(),heig));
                }
                else if (island_type==4) {
                    temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_4.png");
                    parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

                    // temp.relocate(parentX,270);
                    temp.setX(parentX);

                    int height=rand.nextInt(100);
                    temp.setY(270+height);
                    parentY=270+height+120;

                    blocks_dimensions.add(new Object_Dimenstions("island_4",parentX,parentY,temp.getFitWidth(),heig));
                }
                else if (island_type==5) {
                    temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_5.png");
                    parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

                    // temp.relocate(parentX,270);
                    temp.setX(parentX);
                    int height=rand.nextInt(100);
                    temp.setY(260+height);
                    parentY=260+height+135;

                    blocks_dimensions.add(new Object_Dimenstions("island_5",parentX,parentY,temp.getFitWidth(),heig));
                }
                else {
                    temp=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_6.png");
                    parentX=parentX+parent_block.getFitWidth()+Math.random()*100;

                    // temp.relocate(parentX,270);
                    temp.setX(parentX);
                    int height=rand.nextInt(100);
                    temp.setY(260+height);
                    parentY=260+height+190;

                    blocks_dimensions.add(new Object_Dimenstions("island_6",parentX,parentY,temp.getFitWidth(),heig));

                }
                
                // temp.setPreserveRatio(true);
                // if (Math.random()>0.60) {
                //     TranslateTransition isl = new TranslateTransition();
                //     isl.setNode(temp);
                //     isl.setByY(-20);
                //     isl.setCycleCount(TranslateTransition.INDEFINITE);
                //     isl.setAutoReverse(true);
                //     isl.setDuration(Duration.millis(1000));
                //     isl.play();
                // }

                
                pane.getChildren().add(temp);

                



                if (Math.random()>0.80) {
                    Image weapon_Chest_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Weapon_Chest.png");
                    ImageView Weapon_Chest = new ImageView(weapon_Chest_Image);

                    Weapon_Chest.setFitHeight(70);
                    Weapon_Chest.setFitWidth(90);

                    

                    if (island_type==1) {
                        Weapon_Chest.setX(temp.getX() + 145);
                        Weapon_Chest.setY(temp.getY()+ 64);
                    }
                    else if (island_type==2) {
                        Weapon_Chest.setX(temp.getX() + 100);
                        Weapon_Chest.setY(temp.getY()-52);
                    }
                    else if (island_type==3) {
                        Weapon_Chest.setX(temp.getX() + 175);
                        Weapon_Chest.setY(temp.getY()-35);
                    }
                    else if (island_type==4) {
                        Weapon_Chest.setX(temp.getX() + 187);
                        Weapon_Chest.setY(temp.getY()+60);
                    }
                    else if (island_type==5) {
                        Weapon_Chest.setX(temp.getX() + 50);
                        Weapon_Chest.setY(temp.getY()+75);
                    }
                    else {
                        Weapon_Chest.setX(temp.getX() + 125);
                        Weapon_Chest.setY(temp.getY()+125);
                    }
                    
                    blocks.add(Weapon_Chest);
                    // System.out.println(Weapon_Chest.getX()+" "+Weapon_Chest.getY()+" "+Weapon_Chest.getFitWidth()+" "+Weapon_Chest.getFitHeight());
                    blocks_dimensions.add(new Object_Dimenstions("weapon_chest",Weapon_Chest.getX(),Weapon_Chest.getY(),Weapon_Chest.getFitWidth(),Weapon_Chest.getFitHeight()));
                    weaponchest_imageArray.add(Weapon_Chest);
                    int ctype=rand.nextInt(3);

                    if (ctype==0) {
                        chest_type.add("Coin");
                    }
                    if (ctype==1) {
                        chest_type.add("Hammer");
                    }
                    if (ctype==2) {
                        chest_type.add("Sword");
                    }

                    weaponchest_dimentsionsArray.add(new Object_Dimenstions("weapon_chest",Weapon_Chest.getX(),Weapon_Chest.getY(),Weapon_Chest.getFitWidth(),Weapon_Chest.getFitHeight()));
                    pane.getChildren().add(Weapon_Chest);
                }


                if (Math.random()>0.50) {
                

                    Image coin_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Coin.png");
                    ImageView coin = new ImageView(coin_Image);

                    coin.setFitHeight(40);
                    coin.setFitWidth(40);

       
                    coin.setX(parentX + Math.random() * wid * 0.8);
                    coin.setY(330);

                    coins.add(new Object_Dimenstions("coin",coin.getX(),coin.getY(),40,40));
                    coins_.add(coin);
                    pane.getChildren().add(coin);
                }
                
                if (f>0.50) {
                    double decide=Math.random();

                    ImageView normalorc=null; 

                    if (decide>=0.50) {
                        Image normalorc_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/ORC.png");
                        normalorc = new ImageView(normalorc_Image);
                        normalorc.setFitHeight(90);
                        normalorc.setFitWidth(90);
                    }
                    if (decide<0.50) {
                        Image normalorc_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/RedOrcBoss.png");
                        normalorc = new ImageView(normalorc_Image);
                        normalorc.setFitHeight(85);
                        normalorc.setFitWidth(85);
                    }

                        
                    
                    if (island_type==1) {
                        normalorc.setX(temp.getX() + 235);
                        normalorc.setY(temp.getY()+ 51);
                    }
                    else if (island_type==2) {
                        normalorc.setX(temp.getX() + 70);
                        normalorc.setY(temp.getY()-66);
                    }
                    else if (island_type==3) {
                        normalorc.setX(temp.getX() + 285);
                        normalorc.setY(temp.getY()-49);
                    }
                    else if (island_type==4) {
                        normalorc.setX(temp.getX() + 237);
                        normalorc.setY(temp.getY()+44);
                    }
                    else if (island_type==5) {
                        normalorc.setX(temp.getX() + 100);
                        normalorc.setY(temp.getY()+58);
                    }
                    else {
                        normalorc.setX(temp.getX() + 185);
                        normalorc.setY(temp.getY()+109);
                    }

                    TranslateTransition trans = new TranslateTransition();
                    trans.setNode(normalorc);
                    trans.setAutoReverse(true);
                    trans.setByY(-140);
                    
                    trans.setCycleCount(TranslateTransition.INDEFINITE);
                    trans.setDuration(Duration.millis(1200));
                    trans.play();
                    

                    blocks.add(normalorc);
                    normalorc_imageArray.add(normalorc);

                    Object_Dimenstions obs=new Object_Dimenstions("normalorc",normalorc.getX(),normalorc.getY(),normalorc.getFitWidth(),normalorc.getFitHeight());
                    obs.set_image(normalorc);
                    blocks_dimensions.add(obs);

                    normalorc_dimentsionsArray.add(new Object_Dimenstions("normalorc",normalorc.getX(),normalorc.getY(),normalorc.getFitWidth(),normalorc.getFitHeight()));
                    
                    pane.getChildren().add(normalorc);

                    


                }
                if (f<0.10) {
                    double tnt_or_Jumper=Math.random();
                    if (tnt_or_Jumper>=0.50) {
                        Image TNT_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/TNT.png");
                        ImageView TNT = new ImageView(TNT_Image);
                        TNT.setFitHeight(105);
                        TNT.setFitWidth(105);

                        if (island_type==1) {
                            TNT.setX(temp.getX() + 235);
                            TNT.setY(temp.getY()+ 55);
                        }
                        else if (island_type==2) {
                            TNT.setX(temp.getX() + 70);
                            TNT.setY(temp.getY()-62);
                        }
                        else if (island_type==3) {
                            TNT.setX(temp.getX() + 285);
                            TNT.setY(temp.getY()-45);
                        }
                        else if (island_type==4) {
                            TNT.setX(temp.getX() + 237);
                            TNT.setY(temp.getY()+48);
                        }
                        else if (island_type==5) {
                            TNT.setX(temp.getX() + 100);
                            TNT.setY(temp.getY()+62);
                        }
                        else {
                            TNT.setX(temp.getX() + 185);
                            TNT.setY(temp.getY()+109);
                        }

                        blocks.add(TNT);


                        Object_Dimenstions obs=new Object_Dimenstions("TNT",TNT.getX(),TNT.getY(),TNT.getFitWidth(),TNT.getFitHeight());
                        obs.set_image(TNT);
                        blocks_dimensions.add(obs);

                        pane.getChildren().add(TNT);
                    }
                    if (tnt_or_Jumper<0.50) {
                        Image Jumper_Image = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Jumper.png");
                        ImageView Jumper = new ImageView(Jumper_Image);
                        Jumper.setFitHeight(105);
                        Jumper.setFitWidth(105);

                        if (island_type==1) {
                            Jumper.setX(temp.getX() + 235);
                            Jumper.setY(temp.getY()+ 55);
                        }
                        else if (island_type==2) {
                            Jumper.setX(temp.getX() + 70);
                            Jumper.setY(temp.getY()-62);
                        }
                        else if (island_type==3) {
                            Jumper.setX(temp.getX() + 285);
                            Jumper.setY(temp.getY()-45);
                        }
                        else if (island_type==4) {
                            Jumper.setX(temp.getX() + 237);
                            Jumper.setY(temp.getY()+48);
                        }
                        else if (island_type==5) {
                            Jumper.setX(temp.getX() + 100);
                            Jumper.setY(temp.getY()+62);
                        }
                        else {
                            Jumper.setX(temp.getX() + 185);
                            Jumper.setY(temp.getY()+109);
                        }

                        blocks.add(Jumper);


                        Object_Dimenstions jump=new Object_Dimenstions("Jumper",Jumper.getX(),Jumper.getY(),Jumper.getFitWidth(),Jumper.getFitHeight()-200);
                        jump.set_image(Jumper);
                        blocks_dimensions.add(jump);

                        pane.getChildren().add(Jumper);
                    }

                }


                

                

                blocks.add(temp);
                


            }




///////////////////////////////
            ImageView BossArena=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_4.png");
            parentX=parentX+parent_block.getFitWidth()+60;

            BossArena.setX(parentX);


            BossArena.setY(300);
            parentY=300;

            blocks_dimensions.add(new Object_Dimenstions("island_4",BossArena.getX(),BossArena.getY()+123,BossArena.getFitWidth(),BossArena.getFitHeight()));
            blocks.add(BossArena);
            pane.getChildren().add(BossArena);

            for (int i=0;i<5;i++) {
                ImageView BossArena1=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/island_4.png");
                parentX=parentX+parent_block.getFitWidth()-130;

                // temp.relocate(parentX,270);
                BossArena1.setX(parentX);

                
                BossArena1.setY(300);
                parentY=300;

                blocks_dimensions.add(new Object_Dimenstions("island_4",BossArena1.getX(),BossArena1.getY()+123,BossArena1.getFitWidth(),BossArena1.getFitHeight()));
                blocks.add(BossArena1);
                pane.getChildren().add(BossArena1);
            }

            ImageView BossOrc=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/RedOrcBoss.png");
            BossOrc.setX(parentX-1000);
            BossOrc.setY(282);

            BossOrc.setFitHeight(150);
            BossOrc.setFitWidth(150);


            blocks.add(BossOrc);
            // normalorc_imageArray.add(BossOrc);
            boss_D=new Object_Dimenstions("BossOrc",BossOrc.getX(),BossOrc.getY(),BossOrc.getFitHeight(),BossOrc.getFitWidth());
            boss_D.set_image(BossOrc);
            blocks_dimensions.add(boss_D);

            TranslateTransition boss_trans = new TranslateTransition();
            boss_trans.setNode(BossOrc);
            boss_trans.setAutoReverse(true);
            boss_trans.setByY(-140);
            boss_trans.setCycleCount(TranslateTransition.INDEFINITE);
            boss_trans.setDuration(Duration.millis(1300));
            boss_trans.play();

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            // for (int i=0;i<blocks.size();i++) {
            //     // trans.setNode(blocks.get(i));
            //     // trans.setByX(blocks.get(i).getX()-100);
            //     // for (int j=0;j<100;j++) {
            //     blocks.get(i).setX(blocks.get(i).getX()-10500);
            //     // }
            // }
            // for (int i=0;i<blocks_dimensions.size();i++) {
            //     // for (int j=0;j<100;j++) {
            //     blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()-10500);
            //     // }
                
        
            // }
        
            // for (int i=0;i<coins_.size();i++) {
            //     // trans.setNode(coins_.get(i));
            //     // trans.setByX(coins_.get(i).getX()-100);
            //     // for (int j=0;j<100;j++) {
            //     coins_.get(i).setX(coins_.get(i).getX()-10500);
            //     // }
            // }
            // for (int i=0;i<coins.size();i++) {
            //     // for (int j=0;j<100;j++) {
            //     coins.get(i).set_x(coins.get(i).get_x()-10500);
            //     // }
        
            // }

            // for (int i=0;i<weaponchest_dimentsionsArray.size();i++) {
            //     // for (int j=0;j<-100;j++) {
            //     weaponchest_dimentsionsArray.get(i).set_x(weaponchest_dimentsionsArray.get(i).get_x()-10500);
            //     // }
            // }


            // for (int i=0;i<scenery.size();i++) {
            //     // for (int j=0;j<-20;j++) {
            //     scenery.get(i).setX(scenery.get(i).getX()-20);
            //     // }
            // }

            // boss_D.set_x(boss_D.get_x()-10000);

            ////////////////////////////////////////////////////////////////////////////////////////////////////




            ImageView pausebutton=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/PauseButton.png");

            pausebutton.setX(30);
            pausebutton.setY(5);

            pausebutton.setFitHeight(60);
            pausebutton.setFitWidth(60);


            

            Sword_Slot.setX(80);
            Sword_Slot.setY(650);
            Sword_Slot.setOpacity(0.5);

            Hammer_Slot.setX(200);
            Hammer_Slot.setY(640);
            Hammer_Slot.setOpacity(0.5);
            

            Helmet w1=new Weapon1();
            Helmet w2=new Weapon2();

            weapon_in_Hand=transparent;

            weapon_in_Hand.setX(110);
            weapon_in_Hand.setY(250);

            weapon_in_Hand.setFitHeight(120);
            weapon_in_Hand.setFitWidth(30);

            weapon_in_Hand.setRotate(-90);

            pane.getChildren().addAll(BossOrc,pausebutton,Sword_Slot,Hammer_Slot,Player,weapon_in_Hand);


            Sword_Slot.setOnMouseClicked(e->{
                if (is_sword_allowed==true) {
                    Image Sword_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Sword.png");
                    weapon_in_Hand.setImage(Sword_Image);

                    weapon_in_Hand.setX(110);
                    weapon_in_Hand.setY(Player.getY()+50);

                    weapon_in_Hand.setFitWidth(30);
                    weapon_in_Hand.setRotate(-90);
                    current_weapon="Sword";
                }
                
            });

            Hammer_Slot.setOnMouseClicked(e->{
                if (is_hammer_allowed==true) {
                    Image Hammer_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hammer.png");
                    weapon_in_Hand.setImage(Hammer_Image);

                    weapon_in_Hand.setX(105);
                    weapon_in_Hand.setY(Player.getY()+20);

                    weapon_in_Hand.setFitWidth(90);
                    weapon_in_Hand.setRotate(-50);
                    current_weapon="Hammer";
                }
                
                
            });
            Image Pause_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/pause.png");
            ImageView Pause_Layout=new ImageView(Pause_Image);

            Pause_Layout.setX(210);
            Pause_Layout.setY(20);

            Pause_Layout.setFitWidth(600);
            Pause_Layout.setFitHeight(600);

            Pause_Layout.setOpacity(0);

            Image Exit_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Exit.png");
            Exit_Layout=new ImageView(Exit_Image);

            Exit_Layout.setX(430);
            Exit_Layout.setY(400);

            Exit_Layout.setFitWidth(400);
            Exit_Layout.setFitHeight(200);

            Exit_Layout.setOpacity(0);

            Image Return_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/goback.png");
            Return_Layout=new ImageView(Return_Image);

            Return_Layout.setX(180);
            Return_Layout.setY(400);

            Return_Layout.setFitWidth(200);
            Return_Layout.setFitHeight(200);

            Return_Layout.setOpacity(0);



            pausebutton.setOnMouseClicked(e->{
                
                Pause_Layout.setOpacity(1);
                TranslateTransition Pause=new TranslateTransition();
                Pause.setNode(Pause_Layout);
                Pause.setByY(-3);
                Pause.setCycleCount(1000);
                Pause.setAutoReverse(true);
                Pause.setDuration(Duration.millis(700));
                Pause.play();

                Exit_Layout.setOpacity(1);
                TranslateTransition Exit=new TranslateTransition();
                Exit.setNode(Exit_Layout);
                Exit.setByY(-3);
                Exit.setCycleCount(TranslateTransition.INDEFINITE);
                Exit.setAutoReverse(true);
                Exit.setDuration(Duration.millis(500));
                Exit.play();
                
                Return_Layout.setOpacity(1);
                TranslateTransition Return=new TranslateTransition();
                Return.setNode(Return_Layout);
                Return.setByY(-3);
                Return.setCycleCount(TranslateTransition.INDEFINITE);
                Return.setAutoReverse(true);
                Return.setDuration(Duration.millis(500));
                Return.play();

                pane.getChildren().addAll(Return_Layout,Exit_Layout,Pause_Layout);

                paused=true;
                
            });


            Return_Layout.setOnMouseClicked(e->{
                // Parent root;
                // try {
                //     root = FXMLLoader.load(getClass().getResource("checking.fxml"));
                //     Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                //     Scene scene=new Scene(root);
                //     stage.setScene(scene);
                //     stage.show();
                // } catch (IOException e1) {
                //     e1.printStackTrace();
                // }
                paused=false;
                pane.getChildren().removeAll(Return_Layout,Exit_Layout,Pause_Layout);

                
            });

            
            

            class mytimer extends AnimationTimer {
            
                @Override
                public void handle(long l) {
                    
                    int helper=0;

                    // Object_Dimenstions current_block=blocks_dimensions.get(0);
                    Object_Dimenstions current_block=null;

                    Object_Dimenstions current_block_fororc=null;

                    



                    boolean b=false;

                    for (int i=0;i<blocks_dimensions.size()-1;i++) {

                        
                       

                        if (blocks_dimensions.get(i).get_type().equals("island_1") && blocks_dimensions.get(i).get_x()<170 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-220) {
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            current_block_fororc=blocks_dimensions.get(i);

                            System.out.println("Stay_1");
                            boolforTNT=false;
                            
                            break;
                        }
                        if (blocks_dimensions.get(i).get_type().equals("island_2") && blocks_dimensions.get(i).get_x()<180 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-135) {
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            System.out.println("Stay_2");
                            boolforTNT=false;
                            
                            break;
                        }
                        if (blocks_dimensions.get(i).get_type().equals("island_3") && blocks_dimensions.get(i).get_x()<160 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-300) {
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            System.out.println("Stay_3");
                            boolforTNT=true;
                            
                            break;
                        }
                        if (blocks_dimensions.get(i).get_type().equals("island_4") && blocks_dimensions.get(i).get_x()<180 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-250) {
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            System.out.println("Stay_4");
                            boolforTNT=false;
                            
                            break;
                        }
                        if (blocks_dimensions.get(i).get_type().equals("island_5") && blocks_dimensions.get(i).get_x()<180 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-120) {
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            System.out.println("Stay_5");
                            boolforTNT=false;
                           
                            break;
                        }
                        if (blocks_dimensions.get(i).get_type().equals("island_6") && blocks_dimensions.get(i).get_x()<160 && blocks_dimensions.get(i).get_x()+blocks_dimensions.get(i).get_width()>-220) {
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            System.out.println("Stay_6");
                            boolforTNT=false;
                            
                            break;
                        }
                        
                        if (blocks_dimensions.get(i).get_type().equals("Hello")) {
                            boolforTNT=false;
                            TNT_Time=0;

                        }

    
                    }

                    
                        
                    

                    int p=0;
                    for (int i=0;i<blocks_dimensions.size();i++) {

                        
                        

                        if (blocks_dimensions.get(i).get_type().equals("normalorc")  && blocks_dimensions.get(i).get_x()<185 && blocks_dimensions.get(i).get_x()>52) {
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            
                            System.out.println("On Orc");
                            p=i;
                            // boolforTNT=true;
                            TNT_Time=0;
                            break;
                        }
                        if (blocks_dimensions.get(i).get_type().equals("BossOrc")  && blocks_dimensions.get(i).get_x()<185 && blocks_dimensions.get(i).get_x()>32) {
                            System.out.println("BOSS ORC IS CURRENT BLOCK");
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            
                            System.out.println("On Orc");
                            p=i;
                            // boolforTNT=true;
                            TNT_Time=0;
                            break;
                        }
                        if (blocks_dimensions.get(i).get_type().equals("TNT") && blocks_dimensions.get(i).get_x()<185 && blocks_dimensions.get(i).get_x()>52) {
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            
                            System.out.println("On TNT");
                            boolforTNT=true;
                            currentTNT=blocks_dimensions.get(i);
                            p=i;
                            break;
                        }
                        if (blocks_dimensions.get(i).get_type().equals("Jumper") && blocks_dimensions.get(i).get_x()<185 && blocks_dimensions.get(i).get_x()>52) {
                            
                            helper=1;
                            current_block=blocks_dimensions.get(i);
                            
                            System.out.println("On Jumper");
                            // boolforTNT=true;
                            // currentTNT=blocks_dimensions.get(i);
                            Teleport();
                            Player.setY(20);
                            weapon_in_Hand.setY(70);
                            p=i;
                            break;
                        }
                        
                        
                    }
                    if (current_block!=null) {
                        System.out.println(current_block.get_type());
                    }
                    System.out.println(TNT_Time);

                    if (boolforTNT==true) {
                        TNT_Time++;
                        if (currentTNT!=null && TNT_Time>270) {
                            Image i=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/TNT_EXPLOSION.png");
                            currentTNT.get_image().setImage(i);
                            currentTNT.get_image().setY(currentTNT.get_image().getY()-100);
                            
                            currentTNT.get_image().setFitHeight(270);
                            currentTNT.get_image().setFitWidth(270);

                            
                            TNT_Time=0;
                            boolforTNT=false;

                            if (currentTNT!=null && currentTNT.get_image().getX()<180 && currentTNT.get_image().getX()>50)  {
                                RotateTransition rot=new RotateTransition();
                                TranslateTransition trans=new TranslateTransition();
                                rot.setNode(Player);
                                trans.setNode(Player);
                                rot.setDuration(Duration.millis(100));
                                rot.setByAngle(180);
                                trans.setByY(2000);
                                trans.play();
                                rot.play();
                                // Player.setY(Player.getY()+5);
                                // Player.setRotate(Player.getRotate()+20);
                                // dyingtime++;
                                
                                Stat_Menu();
                                dyingtime=0;
                                
                            }
                        }

                    }
                    

                    
                    if (bool==true) {
                        Player.setY(Player.getY()+3);
                        weapon_in_Hand.setY(weapon_in_Hand.getY()+3);
                        if ((current_block==null && Player.getY()>470)) {
                            // RotateTransition rot=new RotateTransition();
                            // TranslateTransition trans=new TranslateTransition();
                            // rot.setNode(Player);
                            // trans.setNode(Player);
                            // rot.setDuration(Duration.millis(300));
                            // rot.setByAngle(180);
                            // trans.setByY(2000);
                            // trans.play();
                            // rot.play();
                            // this.stop();

                            Player.setY(Player.getY()+5);
                            Player.setRotate(Player.getRotate()+20);
                            dyingtime++;
                            if (killed==false && dyingtime==10) {
                                Stat_Menu();
                                dyingtime=0;
                            }

            



                        }
                        if (current_block!=null && current_block.get_type().equals("Jumper") && current_block.get_y()<Player.getY()+105) {
                            System.out.println("neeeeeeeeeeeeeeeeeee");
                            bool=false;
                        }
                        if (current_block!=null && current_block.get_type().equals("normalorc") && current_block.get_image().getY()+current_block.get_image().getTranslateY()<Player.getY()+105) {
                            bool=false;
                            System.out.println("ooooooooooooooooorrrrrrrrccccccccc");
                        }
                        
                        if(current_block!=null && current_block.get_y()<Player.getY()+105) {
                            System.out.println(current_block.get_type());
                            bool=false;
                        }
                    }
                    if (bool==false) {
                        Player.setY(Player.getY()-3);
                        weapon_in_Hand.setY(weapon_in_Hand.getY()-3);
                        if(current_block!=null && current_block.get_y()-290>Player.getY()) {
                            System.out.println(current_block.get_type());
                            bool=true;
                        }
                        if (current_block==null && 100>Player.getY()) {
                            bool=true;
                        }
                        if (current_block!=null && current_block.get_type().equals("Jumper") && 10>Player.getY()) {
                            bool=true;
                        }
                        if(current_block!=null && current_block.get_image()!=null && current_block.get_image().getY()-290>Player.getY()) {
                            bool=true;
                        }
                        
                    }
                   
                    if (helper==0) {
                        System.out.println("fall");
                    }

                    System.out.println(sword_damage);
                    System.out.println(hammer_damage);
                    System.out.println(Boss_Health);

                    // for (int i=0;i<normalorc_imageArray.size();i++) {
                        if (current_block!=null && current_block.get_image()!=null) {
                            
                            System.out.println(current_block.get_type());

                            if (current_block.get_y()+current_block.get_image().getTranslateY()-100<Player.getY() && current_block.get_y()+current_block.get_image().getTranslateY()>Player.getY()) {
                                System.out.println("Collided with Orc /////////////////////////////////////");
                                Collision(current_block);
                                if (current_block.get_type().equals("BossOrc")) {

                                    if (current_weapon.equals("Sword") && is_sword_allowed==true) {
                                        Boss_Health-=sword_damage;
                                    }
                                    if (current_weapon.equals("Hammer") && is_hammer_allowed==true) {
                                        Boss_Health-=hammer_damage;
                                    }
                                    

                                    if (Boss_Health<0) {
                                        RotateTransition rot2=new RotateTransition();
                                        TranslateTransition trans2=new TranslateTransition();
                                        trans2.setCycleCount(1);
                                        rot2.setNode(current_block.get_image());
                                        trans2.setNode(current_block.get_image());
                                        rot2.setDuration(Duration.millis(300));
                                        rot2.setByAngle(180);
                                        trans2.setByY(2000);
                                        trans2.play();
                                        rot2.play();

                                        boss_trans.stop();

                                        // current_block.get_image().setY(current_block.get_image().getY()+5);
                                        // current_block.get_image().setRotate(current_block.get_image().getRotate()+20);
                                        

                                        

                                        
                                        Win_Menu();
                                            
                                        
                                        
                                    }
                                    else {
                                        Boss_Health-=20;
                                    }
                                }
                                else {
                                    for_Collision=true;
                                }
                                RotateTransition rot=new RotateTransition();
                                rot.setNode(weapon_in_Hand);
                                rot.setCycleCount(0);
                                rot.setDuration(Duration.millis(400));
                                rot.setByAngle(720);
                                rot.play();
                                // break;

                            }

                            else if (current_block.get_y()+current_block.get_image().getTranslateY()-20<Player.getY()) {
                                // RotateTransition rot=new RotateTransition();
                                // TranslateTransition trans=new TranslateTransition();
                                // rot.setNode(Player);
                                // trans.setNode(Player);
                                // rot.setDuration(Duration.millis(100));
                                // rot.setByAngle(180);
                                // trans.setByY(2000);
                                // trans.play();
                                // rot.play();
                                Player.setY(Player.getY()+5);
                                Player.setRotate(Player.getRotate()+20);
                                dyingtime++;
                                System.out.println("Killed by Orc");
                                // this.stop();


                                if (killed==false && dyingtime==10) {
                                    Stat_Menu();
                                    dyingtime=0;
                                }
                                
                                // break;
                                
                            }
                            
                        }
                    // }
                    

                    if (for_Collision==true) {
                        ForDie+=4; 
                        if (current_block!=null && current_block.get_image()!=null) {
                            current_block.get_image().setY(current_block.get_image().getY()+ForDie);
                            current_block.set_y(current_block.get_y()+ForDie);   

                            if (current_block.get_image().getY()>2000) {
                                ForDie=0;
                                for_Collision=false;
                            }
                        }

                        
                    }
                    





                    for (int i=0;i<coins.size();i++) {
                        
                        
                        if (coins.get(i).get_x()<180 && coins.get(i).get_x()>50 && coins.get(i).get_y()-60<=Player.getY()) {
                            TranslateTransition trans=new TranslateTransition();
                            RotateTransition rot = new RotateTransition();
                            FadeTransition fade = new FadeTransition();
                            trans.setNode(coins_.get(i));
                            rot.setNode(coins_.get(i));
                            rot.setAxis(Rotate.Y_AXIS);
                            rot.setDuration(Duration.millis(100));
                            rot.setByAngle(180);
                            trans.setByY(-50);
                            fade.setFromValue(1);
                            fade.setToValue(0);
                            fade.setDuration(Duration.millis(1000));
                            rot.play();
                            trans.play();
                            fade.play();

                            Coin_Animation_Time++;
                            if (Coin_Animation_Time==25) {
                                coins_.get(i).setOpacity(0);
                                coins_.get(i).setX(-1000);
                                coins_.get(i).setY(-1000);
                                Coin_Animation_Time=0;
                                b=true;
                            }
                            
                            break;

                            
                        }
                    }

                    if (b==true) {
                        coinLabel.setText(Integer.toString(++collected_coins));
                    }

                    for (int i=0;i<scenery.size();i++) {
                        scenery.get(i).setX(scenery.get(i).getX()-0.02);
                    }


                    for (int i=0;i<weaponchest_dimentsionsArray.size();i++) {
                        if (weaponchest_dimentsionsArray.get(i).get_x()<180 && weaponchest_dimentsionsArray.get(i).get_x()>50 && weaponchest_dimentsionsArray.get(i).get_y()-60<=Player.getY())  {
                            // System.out.println("Chest;)");
                            Image opened_chest = new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/OpenedChest.png");

                            weaponchest_imageArray.get(i).setImage(opened_chest);
                            weaponchest_imageArray.get(i).setFitHeight(100);
                            weaponchest_imageArray.get(i).setFitWidth(120);
                            weaponchest_imageArray.get(i).setY(current_block.get_y()-90);

                            if (chest_type.get(i).equals("Coin")) {
                                coinLabel.setText(Integer.toString(++collected_coins));
                            }
                            if (chest_type.get(i).equals("Hammer")) {
                                is_hammer_allowed=true;
                                Image Hammer_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hammer.png");
                                weapon_in_Hand.setImage(Hammer_Image);
            
                                weapon_in_Hand.setX(105);
                                weapon_in_Hand.setY(Player.getY()+20);
            
                                weapon_in_Hand.setFitWidth(90);
                                weapon_in_Hand.setRotate(-50);
                                current_weapon="Hammer";
                                hammer_damage+=1;

                                Hammer_Slot.setOpacity(1);

                            }
                            if (chest_type.get(i).equals("Sword")) {
                                is_sword_allowed=true;

                                Image Sword_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Sword.png");
                                weapon_in_Hand.setImage(Sword_Image);
            
                                weapon_in_Hand.setX(110);
                                weapon_in_Hand.setY(Player.getY()+50);
            
                                weapon_in_Hand.setFitWidth(30);
                                weapon_in_Hand.setRotate(-90);
                                current_weapon="Sword";
                                sword_damage+=1;

                                Sword_Slot.setOpacity(1);
                            }


                        }
                        
                        
                        

                    }

                    

                    // System.out.println(boss_D.get_y()+boss_D.get_image().getTranslateY());
                    // System.out.println(boss_D.get_x());


                    

                    
                }
            };

           

            timer=new mytimer();
            timer.start();
            
            

        }

        ImageView newgame=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Newgame.png");
        newgame.setLayoutX(411);
        newgame.setLayoutY(645);
        newgame.setFitWidth(200);
        newgame.setFitHeight(150);
        TranslateTransition newgame_A=new TranslateTransition();
        newgame_A.setNode(newgame);
        newgame_A.setByY(-3);
        newgame_A.setCycleCount(1000);
        newgame_A.setAutoReverse(true);
        newgame_A.setDuration(Duration.millis(500));
        newgame_A.play();
        



        ImageView exit=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Exit.png");
        exit.setLayoutX(142);
        exit.setLayoutY(645);
        exit.setFitWidth(200);
        exit.setFitHeight(150);
        TranslateTransition exit_A=new TranslateTransition();
        exit_A.setNode(exit);
        exit_A.setByY(-3);
        exit_A.setCycleCount(1000);
        exit_A.setAutoReverse(true);
        exit_A.setDuration(Duration.millis(500));
        exit_A.play();

        ImageView load=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Load.png");
        load.setLayoutX(665);
        load.setLayoutY(632);
        load.setFitWidth(232);
        load.setFitHeight(162);
        TranslateTransition load_A=new TranslateTransition();
        load_A.setNode(load);
        load_A.setByY(-3);
        load_A.setCycleCount(1000);
        load_A.setAutoReverse(true);
        load_A.setDuration(Duration.millis(500));
        load_A.play();


        ImageView coinface=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Coin.png");
        coinface.setLayoutX(885);
        coinface.setLayoutY(15);
        coinface.setFitWidth(30);
        coinface.setFitHeight(30);
        TranslateTransition coin_A=new TranslateTransition();
        coin_A.setNode(coinface);
        coin_A.setByY(-5);
        coin_A.setCycleCount(1000);
        coin_A.setAutoReverse(true);
        coin_A.setDuration(Duration.millis(500));
        coin_A.play();

        ImageView Restart=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Restart.png");
        Restart.setLayoutX(920);
        Restart.setLayoutY(700);
        Restart.setFitWidth(70);
        Restart.setFitHeight(70);
        TranslateTransition Restart_A=new TranslateTransition();
        Restart_A.setNode(coinface);
        Restart_A.setByY(-5);
        Restart_A.setCycleCount(1000);
        Restart_A.setAutoReverse(true);
        Restart_A.setDuration(Duration.millis(500));
        Restart_A.play();

        pane.getChildren().addAll(Restart,coinface,newgame,exit,load);


        Restart.setOnMouseClicked(e->{
            Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("checking.fxml"));
                Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            
        });

        newgame.setOnMouseClicked(e->{
            
            pane.getChildren().removeAll(newgame,exit,load);

            for_new_game=new TextField();
            for_new_game.setLayoutX(434);
            for_new_game.setLayoutY(559);

            
            Entername.setLayoutX(451);
            Entername.setLayoutY(593);
            Entername.setFitWidth(135);
            Entername.setFitHeight(70);
            TranslateTransition entername_A=new TranslateTransition();
            entername_A.setNode(Entername);
            entername_A.setByY(-3);
            entername_A.setCycleCount(TranslateTransition.INDEFINITE);
            entername_A.setAutoReverse(true);
            entername_A.setDuration(Duration.millis(500));
            entername_A.play();
            pane.getChildren().addAll(for_new_game,Entername);

        });

        

        load.setOnMouseClicked(e->{
            pane.getChildren().removeAll(newgame,exit,load);

            for_load_game=new TextField();
            for_load_game.setLayoutX(434);
            for_load_game.setLayoutY(559);

            LoadGame.setLayoutX(451);
            LoadGame.setLayoutY(593);
            LoadGame.setFitWidth(135);
            LoadGame.setFitHeight(70);
            TranslateTransition entername_A=new TranslateTransition();
            entername_A.setNode(LoadGame);
            entername_A.setByY(-3);
            entername_A.setCycleCount(TranslateTransition.INDEFINITE);
            entername_A.setAutoReverse(true);
            entername_A.setDuration(Duration.millis(500));
            entername_A.play();

            pane.getChildren().addAll(for_load_game,LoadGame);
            
        });

        Entername.setOnMouseClicked(e->{
            pane.getChildren().removeAll(for_new_game,Entername);
            Player_Name=for_new_game.getText();
        });

        LoadGame.setOnMouseClicked(e->{
            Player_Name=for_load_game.getText();
            pane.getChildren().removeAll(for_load_game,LoadGame);
            System.out.println(Player_Name);
            try {
                SaveData data = (SaveData) SaveManager.load(Player_Name);
                // this.blocks=data.blocks;
                // this.blocks_dimensions=data.blocks_dimensions;
                // this.chest_type=data.chest_type;
                // this.coins=data.coins;
                // this.coins_=data.coins_;
                // this.normalorc_dimentsionsArray=data.normalorc_dimentsionsArray;
                // this.normalorc_imageArray=data.normalorc_imageArray;
                // this.weaponchest_dimentsionsArray=data.weaponchest_dimentsionsArray;
                // this.weaponchest_imageArray=data.weaponchest_imageArray;
                this.Boss_Health=data.Boss_Health;
                this.Coin_Animation_Time=data.Coin_Animation_Time;
                // this.Distance=data.Distance;
                // this.Distance_Image=data.Distance_Image;
                // this.Entername=data.Entername;
                // this.Ex=data.Ex;
                // this.Exit_Image=data.Exit_Image;
                // this.Exit_Layout=data.Exit_Layout;
                this.ForDie=data.ForDie;
                // this.LoadGame=data.LoadGame;
                // this.Player=data.Player;
                this.Player_Name=data.Player_Name;
                // this.Return_Layout=data.Return_Layout;
                // this.Revive=data.Revive;
                // this.Revive_Image=data.Revive_Image;
                // this.Score=data.Score;
                // this.Score_Image=data.Score_Image;
                this.TNTFade=data.TNTFade;
                this.TNT_Time=data.TNT_Time;
                this.bool=data.bool;
                this.bool2=data.bool2;
                this.boolforTNT=data.boolforTNT;
                // this.boss_D=data.boss_D;
                this.collected_coins=data.collected_coins;
                // this.currentTNT=data.currentTNT;
                this.current_weapon=data.current_weapon;
                this.distance=data.distance;
                this.dyingtime=data.dyingtime;
                this.for_Collision=data.for_Collision;
                // this.for_load_game=data.for_load_game;
                // this.for_new_game=data.for_new_game;
                // this.fordistance=data.fordistance;
                // this.forscore=data.forscore;
                this.hammer_damage=data.hammer_damage;
                this.is_hammer_allowed=data.is_hammer_allowed;
                this.is_sword_allowed=data.is_sword_allowed;
                this.killed=data.killed;
                // this.pane=data.pane;
                // this.player_image=data.player_image;
                // this.scene=data.scene;
                this.sword_damage=data.sword_damage;
                // this.timer=data.timer;
                // this.weapon_in_Hand=data.weapon_in_Hand;
            } catch (Exception e1) {
                e1.printStackTrace();

            }
            disLabel.setText(Integer.toString(distance));
            coinLabel.setText(Integer.toString(collected_coins));

            // TranslateTransition trans=new TranslateTransition();

            for (int i=0;i<blocks.size();i++) {
                // trans.setNode(blocks.get(i));
                // trans.setByX(blocks.get(i).getX()-100);
                // for (int j=0;j<100;j++) {
                blocks.get(i).setX(blocks.get(i).getX()-distance*100);
                // }
            }
            for (int i=0;i<blocks_dimensions.size();i++) {
                // for (int j=0;j<100;j++) {
                blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()-distance*100);
                // }
                
        
            }
        
            for (int i=0;i<coins_.size();i++) {
                // trans.setNode(coins_.get(i));
                // trans.setByX(coins_.get(i).getX()-100);
                // for (int j=0;j<100;j++) {
                coins_.get(i).setX(coins_.get(i).getX()-distance*100);
                // }
            }
            for (int i=0;i<coins.size();i++) {
                // for (int j=0;j<100;j++) {
                coins.get(i).set_x(coins.get(i).get_x()-distance*100);
                // }
        
            }

            for (int i=0;i<weaponchest_dimentsionsArray.size();i++) {
                // for (int j=0;j<-100;j++) {
                weaponchest_dimentsionsArray.get(i).set_x(weaponchest_dimentsionsArray.get(i).get_x()-distance*100);
                // }
            }


            for (int i=0;i<scenery.size();i++) {
                // for (int j=0;j<-20;j++) {
                scenery.get(i).setX(scenery.get(i).getX()-distance*20);
                // }
            }

            if (is_hammer_allowed==true) {
                
                Image Hammer_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hammer.png");
                weapon_in_Hand.setImage(Hammer_Image);

                weapon_in_Hand.setX(105);
                weapon_in_Hand.setY(Player.getY()+20);

                weapon_in_Hand.setFitWidth(90);
                weapon_in_Hand.setRotate(-50);
                current_weapon="Hammer";
                hammer_damage+=1;

                Hammer_Slot.setOpacity(1);

            }
            if (is_sword_allowed=true) {

                Image Sword_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Sword.png");
                weapon_in_Hand.setImage(Sword_Image);

                weapon_in_Hand.setX(110);
                weapon_in_Hand.setY(Player.getY()+50);

                weapon_in_Hand.setFitWidth(30);
                weapon_in_Hand.setRotate(-90);
                current_weapon="Sword";
                sword_damage+=1;

                Sword_Slot.setOpacity(1);
            }

            
        });

        Ex.setOnMouseClicked(e->{
            Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
                Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            
        });

        Revive.setOnMouseClicked(e->{


            if (collected_coins>=10) {
                collected_coins=collected_coins-10;

                coinLabel.setText(Integer.toString(collected_coins));

                Player.setX(100);
                Player.setY(200);
                Player.setRotate(0);

                pane.getChildren().removeAll(Ex,Revive,fordistance,forscore,Score,Distance);
                killed=false;
            }
            
        });

        Exit_Layout.setOnMouseClicked(e->{

            SaveData data = new SaveData();
            // data.blocks=blocks;
            // data.blocks_dimensions=blocks_dimensions;
            // data.chest_type=chest_type;
            // data.coins=coins;
            // data.coins_=coins_;
            // data.normalorc_dimentsionsArray=normalorc_dimentsionsArray;
            // data.normalorc_imageArray=normalorc_imageArray;
            // data.weaponchest_dimentsionsArray=weaponchest_dimentsionsArray;
            // data.weaponchest_imageArray=weaponchest_imageArray;
            data.Boss_Health=Boss_Health;
            data.Coin_Animation_Time=Coin_Animation_Time;
            // data.Distance=Distance;
            // data.Distance_Image=Distance_Image;
            // data.Entername=Entername;
            // data.Ex=Ex;
            // data.Exit_Image=Exit_Image;
            // data.Exit_Layout=Exit_Layout;
            data.ForDie=ForDie;
            // data.LoadGame=LoadGame;
            // data.Player=Player;
            data.Player_Name=Player_Name;
            // data.Return_Layout=Return_Layout;
            // data.Revive=Revive;
            // data.Revive_Image=Revive_Image;
            // data.Score=Score;
            // data.Score_Image=Score_Image;
            data.TNTFade=TNTFade;
            data.TNT_Time=TNT_Time;
            data.bool=bool;
            data.bool2=bool2;
            data.boolforTNT=boolforTNT;
            // data.boss_D=boss_D;
            data.collected_coins=collected_coins;
            // data.currentTNT=currentTNT;
            data.current_weapon=current_weapon;
            data.distance=distance;
            data.dyingtime=dyingtime;
            data.for_Collision=for_Collision;
            // data.for_load_game=for_load_game;
            // data.for_new_game=for_new_game;
            // data.fordistance=fordistance;
            // data.forscore=forscore;
            data.hammer_damage=hammer_damage;
            data.is_hammer_allowed=is_hammer_allowed;
            data.is_sword_allowed=is_sword_allowed;
            data.killed=killed;
            // data.pane=pane;
            // data.player_image=player_image;
            // data.scene=scene;
            data.sword_damage=sword_damage;
            // data.timer=timer;
            // data.weapon_in_Hand=weapon_in_Hand;

            

            try {
                SaveManager.save(data,Player_Name);
            }
            catch (Exception et) {
                System.out.println("Save Failed"+et.getMessage());
            }


            Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
                Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                Scene scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e1) {
                e1.printStackTrace();
            }



        });


        

    }

    public void Stat_Menu() {
        // Image Revive_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Revive.png");
        // ImageView Revive=new ImageView(Revive_Image);

        Revive.setY(20);
        Revive.setX(320);
        Revive.setFitHeight(300);
        Revive.setFitWidth(300);

        // Image Exit_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Exit.png");
        // ImageView Ex=new ImageView(Exit_Image);

        Ex.setY(70);
        Ex.setX(800);
        Ex.setFitHeight(100);
        Ex.setFitWidth(200);

        // Image Score_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Score.png");
        // ImageView Score=new ImageView(Score_Image);

        Score.setY(100);
        Score.setX(210);
        Score.setFitHeight(400);
        Score.setFitWidth(400);

        // Label forscore=new Label();
        forscore.setScaleX(5);
        forscore.setScaleY(5);
        forscore.setStyle("-fx-text-fill:WHITE; -fx-font-size: 40; -fx-font-weight: bold;");
        forscore.relocate(690, 290);
        forscore.setText(Integer.toString(collected_coins));

        // Image Distance_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Distance.png");
        // ImageView Distance=new ImageView(Distance_Image);

        Distance.setY(300);
        Distance.setX(150);
        Distance.setFitHeight(500);
        Distance.setFitWidth(500);

        // Label fordistance=new Label();
        fordistance.setScaleX(5);
        fordistance.setScaleY(5);
        fordistance.setStyle("-fx-text-fill:WHITE; -fx-font-size: 40; -fx-font-weight: bold;");
        fordistance.relocate(730, 510);
        fordistance.setText(Integer.toString(distance));

        
        pane.getChildren().addAll(Ex,Revive,fordistance,forscore,Score,Distance);
        
        killed=true;
    }

    public void Win_Menu() {
        Image Won_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Won.png");
        ImageView Won=new ImageView(Won_Image);

        Won.setY(20);
        Won.setX(250);
        Won.setFitHeight(300);
        Won.setFitWidth(300);

        Image Princess_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/princess.png");
        ImageView Princess=new ImageView(Princess_Image);

        Princess.setY(40);
        Princess.setX(610);
        Princess.setFitHeight(200);
        Princess.setFitWidth(160);
        Princess.setRotate(-10);

        // Image Exit_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Exit.png");
        // ImageView Ex=new ImageView(Exit_Image);

        Ex.setY(70);
        Ex.setX(800);
        Ex.setFitHeight(100);
        Ex.setFitWidth(200);

        // Image Score_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Score.png");
        // ImageView Score=new ImageView(Score_Image);

        Score.setY(100);
        Score.setX(210);
        Score.setFitHeight(400);
        Score.setFitWidth(400);

        // Label forscore=new Label();
        forscore.setScaleX(5);
        forscore.setScaleY(5);
        forscore.setStyle("-fx-text-fill:WHITE; -fx-font-size: 40; -fx-font-weight: bold;");
        forscore.relocate(690, 290);
        forscore.setText(Integer.toString(collected_coins));

        // Image Distance_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Distance.png");
        // ImageView Distance=new ImageView(Distance_Image);

        Distance.setY(300);
        Distance.setX(150);
        Distance.setFitHeight(500);
        Distance.setFitWidth(500);

        // Label fordistance=new Label();
        fordistance.setScaleX(5);
        fordistance.setScaleY(5);
        fordistance.setStyle("-fx-text-fill:WHITE; -fx-font-size: 40; -fx-font-weight: bold;");
        fordistance.relocate(730, 510);
        fordistance.setText(Integer.toString(distance));

        
        pane.getChildren().addAll(Won,Princess,Ex,fordistance,forscore,Score,Distance);
        
        // killed=true;
    }

    public void Teleport() {
        distance+=10;
        disLabel.setText(Integer.toString(distance));
        

        for (int i=0;i<blocks.size();i++) {
            
            blocks.get(i).setX(blocks.get(i).getX()-1000);
            
        }
        for (int i=0;i<blocks_dimensions.size();i++) {
            
            blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()-1000);
            
            
    
        }
    
        for (int i=0;i<coins_.size();i++) {
            
            coins_.get(i).setX(coins_.get(i).getX()-1000);
            
        }
        for (int i=0;i<coins.size();i++) {
            
            coins.get(i).set_x(coins.get(i).get_x()-1000);
           
    
        }

        for (int i=0;i<weaponchest_dimentsionsArray.size();i++) {
            
            weaponchest_dimentsionsArray.get(i).set_x(weaponchest_dimentsionsArray.get(i).get_x()-1000);
            
        }


        for (int i=0;i<scenery.size();i++) {
            
            scenery.get(i).setX(scenery.get(i).getX()-200);
            
        }

    }

    public void Collision_with_Boss(Object_Dimenstions current_block) {
        current_block.get_image().setX(current_block.get_image().getX()+120);
        current_block.set_x(current_block.get_x()+120);

        for (int i=0;i<blocks_dimensions.size();i++) {
            if (blocks_dimensions.get(i).get_image()!=null) {
                if (current_block.get_image().equals(blocks_dimensions.get(i).get_image())) {
                    blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()+120);
                }
            }
        }

        for (int i=0;i<blocks.size();i++) {
            
            blocks.get(i).setX(blocks.get(i).getX()+50);
            
        }
        for (int i=0;i<blocks_dimensions.size();i++) {
            
            blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()+50);
            
            
    
        }
        
    
        for (int i=0;i<coins_.size();i++) {
            
            coins_.get(i).setX(coins_.get(i).getX()+50);
            
        }
        for (int i=0;i<coins.size();i++) {
            
            coins.get(i).set_x(coins.get(i).get_x()+50);
            
    
        }

        for (int i=0;i<weaponchest_dimentsionsArray.size();i++) {
            
            weaponchest_dimentsionsArray.get(i).set_x(weaponchest_dimentsionsArray.get(i).get_x()+50);
            
        }
    }

    public void Collision(Object_Dimenstions current_block) {
       

        

        
        
        current_block.get_image().setX(current_block.get_image().getX()+120);
        

        for (int i=0;i<blocks_dimensions.size();i++) {
            if (blocks_dimensions.get(i).get_image()!=null) {
                if (current_block.get_image().equals(blocks_dimensions.get(i).get_image())) {
                    blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()+120);
                }
            }
        }

        // for (int i=0;i<blocks.size();i++) {
            
        //     blocks.get(i).setX(blocks.get(i).getX()+50);
            
        // }
        // for (int i=0;i<blocks_dimensions.size();i++) {
            
        //     blocks_dimensions.get(i).set_x(blocks_dimensions.get(i).get_x()+50);
            
            
    
        // }
        
    
        // for (int i=0;i<coins_.size();i++) {
            
        //     coins_.get(i).setX(coins_.get(i).getX()+50);
            
        // }
        // for (int i=0;i<coins.size();i++) {
            
        //     coins.get(i).set_x(coins.get(i).get_x()+50);
            
    
        // }

        // for (int i=0;i<weaponchest_dimentsionsArray.size();i++) {
            
        //     weaponchest_dimentsionsArray.get(i).set_x(weaponchest_dimentsionsArray.get(i).get_x()+50);
            
        // }


        
        
    }

    public void Die(ImageView Obs) throws InterruptedException{
        Thread t=new Thread(new die(Obs));
        t.start();

        t.join();
        
        Obs.setOpacity(0);
        Obs.setX(-1000);
        Obs.setY(-1000);
        

        
    }


    

    

}

class die implements Runnable {
    ImageView Obs;

    die(ImageView o) {
        Obs = o;
    }

    @Override
    public void run() {
        RotateTransition rot=new RotateTransition();
        TranslateTransition trans=new TranslateTransition();
        rot.setNode(Obs);
        trans.setNode(Obs);
        rot.setDuration(Duration.millis(100));
        rot.setByAngle(180);
        trans.setToY(2000);
        trans.play();
        rot.play();
        
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

    public void set_image(ImageView image) {
        this.image=image;
    }
    public ImageView get_image() {
        return this.image;
    }



}


class SaveData implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    // AnchorPane pane;

    // Scene scene;

    String Player_Name;
    // ArrayList<ImageView> scenery=new ArrayList<>(); 

    // ArrayList<Object_Dimenstions> blocks_dimensions=new ArrayList<>();
    // ArrayList<ImageView> blocks=new ArrayList<>();
    // ArrayList<Object_Dimenstions> coins=new ArrayList<>();
    // ArrayList<ImageView> coins_=new ArrayList<>();

    // ArrayList<ImageView> weaponchest_imageArray=new ArrayList<>();
    // ArrayList<Object_Dimenstions> weaponchest_dimentsionsArray=new ArrayList<>();
    // ArrayList<String> chest_type=new ArrayList<>();

    // ArrayList<ImageView> normalorc_imageArray=new ArrayList<>();
    // ArrayList<Object_Dimenstions> normalorc_dimentsionsArray=new ArrayList<>();

    public int distance;
    public int collected_coins;
    
    public boolean bool;
    public boolean bool2;

    public boolean boolforTNT;
    public int TNT_Time;

    // private Stage primarystage;

    double TNTFade;
    int Coin_Animation_Time;

    // Object_Dimenstions currentTNT=null;

    boolean for_Collision;

    int ForDie=0;

    // Object_Dimenstions boss_D;

    // ImageView weapon_in_Hand;
    boolean is_hammer_allowed;
    boolean is_sword_allowed;

    int sword_damage;
    int hammer_damage;

    String current_weapon;


    int Boss_Health;


    // ImageView Exit_Layout;
    // ImageView Return_Layout;

    // Image Revive_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Revive.png");
    // ImageView Revive=new ImageView(Revive_Image);

    // Image Exit_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Exit.png");
    // ImageView Ex=new ImageView(Exit_Image);

    // Image Score_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Score.png");
    // ImageView Score=new ImageView(Score_Image);

    // Label forscore=new Label();
    
    // Image Distance_Image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Distance.png");
    // ImageView Distance=new ImageView(Distance_Image);

    // Label fordistance=new Label();

    // Image player_image=new Image("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hero.png");
    // ImageView Player=new ImageView(player_image);
    

    boolean killed=false;

    int dyingtime=0;

    // TextField for_new_game;
    // TextField for_load_game;

    // ImageView Entername=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Enterthename.png");
    // ImageView LoadGame=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Enterthename.png");

    // AnimationTimer timer;

    
}
import java.io.Serializable;
import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

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
    

    boolean killed;

    int dyingtime=0;

    // TextField for_new_game;
    // TextField for_load_game;

    // ImageView Entername=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Enterthename.png");
    // ImageView LoadGame=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Enterthename.png");

    // AnimationTimer timer;

    
}

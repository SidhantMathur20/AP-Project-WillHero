import javafx.scene.image.ImageView;

class Player {
    private String Player_Name;
    private ImageView Player_Face=new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hero.png");
    Object_Dimenstions Coordinates;
    public Player(String Name) {
        Player_Name=Name;
    }

    public String get_Name() {
        return this.Player_Name;
    }

    public ImageView get_image() {
        return this.Player_Face;
    }

    public void Die() {
        
    }
}
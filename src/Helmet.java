import javafx.scene.image.ImageView;

class Helmet{
    private ImageView Weapon;
    Helmet(ImageView Weapon) {
        this.Weapon=Weapon;
    }

    public ImageView get_Weapon() {
        return this.Weapon;
    }


    
}


class Weapon1 extends Helmet {
    Weapon1() {
        super(new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Sword.png"));
    }
}

class Weapon2 extends Helmet {
    Weapon2() {
        super(new ImageView("file:///Users/sidhantmathur/Documents/Will_Hero_VSCode/src/Images/Hammer.png"));
    }
}


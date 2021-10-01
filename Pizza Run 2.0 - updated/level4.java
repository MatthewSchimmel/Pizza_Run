import greenfoot.*;

/**
 * Write a description of class level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4 extends World
{

    /**
     * Constructor for objects of class level4.
     * 
     */
    public level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    

    private void prepare()
    {
        pizza_shop pizza_shop = new pizza_shop();
        addObject(pizza_shop, 96, 79);
        player4 player4 = new player4();
        addObject(player4, 460, 160);
        player4.setLocation(367, 106);
        house house = new house();
        addObject(house, 500, 500);
        V2 V2 = new V2();
        addObject(V2, 736, 281);
        V2 V22 = new V2();
        addObject(V22, 640, 725);
        V2 V23 = new V2();
        addObject(V23, 266, 409);
        V22.setLocation(485, 680);
        H2 H2 = new H2();
        addObject(H2, 164, 720);
        H2 H23 = new H2();
        addObject(H23, 392, 287);
        H2 H24 = new H2();
        addObject(H24, 678, 527);
        pizza pizza8 = new pizza();
        addObject(pizza8, 161, 254);
        pizza pizza9 = new pizza();
        addObject(pizza9, 161, 254);
        pizza pizza10 = new pizza();
        addObject(pizza10, 161, 254);
        pizza pizza11 = new pizza();
        addObject(pizza11, 161, 254);
        pizza pizza12 = new pizza();
        addObject(pizza12, 161, 254);
        pizza pizza13 = new pizza();
        addObject(pizza13, 161, 254);
        pizza pizza14 = new pizza();
        addObject(pizza14, 161, 254);
        pizza pizza15 = new pizza();
        addObject(pizza15, 161, 254);
        pizza pizza16 = new pizza();
        addObject(pizza16, 161, 254);
        pizza pizza17 = new pizza();
        addObject(pizza17, 161, 254);
        pizza17.setLocation(153, 218);
        pizza16.setLocation(120, 218);
        pizza15.setLocation(90, 219);
        pizza14.setLocation(61, 220);
        pizza13.setLocation(33, 220);
        pizza13.setLocation(29, 216);
        pizza14.setLocation(58, 217);
        pizza15.setLocation(90, 218);
        pizza12.setLocation(152, 180);
        pizza11.setLocation(127, 179);
        pizza10.setLocation(95, 179);
        pizza9.setLocation(59, 180);
        pizza8.setLocation(161, 254);
        pizza8.setLocation(161, 254);
        pizza8.setLocation(161, 254);
        pizza8.setLocation(161, 254);
        pizza8.setLocation(161, 254);
        pizza8.setLocation(161, 254);
        pizza8.setLocation(161, 254);
        pizza8.setLocation(161, 254);
        pizza8.setLocation(31, 176);
        level4tag level4tag = new level4tag();
        addObject(level4tag, 617, 24);
    }
}

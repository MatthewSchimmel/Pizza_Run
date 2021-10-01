import greenfoot.*;

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    

    private void prepare()
    {
        pizza_shop pizza_shop = new pizza_shop();
        addObject(pizza_shop, 96, 79);

        player3 player3 = new player3();
        addObject(player3, 460, 160);
        player3.setLocation(367, 106);
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
        pizza pizza6 = new pizza();
        addObject(pizza6, 217, 257);
        pizza pizza7 = new pizza();
        addObject(pizza7, 217, 257);
        pizza pizza8 = new pizza();
        addObject(pizza8, 217, 257);
        pizza pizza9 = new pizza();
        addObject(pizza9, 217, 257);
        pizza pizza10 = new pizza();
        addObject(pizza10, 217, 257);
        pizza pizza11 = new pizza();
        addObject(pizza11, 217, 257);
        pizza pizza12 = new pizza();
        addObject(pizza12, 217, 257);
        pizza12.setLocation(38, 175);
        pizza11.setLocation(69, 175);
        pizza10.setLocation(106, 175);
        pizza9.setLocation(143, 175);
        pizza8.setLocation(79, 297);
        pizza12.setLocation(38, 210);
        pizza11.setLocation(73, 209);
        pizza10.setLocation(107, 207);
        pizza9.setLocation(140, 206);
        pizza8.setLocation(55, 187);
        pizza7.setLocation(89, 185);
        pizza6.setLocation(126, 179);
        level3tag level3tag = new level3tag();
        addObject(level3tag,617, 24);
    }
}

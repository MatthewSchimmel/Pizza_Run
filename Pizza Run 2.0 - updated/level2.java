import greenfoot.*;

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    

    private void prepare()
    {
        pizza_shop pizza_shop = new pizza_shop();
        addObject(pizza_shop, 96, 79);
        pizza pizza = new pizza();
        addObject(pizza, 36,176);
        pizza pizza2 = new pizza();
        addObject(pizza2, 69,175);
        pizza pizza3 = new pizza();
        addObject(pizza3, 101,177);
        pizza pizza4 = new pizza();
        addObject(pizza4, 132,178);
        pizza pizza5 = new pizza();
        addObject(pizza5, 164,178);
        player2 player2 = new player2();
        addObject(player2, 460, 160);
        player2.setLocation(367, 106);
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
        level2tag level2tag = new level2tag();
        addObject(level2tag, 617, 24);
    }
}

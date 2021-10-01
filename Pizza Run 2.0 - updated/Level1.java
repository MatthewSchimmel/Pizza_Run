import greenfoot.*;

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public Level1()
    {    
        super(800, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
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
        player player = new player();
        addObject(player, 460, 160);
        player.setLocation(367, 106);
        house house = new house();
        addObject(house, 500, 500);
        dude2 dude2 = new dude2();
        addObject(dude2, 736, 281);
        dude2 dude22 = new dude2();
        addObject(dude22, 640, 725);
        dude2 dude23 = new dude2();
        addObject(dude23, 266, 409);
        dude22.setLocation(485, 680);
        dude dude = new dude();
        addObject(dude, 164, 720);
        dude dude3 = new dude();
        addObject(dude3, 392, 287);
        dude dude4 = new dude();
        addObject(dude4, 678, 527);
        level1tag level1tag = new level1tag();
        addObject(level1tag, 642, 59);
        level1tag.setLocation(617, 24);
    }
}

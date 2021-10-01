import greenfoot.*;

/**
 * Write a description of class cheatmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cheatmenu extends Actor
{
    /**
     * Act - do whatever the cheatmenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public cheatmenu() 
    {
        setImage (new GreenfootImage("Welcome to the Cheats Menu\n1 = level 1\n2 = level 2\n3 = level 3\n4 = level 4\n5 = level 5\n6 = Invincibility On\n7 = Invincibility Off\n8 = Add Score\n9 = Instant Win\nP = pause game\nesc = Exit This Menu", 60, Color.BLACK,Color.WHITE));
        
    }   
    public void act() 
    {
        if (Greenfoot.isKeyDown("escape"))
        {
            getWorld().removeObject(this);
        }
    }    
}

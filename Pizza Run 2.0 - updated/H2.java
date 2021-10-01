import greenfoot.*;

/**
 * Write a description of class dude here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class H2 extends Actor
{
    /**
     * Act - do whatever the dude wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    public void act() 
    {
        moveAround ();
    }    
    public void moveAround ()
    {
       move(3);
       if(getX()==799)
       {
           setLocation(1,getY());
        }
    }
}
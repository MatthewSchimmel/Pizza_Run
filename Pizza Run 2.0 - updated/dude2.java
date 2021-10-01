import greenfoot.*;

/**
 * Write a description of class dude2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dude2 extends Actor
{
    /**
     * Act - do whatever the dude2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround ();
    }    
    public void moveAround ()
    {
       setLocation (getX(),getY()+2);
       if(getY()==799)
       {
           setLocation(getX(),0);
        }
    }
}
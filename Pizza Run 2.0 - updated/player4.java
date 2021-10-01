import greenfoot.*;

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player4 extends Actor
{
    boolean hasPizza = false;
    boolean invincible = false;
     int score = 0;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        setRotation();
        pickup();
        deliver();
        win();
        lose();
        checkcheat();
    }    
    public void move()
    {
          if (Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 4, getY() + 4);
        } else
            if (Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 4, getY() + 4);
        } else
            if (Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 4, getY() - 4);
        } else
            if (Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 4, getY() - 4);
        } else
            if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+6);
        } else 
            if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-6, getY());
        } else
            if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
        {
            setLocation(getX (), getY()-6);
        } else
            if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+6, getY());
        }
    }
    public void setRotation()
    {
        if (Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d"))
        {
            setRotation(135);
        } else
            if (Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a"))
        {
            setRotation(225);
        } else
            if (Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d"))
        {
            setRotation(45);
        } else
            if (Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("a"))
        {
            setRotation(315);
        } else
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
        {
            setRotation(180);
        } else 
            if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            setRotation(270);
        } else
            if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
        {
            setRotation(0);
        } else
            if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            setRotation(90);
        }
    }
       public void pickup()
    {
      if (hasPizza == false && isTouching(pizza.class))  
      {
           hasPizza = true;
           getWorld().removeObject(getOneIntersectingObject(pizza.class));
       }
    }
    public void deliver()
    {
        if (isTouching(house.class) && hasPizza == true)
        {
            score--;
            getWorld().removeObject(getOneIntersectingObject(house.class));
            getWorld().addObject(new house(),Greenfoot.getRandomNumber(400) + 400,Greenfoot.getRandomNumber(800));
            hasPizza = false;
        }
    }
    public void win()
    {
        if (score == -10 )
        {
              Greenfoot.setWorld(new level5());
        }
    }
    public void lose()
    {
        if (isTouching(H2.class) && invincible == false)
        {
            getWorld().addObject(new losescreen(), 400,400);
            Greenfoot.stop();
        }
        if (isTouching(V2.class) && invincible == false)
        {
            getWorld().addObject(new losescreen(), 400,400);
            Greenfoot.stop();
        }
    }
    public void checkcheat()
    {
        if (Greenfoot.isKeyDown("shift"))
        {
            getWorld().addObject(new cheatmenu(), 400,400);
        }
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new Level1());
        }
        if (Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new level2());
        }
        if (Greenfoot.isKeyDown("3"))
        {
            Greenfoot.setWorld(new level3());
        }
        if (Greenfoot.isKeyDown("4"))
        {
            Greenfoot.setWorld(new level4());
        }
        if (Greenfoot.isKeyDown("5"))
        {
            Greenfoot.setWorld(new level5());
        }
        if (Greenfoot.isKeyDown("6"))
        {
            invincible = true;
        }
        if (Greenfoot.isKeyDown("8"))
        {
            score--;
        }
        if (Greenfoot.isKeyDown("7"))
        {
            invincible = false;
        }
        if (Greenfoot.isKeyDown("9"))
        {
            getWorld().addObject(new winscreen(), 400,400);
            Greenfoot.stop();
        }
        if (Greenfoot.isKeyDown("P"))
        {
            Greenfoot.stop();
        }
    }
}

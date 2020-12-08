import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Tejas, Akhil, Eric, Arvind 
 * @version 1
 */
public class Hitbox extends Actor //used to detect when a state has been pressed
{
    /**
     * Act - do whatever the Hitbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String state = "";
    public Hitbox(int size, String name){
        getImage().scale(size, size);  // scales the dot based on state size
        getImage().setTransparency(0); // makes actor invisble
        state = name;
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            if(state.equals("CONTINUE"))
                Greenfoot.setWorld(new MyWorld()); //has the continue button shift to the main world
            else if(state.equals("AGAIN")){
                MyWorld.mainCounter = 0;
                MyWorld.guessesNeeded = 5;
                Greenfoot.setWorld(new Clue("Western Detective"));
            }
            else
                Greenfoot.setWorld(new Clue(state)); //creates an appropriate clue world for the state pressed
        }
    }    
}

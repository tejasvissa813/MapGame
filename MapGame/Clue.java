import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Tejas, Akhil, Eric, Arvind
 * @version 1
 */
public class Clue extends World
{

    /**
     * Constructor for objects of class Clue.
     * 
     */
    static String lastAnswer;
    String riddle;
    String title;
    public Clue(String name)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        title = name; //The name of the state currently in
        update(); 
        RiddleHolder.updateSelection();  //updates the RiddleHolder's index
        riddle = RiddleHolder.getRiddle();  //fetches a new riddle
        lastAnswer = RiddleHolder.getAnswer(); //gets a new answer for the riddle
    }
    public void update(){ //updates the number of correct guesses needed to win
        if(title.equals(lastAnswer)){ //checks for right answer
            MyWorld.guessesNeeded--;  
        }
        else{
            MyWorld.guessesNeeded++;
        }
    }
    public void act(){ //shows all the appropriate information on the clues page
        if(MyWorld.guessesNeeded == 0){
            finish();
        }
        else{
            nextClue();
        }
    }
    public void finish(){
        showText("You Win!!!", getWidth()/2, getHeight()/2);
        Hitbox again = new Hitbox(100,"AGAIN");
        showText("GO", getWidth()/2, (getHeight()/2) + 150);
        addObject(again, getWidth()/2, (getHeight()/2) + 150);
    }
    public void nextClue(){
        showText(riddle, getWidth()/2, getHeight()/2);
        showText("Welcome To " + title, getWidth()/2, (getHeight()/2) - 150);
        if(title.equals("Western Detective")){
            showText("Try and Catch Me", getWidth()/2, (getHeight()/2) - 100);
        }
        showText(MyWorld.guessesNeeded + " Steps Away", getWidth()/2, (getHeight()/2) + 100);
        Hitbox next = new Hitbox(100,"CONTINUE");
        showText("WHERE AM I?", getWidth()/2, (getHeight()/2) + 150);
        addObject(next, getWidth()/2, (getHeight()/2) + 150);
    }
}

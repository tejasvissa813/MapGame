
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Tejas, Akhil, Eric, Arvind
 * @version 1
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static int mainCounter = 0; //number of times program has looped
    static int guessesNeeded = 4; //number of clues remaining until the criminal is caught
    public MyWorld()
    {    
        super(580, 365, 1);
        if(mainCounter == 0){ //only on the first iteration, the opening screen is displayed in the Clues world
            System.out.println("\n\n\n");
            Greenfoot.setWorld(new Clue("Capital Detective"));
        }
        
        //adds the hit boxes for each state
        
        Hitbox california = new Hitbox(75,"California");
        addObject(california,52,170);
        
        Hitbox oregon = new Hitbox(50,"Oregon");
        addObject(oregon,66,72);
        
        Hitbox washington = new Hitbox(50,"Washington");
        addObject(washington,81,31);
        
        Hitbox idaho = new Hitbox(50,"Idaho");
        addObject(idaho,126,89);
        
        Hitbox nevada = new Hitbox(50,"Nevada");
        addObject(nevada,90,135);
        
        Hitbox arizona = new Hitbox(50,"Arizona");
        addObject(arizona,127,217);
        
        Hitbox utah = new Hitbox(50,"Utah");
        addObject(utah,141,158);
        
        Hitbox wyoming = new Hitbox(50,"Wyoming");
        addObject(wyoming,190,113);
        
        Hitbox montana = new Hitbox(50,"Montana");
        addObject(montana,180,57);
        
        Hitbox colarado = new Hitbox(50,"Colarado");
        addObject(colarado,200,168);
        
        Hitbox newMexico = new Hitbox(50,"New Mexico");
        addObject(newMexico,189,226);
        
        Hitbox texas = new Hitbox(50,"Texas");
        addObject(texas,270,274);
        
        Hitbox oklahoma = new Hitbox(50,"Oklahoma");
        addObject(oklahoma,290,221);
        
        Hitbox kansas = new Hitbox(50,"Kansas");
        addObject(kansas,277,180);
        
        Hitbox nebraska = new Hitbox(50,"Nebraska");
        addObject(nebraska,268,141);
        
        Hitbox southDakota = new Hitbox(50,"South Dakota");
        addObject(southDakota,263,96);
        
        Hitbox northDakota = new Hitbox(50,"North Dakota");
        addObject(northDakota,267,59);
        
        Hitbox alaska = new Hitbox(50,"Alaska");
        addObject(alaska,118,302);
        
        Hitbox hawaii = new Hitbox(50,"Hawaii");
        addObject(hawaii,214,336);
        
        Hitbox minnesota = new Hitbox(50,"Minnesota");
        addObject(minnesota,322,77);
        
        Hitbox iowa = new Hitbox(50,"Iowa");
        addObject(iowa,330,133);
        
        Hitbox missouri = new Hitbox(50,"Misouri");
        addObject(missouri,340,190);
        
        Hitbox arkansas = new Hitbox(50,"Arkansas");
        addObject(arkansas,344,224);
        
        Hitbox louisiana = new Hitbox(50,"Louisiana");
        addObject(louisiana,341,265);
        
        Hitbox wisconsin = new Hitbox(50,"Wisconsin");
        addObject(wisconsin,363,94);
        
        Hitbox illinois = new Hitbox(50,"Illinois");
        addObject(illinois,374,161);
        
        Hitbox kentucky = new Hitbox(50,"Kentucky");
        addObject(kentucky,417,191);
        
        Hitbox tenessee = new Hitbox(50,"Tennessee");
        addObject(tenessee,409,219);
        
        Hitbox mississippi = new Hitbox(50,"Mississippi");
        addObject(mississippi,372,277);
        
        Hitbox michigan = new Hitbox(50,"Michigan");
        addObject(michigan,418,120);
        
        Hitbox indiana = new Hitbox(50,"Indiana");
        addObject(indiana,405,161);
        
        Hitbox ohio = new Hitbox(40,"Ohio");
        addObject(ohio,440,153);
        
        Hitbox alabama = new Hitbox(50,"Alabama");
        addObject(alabama,406,256);
        
        Hitbox virginia = new Hitbox(30,"Virginia");
        addObject(virginia,478,185);
        
        Hitbox northCarolina = new Hitbox(50,"North Carolina");
        addObject(northCarolina,487,208);
        
        Hitbox southCarolina = new Hitbox(50,"South Carolina");
        addObject(southCarolina,475,233);
        
        Hitbox georgia = new Hitbox(50,"Georgia");
        addObject(georgia,447,257);
        
        Hitbox florida = new Hitbox(50,"Florida");
        addObject(florida,476,324);
        
        Hitbox westVirginia = new Hitbox(30,"West Virginia");
        addObject(westVirginia,464,164);
        
        Hitbox pennsylvania = new Hitbox(50,"Pennsylvania");
        addObject(pennsylvania,490,135);
        
        Hitbox newYork = new Hitbox(50,"New York");
        addObject(newYork,509,105);
        
        Hitbox maine = new Hitbox(50,"Maine");
        addObject(maine,556,57);
        
        Hitbox vermont = new Hitbox(10,"Vermont");
        addObject(vermont,528,79);
        
        Hitbox newHampshire = new Hitbox(10,"New Hampshire");
        addObject(newHampshire,543,91);
        
        Hitbox massachussetts = new Hitbox(10,"Massachusetts");
        addObject(massachussetts,539,101);
        
        Hitbox connecticut = new Hitbox(10,"Connecticut");
        addObject(connecticut,538,114);
        
        
        Hitbox newJersey = new Hitbox(15,"New Jersey");
        addObject(newJersey,537,136);
        
        Hitbox delaware = new Hitbox(15,"Delaware");
        addObject(delaware,542,152);
        
        Hitbox maryland = new Hitbox(15,"Maryland");
        addObject(maryland,542,169);
        
        mainCounter++; //increments the amount of time the code has looped into this world
    }
    public void act(){
        if(Greenfoot.mouseClicked(this))
            System.out.println(Greenfoot.getMouseInfo() + "\n");
    }
}

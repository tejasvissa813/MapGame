/**
 * 
 * 
 * @author Tejas, Akhil, Eric, Arvind
 * @version 1
 */
import java.util.Random;
public class RiddleHolder  //stores and fetches state and riddle information
{
    private static String[] riddles = {"This state's capital is Sacramento", 
                                       "This state's capital is Salem", 
                                       "This state's capital is Olympia",
                                       "This state's capital is Boise",
                                       "This state's capital is Carson City", 
                                       "This state's capital is Phoenix",
                                       "This state's capital is Salt Lake CIty",
                                       "This state's capital is Cheyene",
                                       "This state's capital is Helena",
                                       "This state's capital is Denver",
                                       "This state's capital is Santa Fe",
                                       "This state's capital is Austin",
                                       "This state's capital is Oklahoma City",
                                       "This state's capital is Topeka",
                                       "This state's capital is Lincoln",
                                       "This state's capital is Pierre",
                                       "This state's capital is Bismarck",
                                       "This state's capital is Juneau",
                                       "This state's capital is Honolulu",
                                       "This state's capital is St. Paul",
                                       "This state's capital is Des Moines",
                                       "This state's capital is Jefferson City",
                                       "This state's capital is Little Rock",
                                       "This state's capital is Baton Rouge",
                                       "This state's capital is Madison",
                                       "This state's capital is Springfield",
                                       "This state's capital is Frankfurt",
                                       "This state's capital is Nashville",
                                       "This state's capital is Jackson",
                                       "This state's capital is Lansing",
                                       "This state's capital is Indianapolis",
                                       "This state's capital is Columbus",
                                       "This state's capital is Montgomery",
                                       "This state's capital is Richmond",
                                       "This state's capital is Raleigh",
                                       "This state's capital is Columbia",
                                       "This state's capital is Atlanta",
                                       "This state's capital is Tallahassee",
                                       "This state's capital is Charleston",
                                       "This state's captial is Harrisburg",
                                       "This state's capital is Albany",
                                       "This state's capital is Augusta",
                                       "This state's capital is Montpelier",
                                       "This state's capital is Concord",
                                       "This state's capital is Boston",
                                       "This state's capital is Hartford",
                                       "This state's capital is Trenton",
                                       "This state's capital is Dover",
                                       "This state's capital is Annapolis"}; //List of riddles for each state
    private static String[] answers = {"California", "Oregon", "Washington", "Idaho", "Nevada", "Arizona","Utah","Wyoming","Montana", 
                                       "Colarado","New Mexico","Texas","Oklahoma","Kansas","Nebraska","South Dakota","North Dakota", "Alaska",
                                       "Hawaii","Minnesota","Iowa","Missouri","Arkansas","Louisiana","Wisconsin","Illinois","Kentucky","Tennessee",
                                       "Mississippi","Michigan","Indiana","Ohio","Alabama","Virginia","North Carolina","South Carolina",
                                       "Georgia","Florida","West Virginia","Pennsylvania","New York","Maine","Vermont","New Hampshire",
                                       "Massachusetts","Connecticut","New Jersey","Delaware","Maryland"}; //list of states
    private static int selection;
    /**
     * Constructor for objects of class Riddles
     */
    public RiddleHolder()
    {
        selection = -1;
    }
    public static void updateSelection(){
        selection = (int)(Math.random() * answers.length);//randomizes the index from which riddles are chosen from
    }
    public static String getRiddle(){
        return riddles[selection]; //returns the appropriate riddle 
    }
    public static String getAnswer(){
        return answers[selection]; //returns the appropriate state
    }
}

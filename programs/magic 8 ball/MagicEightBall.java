// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// magic 8 ball
// File Description
// Assignment #6
// 11/13
import java.util.*;
public class MagicEightBall
{
    public static void main(String[] args){
        System.out.println("programmed by norris chan");
        
        
        System.out.println(Math.random());
        
        Scanner input = new Scanner(System.in);
        
        //random responses from the 8 ball
        String[] randomResponses = {"It is certain", "It is decidedly so", "Without a doubt",
                                    "Yes - definitely", "You may rely on it", "As I see it, yes",
                                    "Most likely", "Outlook good", "Signs point to yes",
                                    "Yes", "Reply hazy, try again", "Ask again later",
                                    "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
                                    "Don't count on it", "My reply is no", "My sources say no",
                                    "Outlook not so good", "Very doubtful"};
        
        String cont = "";
                                    
        do{
            //promts user for a question
            System.out.println("What is your question?");
            String question = input.next();
            
            //prints a random response from the random generated number
            System.out.println(randomResponses[generateRandNum()]);
            
            //asks the user if they want to continue
            System.out.println("Do you want to ask another question? enter yes or no");
            cont = input.next();
            
            //while loop continues to run when the user enters yes
            } while (cont == "yes");
    }
    
    //generates random number between 0-19
    public static int generateRandNum(){
        int random = (int)(Math.random()*19 + 1);
        return random;
    }
}

// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// magic 8 ball
// File Description
// Assignment #6
// 11/13/16

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.security.SecureRandom;
    
public class MagicEightBall
{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //generates a random integer
        SecureRandom random = new SecureRandom();
        int num;
        
        //random responses from the 8 ball
        String[] randomResponses = {"It is certain", "It is decidedly so", "Without a doubt",
                                    "Yes - definitely", "You may rely on it", "As I see it, yes",
                                    "Most likely", "Outlook good", "Signs point to yes",
                                    "Yes", "Reply hazy, try again", "Ask again later",
                                    "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
                                    "Don't count on it", "My reply is no", "My sources say no",
                                    "Outlook not so good", "Very doubtful"};
        
        //creating the reference so that ImageIcon object to display the image in the output dialog box
        ImageIcon image = new ImageIcon("8ball_small.JPG");
        
        int anotherQuestion = 0;
        
        while(anotherQuestion == 0){
        
            //asks user for a question
            String question = JOptionPane.showInputDialog(null,"what is your question","welcome to magic 8-ball",0);
            
            //generates a random integer
            num = random.nextInt(20);
        
            //message display
            JOptionPane.showMessageDialog(null, question + "\n\n\n" + randomResponses[num],"magic 8-ball says", 0, image);
        
            int again = JOptionPane.showConfirmDialog(null, "", "ask magic 8-ball again", JOptionPane.YES_NO_OPTION, 0, image);
            
            //stops the while loop when again is 1
            if (again == 1 ){
                anotherQuestion = 1;
                JOptionPane.showMessageDialog(null,"programmed by norris chan","magic 8-ball says goodbye", 0, image);
            }
        }   
        
     }

}

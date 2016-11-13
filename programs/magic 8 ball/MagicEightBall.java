// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// magic 8 ball
// File Description
// Assignment #6
// 11/13
import java.util.*;
import javax.swing.JOptionPane;
public class MagicEightBall
{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"programmed by norris chan");
        
        Scanner input = new Scanner(System.in);
        
        //random responses from the 8 ball
        String[] randomResponses = {"It is certain", "It is decidedly so", "Without a doubt",
                                    "Yes - definitely", "You may rely on it", "As I see it, yes",
                                    "Most likely", "Outlook good", "Signs point to yes",
                                    "Yes", "Reply hazy, try again", "Ask again later",
                                    "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
                                    "Don't count on it", "My reply is no", "My sources say no",
                                    "Outlook not so good", "Very doubtful"};
        
        //creating the referencet to that ImageIcon object to display the image in the output dialog box
        ImageIcon image = new ImageIcon("8ball_small.jpg");
    }
    
    //to display the magic 8 ball image in the output dialog box
    public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType, Icon icon){
        parentComponent = null;
        String messageDisplay = message;
        String displayTitle = title;
        messageType = 0;
        ImageIcon image = icon;
        
    }
    
    //to use ae yes/ nno dialog box
    public static int showConfirmDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon){
        
    }
    
    //generates random number between 0-19
    public static int generateRandNum(){
        int random = (int)(Math.random()*19 + 1);
        return random;
    }
}

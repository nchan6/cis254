// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// password
// Program Description
// Assignment #7
// 11/25/16

import javax.swing.JOptionPane;
import javax.swing.*;

public class Password
{
    public static void main(String[] args){    
       JPanel panel = new JPanel();
       JLabel label = new JLabel("Enter a password:");
       JPasswordField pass = new JPasswordField(10);
       // place the label and the password field on the JPanel container
       panel.add(label);
       panel.add(pass);
       String[] options = new String[]{"OK", "Cancel"};
       int option = JOptionPane.showOptionDialog(null, panel, "password",
       JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
       null, options, options[1]);
       System.out.println(option);
       
       if(option == 0){ // OK button was pressed
       
       }
       // retrieve the password from the input field
       char[] password = pass.getPassword();
       System.out.println("Your password is: " + new String(password));
    }
    
    
    public static boolean isValidPassword(String pass){
        boolean validLength = false;
        boolean onlyLettersAndDigits = false;
        boolean atLeast2Digits = false;
        int numOfDigits = 0;
        int otherChar = 0;
        
        //returns false if 
        if (pass.length() < 8){
            validLength = true;
        } 
        
        for (int count = 0; count < pass.length(); count++){
            //tests to see if there are only letters and digits
            if (!((pass.charAt(count) >= 'a' && pass.charAt(count) <= 'z') || (pass.charAt(count) >= 'A' && pass.charAt(count) <= 'Z') || ( pass.charAt(count) >= '0' && pass.charAt(count) <= '9'))){
                otherChar++;
                
                //tests to see if there at least 2 digits
            } else if (Character.isDigit(pass.charAt(count))){
                //increases the count for digits
                numOfDigits++;
                
            }
        }
        
        // changes the variable to true if there are no other charactes
        if (otherChar > 0){
            onlyLettersAndDigits = true;
        }
        
        //changes the value to true if there are at least 2 digits
        if (numOfDigits >= 2){
            atLeast2Digits = true;
        }
        
        return (validLength && onlyLettersAndDigits && atLeast2Digits);
    
    }
}

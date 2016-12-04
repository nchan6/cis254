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
       
       int limit = 0;
       
       do{
           // place the label and the password field on the JPanel container
           panel.add(label);
           panel.add(pass);
           String[] options = new String[]{"OK", "Cancel"};
           int option = JOptionPane.showOptionDialog(null, panel, "password",
           JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
           null, options, options[1]);

           if(option == 0){ // OK button was pressed
               //convert char to string so you can pass to isValid mothod
               char[] password = pass.getPassword();
               String pw = new String(password);
           
               boolean valid = isValidPassword(pw);
               if (valid == true){
                   JOptionPane.showMessageDialog(null,"valid password\n\nprogrammed by norris chan","message",0);
                   //stops the loop if there is a valid password
                   limit = 3;
                } else if (valid == false){
                   JOptionPane.showMessageDialog(null,"invalid password\n\nprogrammed by norris chan","message",0);
                   //limit increments of the password is invalid
                   limit++;
                }
               System.out.println("Your password is: " + new String(password));
            }
        }while(limit < 3);
    }

    public static boolean isValidPassword(String pass){
        boolean validLength = false;
        boolean onlyLettersAndDigits = false;
        boolean atLeast2Digits = false;
        boolean validPass = false;
        int numOfDigits = 0;
        int numChar = 0;
        
        //returns false if the length is valid
        if (pass.length() >= 8){
            validLength = true;
        } 
        
        for (int count = 0; count < pass.length(); count++){
            //counts the number of letters and numbers
            if (((Character.isLowerCase(pass.charAt(count))) || (Character.isUpperCase(pass.charAt(count))) || (Character.isDigit(pass.charAt(count))))){
                numChar++;
                
                //tests to see if there at least 2 digits
            }
            if (Character.isDigit(pass.charAt(count))){
                //increases the count for digits
                numOfDigits++;
                
            }
        }
        
        //if the number of letter and numbers are not equal to the length, then there is a different character, thus returns false
        if (numChar == pass.length()){
            onlyLettersAndDigits = true;
        }

        //changes the value to true if there are at least 2 digits
        if (numOfDigits >= 2){
            atLeast2Digits = true;
        }
        
        //returns true if all the tests are true
        if ((validLength == true) && (onlyLettersAndDigits == true) && (atLeast2Digits == true)){
            validPass = true;
        }
        
        return validPass;
    }
}

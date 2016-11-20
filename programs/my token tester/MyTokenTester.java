// Norris Chan
// norrischan@my.smccd.edu
// CIS 254 OL
// my token tester
// File Description
// Lab #7
// Date 11/19/16

import java.util.*;

public class MyTokenTester
{
    public static void main(String[] args){
        System.out.println("programmed by norris chan");
        
        Scanner input = new Scanner(System.in);
        String line;
        boolean quit = false;
        
        while (quit == false){
            System.out.println("Enter a sentence. Type quit to quit");
            line = input.next();
            
            //changes the value of quit if the user types quit
            if( line == "quit"){
                quit = true;
            }
            
            //creates an array separating each word using a space
            String[] array = line.split(" ");
            System.out.println(array.length);
            
            //prints the sentence in reverse order
            for ( int count = array.length - 1; count >= 0 ; count--){
                //tests to see if there is punctuation
                if (array[count].charAt(array[count].length() - 1) == '.'){
                    
                    System.out.print(array[count].substring(0, array[count].indexOf(".")));
                } else if (array[count].charAt(array[count].length() - 1) == '!'){
                    
                    System.out.print(array[count].substring(0, array[count].indexOf("!")));
            
                } else if (array[count].charAt(array[count].length() - 1) == '.'){
                    
                    System.out.print(array[count].substring(0, array[count].indexOf("?")));
                } else {
                    //prints the word without the punctuation
                    System.out.print(array[count]);
                }
                System.out.print(" ");
            }
            
            System.out.println();      
        }
        
        
    }
}

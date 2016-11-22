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
        String sentence = "";
        
        while (! ( sentence.equals("quit") || sentence.equals("Quit") || sentence.equals("QUIT"))){
            //prompts user to enter a sentence or quit
            System.out.println("enter a sentence or type quit to quit");
            sentence = input.nextLine();
            
            //creates an array,each element represents a word
            String[] words = sentence.split(" ");
            
            //finds the punctuation
            char punc = sentence.charAt(sentence.length() - 1);
            if (!(punc == '.' || punc == '!' || punc == '?'	)){
                punc = ' ';
            }
        
            for( int count = words.length - 1 ; count >= 0; count--){
                //prints the words without punctuation
                if (words[count].indexOf(punc) == -1){
                    System.out.print(words[count]);
                } else {
                    System.out.print(words[count].substring(0,words[count].length() - 1));
                }
                
                //prints the correct amt of spaces
                if (count != 0){
                    System.out.print(" ");
                }
            }
            System.out.print(punc + "\n\n");
        }
        
    }
}





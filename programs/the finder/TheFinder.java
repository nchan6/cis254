// Norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// the finder
// File Description
// Lab #7
// 11/21/16

import java.util.*;

public class TheFinder
{
    public static void main(String[] args){
        System.out.println("programmed by norris chan");
        
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        System.out.println("enter a sentence");
      
        String sentence = input.nextLine();        
         
        //goes through each character in the sentence
        for(int num = 0; num < sentence.length(); num ++){
            //count increments if the index of "the" is the same as num
            if (sentence.indexOf("the") == num){
                count++;
            }
        }
        
        //output
        System.out.println("the number of time \"the\" occurs is "+ count);
    }
}
        



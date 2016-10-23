// Norris Chan
// norrischanmy.smccd.edu
// CIS 254 OL
// findlargesmall
// given 6 integers, find the largest and smallest number
// Assignment #3
// 10/2/16
import java.util.*;
public class FindLargeSmall
{
    public static void main(String[] args){
        System.out.println("programmed by norris chan");
        
        //prompt user to enter 6 numbers
        System.out.println("enter 6 integers");
        Scanner input = new Scanner(System.in);
        
        //start off with the first 2 integers to intitalize large and small 
        System.out.print("integer 1 = ");
        int integer1 = input.nextInt();
        
        //intitialize small
        int small = integer1;
        System.out.print("\ninteger 2 = ");
        int integer2 = input.nextInt();
        
        //initialize large, numbInput and count
        int large = integer2;
        int numbInput;
        
        //set large and small btw the 2 numbers, test with if statement
        if ( integer1 < integer2 ){
            small = integer1;
            large = integer2;
        } else {
            small = integer2;
            large = integer1;
        }
        
        //initialize count starting at 3 because the first two integers are already defined
        int count = 3;
        
        //using a for loop to ask the user for the rest of the number starting with integer 3
        while(count <= 6){
            //prompts user to input the rest of the numbers
            System.out.print("\ninteger " + count + " = ");
            numbInput = input.nextInt();
            
            //changes the value of small if numbInput is smaller
            while( small > numbInput){
                small = numbInput;
            }
            
            //changes the value of large if numbInput is larger
            while( large < numbInput){
                large = numbInput;
            }
            count++;
        }
        
        //print out final large and small
        System.out.println("the largest number is " + large + "\nthe smallest number is " + small);
    }
}

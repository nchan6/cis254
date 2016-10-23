// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// pyramid printer
// File Description
// Assignment #4
// 10/14/16
import java.util.*;
public class PyramidPrinter
{
   public static void main(String [] args)
   {
       System.out.println("programmed by norris chan");
       Scanner input = new Scanner(System.in);
       
       //prompts user for a number
       System.out.println("enter a integer");
       int height = input.nextInt();
       
       //row increases from 1-8 represents the number of lines
       for (int row = 0; row < height; row++){
           
           //prints the number of space in each line depending on the count
           for ( int space = 1; space <= height - row; space++){
               System.out.print("    ");
            }
            
           //prints the numbers from increasing order
           for ( int count = 0; count <= row; count++){
               System.out.printf("%4d", (int)Math.pow(2, count));
            }
           
           //prints the numbers from decending order
           for ( int count2 = row-1; count2 >= 0; count2--){
               System.out.printf("%4d", (int)Math.pow(2, count2));
            }
           
            //creates a new line
           System.out.println();
        }
   }
}

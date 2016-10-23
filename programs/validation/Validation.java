// Norris Chan
// norrischan@my.smccd.edu
// CIS 254 OL
// validation
// File Description
// Lab #4
// Date 10/9/16
import java.util.*;
public class Validation
{
   public static void main(String[] args){
       System.out.println("programmed by norris chan");
       Scanner input = new Scanner(System.in);
       
       int num ;
       //this do while statement forces the user to input numbers betwee the range
       do { 
           System.out.println("enter a integer between 1-20");
           num = input.nextInt();
        } while ( (num >20) || (num < 1));
       
       //initialize the variables needed for this loop
       int square = 0;
       int cube = 0;
       
       System.out.println("Number\tSquare\tCube");
       
       //this loop prints out the numbers from 1 to the input number, its square and its cube
       for (int i = 1; i <= num; i++){
           square = i*i;
           cube = square*i;
           //lines up the output to the right 
           System.out.printf("%6d%,8d%,6d%n",i,square, cube);
        }
    }
}

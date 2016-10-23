// Norris Chan
// norrischan@my.smccd.edu
// CIS 254 OL
// loops
// File Description
// Lab #3 redo using for loops
// Date 10/9/16
import javax.swing.JOptionPane;
public class Loops
{
   public static void main(String[] args){
       System.out.println("programmed by norris chan");
       
       //declare variables for the total of odd and even number, and the even and odd numbers
       int oddTotal = 0;
       long evenTotal = 1;

       //tests to see if oddnum is less than 50
       for( int i = 1; i <= 50; i++){
           //tests to see of oddnum is odd
           if ( i%2 != 0 ){
               oddTotal += i;
            }
        }
        //tests to see if evennum is less than 25
       for (int j = 1; j <=25; j++){
           //test to see if evenNum is even
           if ( j%2 == 0 ){
               evenTotal *= j;
            }
           
        }
        
        // prints the oddTotal and the evenTotal
        System.out.println("the sum of the odd number is " + oddTotal + "\nthe product of the even numbers is " + evenTotal);
        
        JOptionPane.showMessageDialog(null,"programmed by norris chan \nthe sum of the odd numbers is " + oddTotal + "\nthe product of the even numbers is " + evenTotal);
    }
}

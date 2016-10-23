// Norris Chan
// norrischan@my.smccd.edu
// CIS 254 OL
// digits
// prints individual characters of a string
// Assignment #1
// 9/6/16
import java.util.*;
public class Digits
{ 
    public static void main(String [] args){
        System.out.println("Program by Norris Chan");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4 digit number : ");
        int number = input.nextInt();
        System.out.println("The individual digits are ");
        int digit1 = number/1000;
        int digit2 = (number - (digit1*1000))/100;
        int digit3 = (number - ((digit1 * 1000) + (digit2 * 100))) / 10;
        int digit4 = (number - (((digit1*1000) + (digit2*100) + (digit3*10))));
        System.out.println( digit1 + "  " + digit2 + "  " + digit3 + "  " + digit4);
    }
}

// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// pyramid printer
// File Description
// Assignment #4
// 10/14/16
public class InterestCalculator
{
   public static void main(String[] args){
       System.out.println("programmed by norris chan");
       
       //amount of deposit at end of each year
       double amount;
       //initial amount before interest
       double principle = 1000.0;
       //interest rate
       double rate = 0.05;
       
       //display headers
       System.out.printf("%s%20s%10s%n","year", "Amount on deposit", "rate");
       
       //calculate amount on deposit for each of ten years
       for (int year = 1; year <= 10; year++){
              
           for( double interestRate = 0.05; interestRate <= 0.1; interestRate += 0.01){
               
               //calculates the amount
               amount = (Math.pow(interestRate + 1.0, year)) * principle ;
               
               
               System.out.printf("%4d%,20.2f%10.2f%n", year, amount, interestRate);
               
            }
           
        }
    }
}

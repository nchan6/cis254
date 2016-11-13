// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// prime generator
// File Description
// Assignment #6
// 11/13
public class PrimeGenerator
{
   public static void main(String[] args){
       System.out.println("programmed by norris chan");
       
       //creates an array for the first 200 prime numbers
       int[][]primes = new int[20][10];
       
       //starts the count for the numbers being tested
       int count = 2;
       
       //defines each element in the array and prints out
       for(int row = 0; row < primes.length; row++){
           for(int col = 0; col < primes[row].length; col++){
               if (isPrime(count) == true){
                   primes[row][col] = count;
                   
                   //output
                   System.out.printf("%8d",primes[row][col]);
                }
               
               //count continues to increase until all the arrays are filled
               count++;
            }
           System.out.println();
        }

    }
    
    //tests the numbers to see if they're prime
   public static boolean isPrime(int num){
       for ( int count = 2; count < num; count++){
           if (num%count == 0){
               return false;
            }
        }
        return true;
    }
}



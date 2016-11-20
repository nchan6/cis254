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
       int[]primes = new int[200];
       int element = 0;
       
       System.out.println("the first 200 prime numbers");
       
       //defines each element in the array and prints out
       for(int count = 2; count <= 1223; count++){
           
           //tests to see if the number is prime
           if (isPrime(count)){
               primes[element] = count;
               element++;
           }

       }
       
       //prints out 20 rows , each row has 10 prime numbers
       for (int row = 0; row < 20; row++){
           for (int col = 0; col < 10; col++){
               System.out.printf("%8d", primes[(row*10) + col]);
            }
           System.out.println();
        }
   }
    
   //tests the numbers to see if they're prime
   public static boolean isPrime(int num){
       boolean prime = true;
       for ( int count = 2; count < num; count++){
           if (num%count == 0){
               prime = false;
           }
       }
       return prime;
    }
}



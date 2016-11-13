// Norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// rainfall
// File Description
// Lab #6
// 11/3/16

import java.util.*;
public class Rainfall
{
    public static void main(String[] args){
       System.out.println("programmed by norris chan");
       
       Scanner input = new Scanner(System.in);
       
       //prompts user for city's name and year
       System.out.print("\ncity name : ");
       String city = input.nextLine();
       
       System.out.print("\nyear : ");
       int year = input.nextInt();
       
       //declaring the array rainfall
       double[] rainfall = new double[12];
       
       //creating an array of strings named month
       String[] month = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
       
       System.out.printf("\n%s %d Rainfall (in inches)\n",city, year);
       
       //storing rainfall each month and name of month
       for (int count = 0; count < 12; count++){
           
           //forces user to enter only numbers greater than or equal to zero
           do{
               System.out.print(month[count] + " rainfall : ");
               rainfall[count] = input.nextDouble();
            }while(rainfall[count] < 0);
           
        }
       
       double average = findAverageRainfall(rainfall);
       
       //determines the amount of months had a value less than or equal, and greater to the average
       int lessOrEqual = 0;
       int greater = 0;
       for (int count = 0; count < 12; count++){
           if ( rainfall[count] <= average){
               lessOrEqual ++;
            } else if ( rainfall[count] > average ){
                greater++;
            }
        }
        
       //final output
       System.out.printf("\n\nAverage rainfall for %s in %d: %.2f inches%n", city, year, average);
       // prints out the rainfall for each month
       for (int output = 0; output < 12; output++){
           System.out.printf("%9s%20.2f%n",month[output], rainfall[output]);
        }
       System.out.printf("%n%d months had rainfall below or equal to the average", lessOrEqual);
       System.out.printf("%n%d months ahd rainfall above average", greater);
       
    }
    
    //computes and returns the average rainfall 
    public static double findAverageRainfall(double[] array){
        double total = 0;
        
        for (int count = 0; count < 12; count++){
            total += array[count];
        }
        
        return (double)total/12;
        
    }
}

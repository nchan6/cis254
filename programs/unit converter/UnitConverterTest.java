// Norris Chan
// norrischan@my.smccd.edu
// CIS 254 OL
// unit converter test
// File/Class Description
// Assignment # 5
// 10/30/16

import java.util.*;

public class UnitConverterTest
{   
    public static void main(String[] args){
        System.out.println("programmed by norris chan");
        
        //make the methods in the UnitConverter class accessable
        UnitConverter convert = new UnitConverter();
        
        Scanner input = new Scanner(System.in);
        
        //instance variables
        double miles;
        double kilometers;
        double pounds;
        double kilograms;
        int menuOption;

        //promts user to select a conversion method
        do{
           System.out.println("\nWelcome to the Unit Converter.");
           System.out.println("1: convert miles to kilometers");
           System.out.println("2: convert kilometers to miles");
           System.out.println("3: convert pounds to kilograms");
           System.out.println("4: convert kilograms to pounds");
           System.out.println("5: quit the program");
           System.out.print("\nmenu choice : ");
           menuOption = input.nextInt();  
           
           //calls on the conversion method based on the menuOption input
           switch(menuOption){
               case 1:
               
               //calls getInput to ask user for the number to convert
                    miles = getInput("miles");
                    
               //calls method in UnitConverter class and converts number
                    kilometers = convert.milesToKilometers(miles);
                    System.out.printf("%.1f miles is %.1f kilometers\n", miles, kilometers);
                    break;
               case 2:
               
               //calls getInput to ask user for the number to convert
                    kilometers = getInput("kilometers");
                    
               //calls method in UnitConverter class and converts number
                    miles = convert.kilometersToMiles(kilometers);
                    System.out.printf("%.1f kilometers is %.1f miles\n", kilometers, miles);
                    break;
               case 3:
               
               //calls getInput to ask user for the number to convert
                    pounds = getInput("pounds");
               
               //calls method in UnitConverter class and converts number
                    kilograms = convert.poundsToKilograms(pounds);
                    System.out.printf("%.1f pounds is %.1f kilograms\n", pounds, kilograms);
                    break;
               case 4:
               
               //calls getInput to ask user for the number to convert
                    kilograms = getInput("kilograms");
                
               //calls method in UnitConverter class and converts number     
                    pounds = convert.kilogramsToPounds(kilograms);
                    System.out.printf("%.1f kilograms is %.1f pounds\n", kilograms, pounds);
                    break;
               case 5:  
               //stops the program
            }
        } while (menuOption != 5);
        System.out.println();
    }
    public static double getInput(String type){
         Scanner input = new Scanner(System.in);
         double num;
         
         //forces the user to input a positive number
         do{
             System.out.printf("\nenter %s : ",type);
             num = input.nextDouble();
         } while ( num <= 0 );
         
         return num;
    }
}

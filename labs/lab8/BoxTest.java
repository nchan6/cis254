// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// box test
// File Description
// Lab #8
// 12/3

import java.util.*;

public class BoxTest
{
    public static void main(String[] args){
        System.out.println("programmed by norris chan");
        
        Scanner input = new Scanner(System.in);
        
        //prompts user for length, width, and height for the first box
        System.out.print("enter length = ");
        double length = input.nextDouble();
        System.out.print("\nenter width = ");
        double width = input.nextDouble();
        System.out.print("\nenter height = ");
        double height = input.nextDouble();
       
        System.out.println();
        
        //array of box objects
        Box[] box = new Box[5];
        box[0] = new Box(length,width,height);
        /*
        prograom will not compile if box[1] = new Box() so i gave it values that are equal to 0. 
        this would make the program use the default numbers in the Box class.
        doing this is similar to having no constructor because the default values would be used
        */
        box[1] = new Box(0,0,0);
        box[2] = new Box(2, 2, 2);
        box[3] = new Box(3.5, 3.5, 3.5);
        box[4] = new Box(5.75, 5.75,5.75);
        
        double len = 0;
        double wid = 0;
        double hei = 0;
        double area = 0;
        double volume = 0;
        String toString = "";
        int count = 1;
        
        //prints out the length, width, height, volume, area, and to string for each box
        for (Box element: box){
            System.out.println("\nbox " + count);
            
            len = element.getLength();
            System.out.println("Length = " + len);
            
            wid = element.getWidth();
            System.out.println("width = " + wid);
            
            hei = element.getHeight();
            System.out.println("height = " + hei);
            
            toString = element.toString();
            System.out.println(toString);
            
            area = element.calculateArea();
            System.out.printf("area = %.2f",area);
            
            volume = element.calculateVolume();
            System.out.printf("%nvolume = %.2f%n",volume);
            
            //indicator for each box
            count++;
            
        }
        
        
    }
}

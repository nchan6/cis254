// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// area calculator
// File Description
// Lab #5
// 10/22/016
import java.util.*;
public class AreaCalculator
{
    public static void main(String[] args){
        System.out.println("programmed by norris chan");
        
        Scanner input = new Scanner(System.in);
        double radius;
        double length;
        double width;
        
        
        //forces the user to input a radius greater than 0
        do{
            //prompts user for a radius
            System.out.print("enter a radius : ");
            radius = input.nextDouble();
        } while (radius < 0);
       
        //passes the variable radius to the method to calculate the area of the circle
        double areaOfCircle = findArea(radius);
        
        //print out the area of the circle
        System.out.printf("\nthe area of the circle is %.1f",areaOfCircle);
        
        //forces the user to input a length greater than 0
        do{
            //prompts user for a length
            System.out.print("\nenter a length : ");
            length = input.nextDouble();
        } while ( length < 0);
        
        //forces the user to input a width greater than 0
        do{
            //promptsd user for a width
            System.out.print("\nenter a width : ");
            width = input.nextDouble();
        } while ( width < 0);
        
        //passes the variables length and width to this method to calculate the area of the rectangle
        double areaOfRectangle = findArea(width, length);
        
        //print out the area of the rectangle
        System.out.printf("the area of the rectangle is %.1f", areaOfRectangle);
    }
    
    //calculates the area of a circle
    public static double findArea( double radius){
        //calculates the area using pi*r^2
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    //calculates the area of a rectangle
    public static double findArea( double width, double length){
        //uses the formula length * width
        double area = width * length;
        return area;
        
    }
}

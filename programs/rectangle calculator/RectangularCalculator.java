//norris chan 10/11/16
import java.util.*;
public class RectangularCalculator
{
   public static void main(String[] args){
       System.out.println("programmed by norris chan");
       Scanner input = new Scanner(System.in);
       int another;
       
       do {
           //promt user for rectangle length
           System.out.print("Enter rectangle length: ");
           int length = input.nextInt();
           
           //prompt user for width length
           System.out.print("\nEnter rectangle width: ");
           int width = input.nextInt();
           
           //calculate the area
           int area = length*width;
           
           //calcualte the perimeter
           int perimeter = (length * 2) + (width * 2);
           
           //print out each variable
           System.out.printf("\nRectangle length: %d\t width: %d\t area: %d\t perimeter: %d%n", length, width, area, perimeter);
       
           //this executes when the length and width are the same
           if (length == width){
               System.out.println("This is a square");
            }
            
           System.out.println("Do you want to enter another rectangle? (Enter 1 for yes, 2 for no)");
           another = input.nextInt();
        } while (another == 1); 
    }
}

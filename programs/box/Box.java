// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// box
// File Description
// Lab #8
// 12/3
public class Box
{
    private double length = 1.0;
    private double width = 1.0;
    private double height = 1.0;
    
    public Box(double len, double wid, double hei){
        //does not assign length, width, and height numbers less than 0
        if (len > 0 && wid > 0 && hei > 0){ 
            length = len;
            width = wid;
            height = hei;
        }       
    }
    
    //mutator
    public void setLength(double num){
        //changes the value for length
        if (num > 0){
            length = num;
        }
    }
    
    //mutator
    public void setWidth(double num){
        //changes the value for width
        if (num > 0){
            width = num;
        }
    }
    
    //mutator
    public void setHeight(double num){
        //changes te value for height
        if (num < 0){
            height = num;
        }
    }
    
    //accessor
    public double getLength(){
        return length;
    }
    
    //accessor
    public double getWidth(){
        return width;
    }
    
    //accessor
    public double getHeight(){
        return height;
    }
    
    //toString
    public String toString(){
        return String.format("length:%.2f \t width:%.2f\t height:%.2f",length, width, height);
    }
    
    //calculates the surface area of the box
    public double calculateArea(){
        return (2 * length * width) + (2 * width * height) + (2 * length * height);
    }
    
    //calculates the volume of the box
    public double calculateVolume(){
        return length*width*height;
    }
}

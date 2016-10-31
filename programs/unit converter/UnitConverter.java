// Norris Chan
// norrischan@my.smccd.edu
// CIS 254 OL
// unit converter
// File/Class Description
// Assignment # 5
// 10/30/16
public class UnitConverter
{
    public static void main(Stringp[] args){
        
    }
    
    //converts miles to kilometers and returns converted value
    public static double milesToKilometers(double number){
        double convert = number * 1.609;
        return convert;
    }
    
    //converts kilometers to miles and returns converted value
    public static double kilometersToMiles(double number){
        double convert = number * 0.6214;
        return convert;
    }
    
    // converts pounds to kilograms and returns converted value
    public static double poundsToKilograms(double number){
        double convert = number * 0.4536;
        return convert;
    }
    
    //converts kilograms to pounds and returns converted value
    public static double kilogramsToPounds(double number){
        double convert = number * 2.2046;
        return convert;
    }
}

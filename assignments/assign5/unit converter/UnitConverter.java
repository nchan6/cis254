// Norris Chan
// norrischan@my.smccd.edu
// CIS 254 OL
// unit converter
// File/Class Description
// Assignment # 5
// 10/30/16
public class UnitConverter
{    
    //converts miles to kilometers and returns converted value
    public static double milesToKilometers(double miles){
        double convertedUnit = miles * 1.609;
        return convertedUnit;
    }
    
    //converts kilometers to miles and returns converted value
    public static double kilometersToMiles(double kilometers){
        double convertedUnit = kilometers * 0.6214;
        return convertedUnit;
    }
    
    // converts pounds to kilograms and returns converted value
    public static double poundsToKilograms(double pounds){
        double convertedUnit = pounds * 0.4536;
        return convertedUnit;
    }
    
    //converts kilograms to pounds and returns converted value
    public static double kilogramsToPounds(double kilograms){
        double convertedUnit = kilograms * 2.2046;
        return convertedUnit;
    }
}

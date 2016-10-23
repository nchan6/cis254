// Norris Chan   
// norrischan@my.smccd.edu
// CIS 254 OL
// bicycletest
// File Description
// Lab # 2
// 9/9/16
public class BicycleTest {

    public static void main( String[] args )  {
		System.out.println(“programmed by Norris Chan”);

		// Create 1 Bicycle reference variable. For example: myBike
		
	    Bicycle MyRide;
	    
		// Create 1 String reference variable for the owner's name
		
		String ownerName;
		
		// Create 1 integer variable for license number
		
		int licenseNumber;

		// Assign your full name and a license number to the String and
		// integer variables
		
		ownerName = "James Burrito";
		licenseNumber = 123456;

		// Create a Bicycle object with the Bicycle class constructor
		// Use the variables you created as arguments to the constructor
		
		MyRide = new Bicycle( ownerName, licenseNumber); 
		
		// Output the owner's name and license number in printf statements
		// using the object reference and the get methods.
		// For example: bike.getOwnerName()
		
		System.out.printf("The owner's name of the MyRide is %s\nThe license number is %s\n", MyRide.getOwnerName(), MyRide.getLicenseNumber());

		// Change the owner's name to Kenny McCormick using setOwnerName
		
		MyRide.setOwnerName("Kenny McCormick");

		// Output the owner's name and license number in printf statements
		// using the Bicycle object reference variable and the get methods.
		
		System.out.printf("The owner's name of MyRide is %s ",MyRide.getOwnerName());

    }
} 
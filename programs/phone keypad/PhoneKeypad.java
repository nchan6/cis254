// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// phone keypad
// Program Description
// Assignment #7
// 11/26/16

import java.util.*; 

public class PhoneKeypad
{
    public static void main(String[] args){
        System.out.println("programmed by norris chan");
        
        Scanner input = new Scanner(System.in);
        String phone = "";
        String areaCode = "";
        
        //while loop contuines to run when the user inputs a phone number
        do{
            System.out.println("enter a phone number or type quit to exit");
            phone = input.nextLine();
            
            //finds the area code with hyphen
            if (phone.length() == 13){
                areaCode = phone.substring(0,6);
                
                //finds the area code without the hyphen
            } else if (phone.length() == 11){
                
                //changes the format of the area code
                areaCode = "1-" + phone.substring(1,4);
            }
            
               
            //length of string including hyphens
            if (phone.length() == 13){
                areaCode = phone.substring(0,6);
                
                //output
                System.out.print(areaCode);
                for(int count = 6; count < phone.length(); count++){
                    System.out.print(converter(phone.charAt(count)));
                }
                System.out.println("\n");
                
                //length of string without hyphens
            } else if (phone.length() == 11){
                //changes the format of the area code
                areaCode = "1-" + phone.substring(1,4);
                
                //output
                System.out.print(areaCode + "-");
                for(int count = 4; count < phone.length(); count++){
                    System.out.print(converter(phone.charAt(count)));
                }
                System.out.println("\n");
            } else{
                System.out.println("invalid phone number\n");
            }
                
            
            
        }while(!(phone.equals("quit")||phone.equals("Quit")));
        
    }
    
    public static int converter(char letter){
        
         //allows user to use any size letters
         char[] letters = {'A','a','B','b','C','c','D','d','E','e','F','f','G','g','H','h','I',
             'i','J','j','K','k','L','l','M','m','N','n','O','o','P','p','Q','q','R','r','S','s',
             'T','t','U','u','V','v','W','w','X','x','Y','y','Z','z'};
         int[] num = {2,2,2,2,2,2, 3,3,3,3,3,3, 4,4,4,4,4,4, 5,5,5,5,5,5, 6,6,6,6,6,6,
             7,7,7,7,7,7,7,7, 8,8,8,8,8,8, 9,9,9,9,9,9,9,9,};
             
         //idex of the letter
         int index = 0;
         
         //finds the index of the letter
         for(int count = 0; count < letters.length; count++){
             if (letters[count] == letter){
                 index = count;
             }
         }
         
         return num[index];

        
    }
}
// Norris Chan   
// norrischan@my.smccd.edu
// CIS 254 OL
// gradebook
// File Description
// assignment # 2
// 9/18/16
import java.util.*;
public class GradeBookTest
{
    public static void main(String[] args){
        System.out.println("programmed by Norris Chan");
        
        // grade book references
        GradeBook courseDescription;
        String courseName;
        String instructorName;
        
        Scanner input = new Scanner(System.in);
        
        //user assigns course name and instructor
        System.out.println("Enter course name:");
        courseName = input.nextLine();
        System.out.println();
        System.out.println("Enter instructor's name:");
        instructorName = input.nextLine();
        System.out.println();
        
        //print full description of course
        System.out.println("Welcome to the grade book for \n" + courseName + "\nThis course is presented by " + instructorName);
        
    }
    
}

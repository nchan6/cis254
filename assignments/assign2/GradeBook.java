// Norris Chan   
// norrischan@my.smccd.edu
// CIS 254 OL
// gradebook
// File Description
// assignment # 2
// 9/18/16
public class GradeBook
{
    //ask's user to provide the name of the course and instructor
    private String courseName;
    private String instructorName;
    
    //constructor
    public GradeBook(String course, String instructor){
        courseName = course;
        instructorName = instructor;
    }
    
    // assigns the name of the course
    public void setCourseName(String course){
        courseName = course;
    }
    
    //assigns the name of the instructor
    public void setInstructorName(String instructor){
        instructorName = instructor;
    }
    
    // returns the name of the course    
    public String getCourseName(){
        return courseName;      
    }
    
    // returns the name of the instructor
    public String getInstructorName(){
        return instructorName;
    }
}

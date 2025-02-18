import java.util.ArrayList;

/**
 * This class represents a student in a class.
 * 
 * @author
 * @version 
 */
public class Student
{
    //Student's first name
    private String firstName;
    
    //Student's last name
    private String lastName;
    
    //Student's grades in the class
    private ArrayList<Integer> grades;
    
    /**
     * Construct a new Student object with the input first and last name.
     * Creates the student's grade list, with no grades.
     * 
     * @param firstName The student's first name.
     * @param lastName The student's last name.
     */
    public Student(String firstName, String lastName)
    {
        //YOUR CODE HERE
    }

    /**
     * Returns the student's first name.
     * 
     * @return The student's first name.
     */
    public String getFirstName()
    {
        //YOUR CODE HERE
        return null;
    }
    
    /**
     * Returns the student's last name.
     * 
     * @return The student's last name.
     */
    public String getLastName()
    {
        //YOUR CODE HERE
        return null;
    }
    
    /**
     * Adds the grade to the student's list of grades.
     * 
     * @param grade An integer in [0, 100].  Sorry, no bonus points.
     */
    public void addGrade(Integer grade)
    {
        //YOUR CODE HERE
    }
    
    /**
     * Removes the first occurrence of the grade in the student's list
     * of grades.
     * 
     * @param grade The grade to be removed.
     * @return True if the grade was found and removed and false otherwise.
     */
    public boolean removeGrade(Integer grade)
    {
        //YOUR CODE HERE
        return false;
    }
    
    /**
     * This method removes the student's lowest grade for his or her
     * list of grades.  However, grades of zero are not removed.
     * 
     * @return The grade removed or -1 if no grade was removed.
     */
    public int dropLowestNotZero()
    {
        //YOUR CODE HERE
        return -1;
    }
    
    /**
     * This method returns the average of the student's grades.
     * 
     * @return The average of the student's grades.  If the student
     *         has no grades, -1 is returned.
     */
    public double getAverage()
    {
        //YOUR CODE HERE
        return 0.0;
    }
    
    /**
     * This method returns a description of the student in the format
     * 
     * last name, first name:
     * list of grades separated by spaces
     * 
     * @return A description of the student including name and grade list.
     */
    @Override
    public String toString()
    {
        //YOUR CODE HERE
       return null;
    }
}

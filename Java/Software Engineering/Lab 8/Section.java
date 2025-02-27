import java.util.ArrayList;

/**
 * This class represents one section of a course offered in a department.
 * 
 * @author 
 * @version 
 */
public class Section
{
    //The name of the department in which the course is offered.  E.g., CSIS
    private String department;
    
    //The course number, e.g., 010 or 120
    private String courseNum;
    
    //The section number, e.g., 01 or 12M
    private String sectionNum;
    
    //A list of students in the course.
    private ArrayList<Student> students;

    /**
     * Constructs a section of a course with an empty list of students.
     * 
     * @param department The department in which the course is offered.  E.g., CSIS
     * @param courseNum The course number.  E.g., 010 or 120
     * @param sectionNum The section number.  E.b., 01 or 12M
     */
    public Section(String department, String courseNum, String sectionNum)
    {
        //YOUR CODE HERE
    }

    /**
     * Returns the name of the department in which the course is offered.  E.g., CSIS
     * 
     * @return The name of the deparment in which the course is offered.
     */
    public String getDepartment()
    {
        return department;
    }

    /**
     * Returns the course number.  E.g., 010 or 120
     * 
     * @return The course number.
     */
    public String getCourseNumber()
    {
        return courseNum;
    }

    /**
     * Returns the section number.  E.g., 01 or 12M
     * 
     * @return The section number.
     */
    public String getSectionNumber()
    {
        return sectionNum;
    }

    /**
     * Returns the section name.  E.g., CSIS-120-01
     * 
     * @return The section name.
     */
    public String getSectionName()
    {
        return department + "-" + courseNum + "-" + sectionNum;
    }

    /**
     * Adds a student to the section.  Assume the value of the parameter is not null.
     * 
     * @param student The student to be added to the section.  
     */
    public void addStudent(Student student)
    {
        //YOUR CODE HERE
    }

    /**
     * Returns the student information for the given student name.
     * 
     * @param firstName The first name of the student.
     * @param lastName The last name of the student.
     * @return The student information for the given student name or null
     *         if the studnet is not in this section.
     */
    public Student getStudent(String firstName, String lastName)
    {
        //YOUR CODE HERE
        return null;
    }
        
    /**
     * Removes the input student from the section.
     * 
     * @param student The student to be removed from the section.
     * @return The student that was removed from the section or null if the 
     *         student was not in the section.
     */
    public Student dropStudent(Student student)
    {
        //YOUR CODE HERE
        return null;        
    }

    /**
     * Returns the avereage of each student's average grade in this section.
     * 
     * @return The average of each student's average grade in this section.
     */
    public double getClassAverageGrade()
    {
        //YOUR CODE HERE
        return -1.0;
    }
    
    /**
     * Returns a description of the section in the format
     * 
     * section name
     * student name
     * student grades
     * student name
     * student grades
     * ...
     * 
     * for all students in the section.
     * 
     * @return A description of the section.
     */
    @Override
    public String toString()
    {
        StringBuffer description = new StringBuffer();
        description.append(getSectionName() + "\n");
        
        for(Student student : students)
        {
            description.append(student.toString() + "\n");
        }
        
        return description.toString();
    }
}

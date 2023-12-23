import java.util.ArrayList;

public class Degree {
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, Integer numberOfStudents, ArrayList<Course> coursesOffering) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = coursesOffering;
    }

    public Degree() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void  displayInfo()
    {
        System.out.println("Name of the Degree:" + getName());
        System.out.println("Number of Student:"+ numberOfStudents);
        System.out.println("");
    }

    public void offerCourse(Course course)
    {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course)
    {
        coursesOffering.remove(course);
    }

    public void listCoursesOffering(Course course)
    {
        for (Course offcourse: coursesOffering)
        {
            System.out.println("Degree of "+ getName()  + "offer"+ offcourse.getName());    //Truble here
        }
    }


}

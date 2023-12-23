import java.util.ArrayList;

public class Lecturer extends Person {

    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department, ArrayList<Course> coursesTeaching) {
        super();
        this.position = position;
        this.department = department;
        this.coursesTeaching = coursesTeaching;
    }

    public Lecturer() {

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name of the Lecturer" + getName());
        System.out.println("Position of the Lecturer" + getPosition());
        System.out.println("Department of the Lecturer" + getDepartment().getName() );
        System.out.println("Course that him/her teach:");
        for (Course course: coursesTeaching)
        {
            System.out.println(course.getName() );
        }

    }

    public void displayDepartmentInfo()
    {
        System.out.println("Name of the Department:"+ getDepartment().getName());
    }

    public void  addCourse(Course course)
    {
         coursesTeaching.add(course);
    }
    public void removeCourse(Course course)
    {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching()
    {

    }


}
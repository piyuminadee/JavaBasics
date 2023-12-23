import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course>  coursesEnrolled;

    public Student() {

    }

    public <E> Student(String muthuu, String s, String s1, Degree d1, ArrayList<E> es) {

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Student(String studentID, String year, Degree degree, ArrayList<Course> coursesEnrolled) {
        super();
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = coursesEnrolled;
    }


    public void displayInfo()
    {
        System.out.println("Stiudent ID number"+ getStudentID());
        System.out.println("Current Year:"+ getYear());
        System.out.println("Name of the Degree:"+degree.getClass());


    }
}

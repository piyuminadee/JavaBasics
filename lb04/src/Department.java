import java.util.ArrayList;

public class Department {
  private String name;
  private Lecturer departmentHead;
  private ArrayList<Course> coursesOffering;
  private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name, Lecturer departmentHead, ArrayList<Course> coursesOffering, ArrayList<Lecturer> lecturersBelongsTo) {
        this.name = name;
        this.departmentHead = departmentHead;
        this.coursesOffering = coursesOffering;
        this.lecturersBelongsTo = lecturersBelongsTo;
    }

    public Department() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getDepartmentHead() {
        return departmentHead;
    }

    public void displayInfo()
    {
        System.out.println("Department Information:");
        System.out.println("Department name:"+getName());
        System.out.println("Nmae of Department Head:"+this.departmentHead);
        System.out.println("Offered Courses in that Department:");
        for (Course course: coursesOffering)
        {
            System.out.println(course.getName());
        }
        System.out.println("Lecturers that are Belongs to Department:");
        for (Lecturer lecturer : lecturersBelongsTo)
        {
            System.out.println(" "+lecturer.getName());
        }



    }

    public void appointDepartmentHead(Lecturer departmentHed)
    {
        this.departmentHead = departmentHed;
    }

    public void displayDepartmentHeadInfo()
    {
        System.out.println("Department Head Information:");
        System.out.println("Nsme of Department Head:"+ departmentHead.getName());
        System.out.println("Position:" + departmentHead.getPosition());
    }

    public void offerCourse(Course course)
    {
         coursesOffering.add(course);
    }

    public void  withdrawCourse(Course course)
    {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer)
    {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer)
    {
       lecturersBelongsTo.remove(lecturer);
    }


}
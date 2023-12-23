import java.util.ArrayList;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department dept1 = new Department("Department of Software Engineering", null, new ArrayList<>(), new ArrayList<>());
        Department dept2 = new Department("Department of Computer Systems Engineering", null, new ArrayList<>(), new ArrayList<>());

        Degree d1 = new Degree("Computer Science", 45, new ArrayList<>());
        Degree d2 = new Degree("Physical Science", 45,new ArrayList<>());

        Lecturer l1 = new Lecturer("Nawodi ", "Lecturer" , dept1, new ArrayList<>());

        Course c1 = new Course("Physics", "Enrolled", 130, null, d1);

        Student s1 = new Student("Muthuu", "CS/2020/024", "2nd year", d1, new ArrayList<>());

        Lecturer headofDept = new Lecturer();


        Student st01 = new Student();
         Student st02 = new Student();

         dept2.appointDepartmentHead(l1);
         dept2.displayDepartmentHeadInfo();
         d1.offerCourse(c1);
         st01.displayInfo();

         dept2.addLecturer(l1);



    }
}

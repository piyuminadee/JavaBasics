public class Course {
    private String name;
    private String enrollType;
    private Integer numberofStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, Integer numberofStudentsEnrolled, Lecturer lecturerInCharge, Degree degreeBelongsTo) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberofStudentsEnrolled = numberofStudentsEnrolled;
        this.lecturerInCharge = lecturerInCharge;
        this.degreeBelongsTo = degreeBelongsTo;
    }

    public Course() {

    }

    //Implement the displayInfo() method to display Course information.
    public void displayInfo()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public Integer getNumberofStudentsEnrolled() {
        return numberofStudentsEnrolled;
    }

    public void setNumberofStudentsEnrolled(Integer numberofStudentsEnrolled) {
        this.numberofStudentsEnrolled = numberofStudentsEnrolled;
    }


    public void addLecturerInCharge(Lecturer lecturer)
    {
        this.lecturerInCharge = lecturer;
    }

     public void removeLecturerInCharge()
     {
         this.lecturerInCharge = null;
     }

     public void addDegreeBelongsTo(Degree degree)
     {
         this.degreeBelongsTo = degree;
     }

     public void removeDegreeBelongsTo()
     {
         this.degreeBelongsTo = null;
     }

}

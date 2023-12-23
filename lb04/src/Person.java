abstract class Person{
    private String name;

    //Include an abstract method displayInfo().
    public abstract void displayInfo();

    //Implement getter and setter methods for the name variable.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Provide a constructor that initializes the name variable
    public Person() {
        this.name = name;
    }
}
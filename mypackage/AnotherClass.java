package mypackage;

public class AnotherClass {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        myObject.packagePrivtVriable = 42;
        System.out.println("vale: "+ myObject.packagePrivtVriable);
        myObject.PackagePrivtMethod();
    }
}

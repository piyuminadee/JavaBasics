package mypackage;

import mypackage.MyClass;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyClass myObject = new MyClass();


        myObject.packagePrivtVriable = 42;
        System.out.println("value: " + myObject.packagePrivtVriable);

        myObject.PackagePrivtMethod();
    }

}
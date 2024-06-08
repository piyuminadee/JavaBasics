package org.example;

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A obj2 = new A()
        {
            @Override
            public void show() {
                System.out.println("In new obj");
            }
        };
        obj2.show();
    }
}
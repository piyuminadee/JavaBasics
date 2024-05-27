package com.demo2;

public class Person {

    private String name="person";
    private int age=12;

    public void show(){
        System.out.println(getName()+" : "+getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.demo2;

public class Human {

    private String name;
    private int age;

    public void show(){
        System.out.println(name+ " is "+ age + " years old. ");
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

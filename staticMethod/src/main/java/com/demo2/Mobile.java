package com.demo2;

public class Mobile {
    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public static String name;
    public String brand;
    public int price;

   public static void show1(){
       Mobile.name="Smart phone";
   }

    public Mobile() {

    }

    public void show(){
        System.out.println(price + brand);
    }
}

package dev.nadeesh;

public class Main {
    public static void main(String[] args) {
        //boxing - taking primitive value and store it in primitive object
        int num1 = 0;
         Integer num = num1;

         //unboxing - getting primitive object and convert it to primitive value
       int number2 = num;

       //parseInt : convert string valu to integer value
        String number3 = "45";
        int number4 = Integer.parseInt(number3);
        System.out.println(number4);
    }
}
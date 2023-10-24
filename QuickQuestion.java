import java.util.Scanner;

/*
Write a Java program that accepts marks as input and prints the
corresponding grade according to the chart below, using if
statements.
○ 80 - 100 : A
○ 70 - 80 : B
○ 60 - 70 : C
○ 50 - 60 : D
○ 40 - 50 : E
○ 00 - 40 : F
 */

public class QuickQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter test score");
        int marks = scanner.nextInt();
        char grade;
        if (marks>=80)
        {
            grade = 'A';//System.out.println("Grade A");
        } else if (marks>70) {
            grade = 'B';//System.out.println("Grade B");

        } else if (marks>60) {
            grade = 'C';//System.out.println("Grade C");

        } else if (marks>50) {
            grade = 'D';//System.out.println("Grade D");

        } else if (marks>40) {
            grade = 'E';//System.out.println("Grade E");

        }else {
           grade = 'F'; //System.out.printf("Grade F");
        }
        System.out.println("Grade: "+ grade);
    }
}

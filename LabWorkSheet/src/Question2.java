import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = scanner.next( );
        System.out.print("Enter your middle name: ");

        middleName = scanner.next( );
        System.out.print("Enter your last name: ");

        lastName = scanner.next( );

        System.out.print(lastName + ", " + firstName +" "+ middleName.substring(0,1));



    }

}

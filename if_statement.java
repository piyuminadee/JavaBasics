import java.util.Scanner;
public class if_statement {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter test score: ");
        int testScore = scanner.nextInt();
        if (testScore<70)
        {
            System.out.println("You did not pass");
        } else
        {
            System.out.println("You did pass");
        }
    }

}

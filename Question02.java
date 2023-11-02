import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value = scanner.nextInt();

        int di, count = 0;
        di = 1;

        for (int i = 0; di > 0; i++) {
            if (value > 0) {
                count++;
                di = value / 10;
                value = di;
                System.out.println(value);

            } else {
                System.out.printf("Stop running");
            }

        }
        System.out.println(count);
    }
}

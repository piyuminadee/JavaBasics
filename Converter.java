import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        int centimeeter;
        float feet;
        double inches;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Centemeters: ");
        centimeeter = scanner.nextInt();

        feet = centimeeter/ 30;

        inches = centimeeter % 2.54;
        System.out.println("feet = " +feet+ "inces = "+inches);


    }
}

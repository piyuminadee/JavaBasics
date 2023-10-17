import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.print("Enter the word: ");
        word = scanner.next();

        System.out.println("The size of " + "the String is " + word.length());

        int middleWord = (word.length()+1)/2;
        System.out.print(word.substring(middleWord-1, middleWord));







    }
}
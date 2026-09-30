import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        int birthMonth = 0;

        System.out.print("What is your birth month?: ");
        birthMonth = userInput.nextInt();

        if (birthMonth <= 12 && birthMonth >= 1) {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
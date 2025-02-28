package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.print("Enter an number: ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter an number:");
            double number2 = scanner.nextDouble();

            System.out.println(number1 + number2);

            System.out.print("Do you want to run it again? - Enter false for NO or true for YES:");
            again = scanner.nextBoolean();

        }while(again);
    }
}

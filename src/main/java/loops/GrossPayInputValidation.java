package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 15;
        double maxHours = 40;

        System.out.println("How many yours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();


        while(hoursWorked > maxHours){
            System.out.println("Invalid number of hours! Enter again:");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println(grossPay);
    }
}

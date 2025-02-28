package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of itens:");
        Scanner scanner = new Scanner(System.in);
        int numberItems = scanner.nextInt();

        double total = 0; // counter

        for(int i = 0 ; i < numberItems ; i++){
            System.out.println("Enter the price:");
            double price = scanner.nextDouble();
            total += price;

        }

        scanner.close();
        System.out.println("The total is $" + total);
    }
}

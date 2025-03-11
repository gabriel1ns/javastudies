package methods;


import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 2500;
    static int requiredCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    private static void notifyUser(boolean qualified) {
        if (qualified){
            System.out.println("You are qualified for credit!");
        } else {
            System.out.println("You are not qualified for credit!");
        }
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if(salary >= requiredSalary && creditScore >= requiredCreditScore){
            return true;
        }
        else return false;
    }

    public static double getSalary(){
        System.out.println("Enter your Salary: ");
        double salary = scanner.nextDouble();
        return salary;

    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
}

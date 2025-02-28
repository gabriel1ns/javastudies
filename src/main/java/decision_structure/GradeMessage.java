package decision_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        System.out.println("Enter a letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        //switch method

        switch (grade){
            case "A":
                message = "Excelent Job!";
                break;

            case "B":
                message = "Good Job!";
                break;

            case "C":
                message = "You passed!";
                break;

            case "D":
                message = "Try harder!";
                break;

            case "F":
                message  = "You Failed";
                break;

            default:
                message = "Invalid Grade";
                break;
        }
        System.out.println(message);
    }
}

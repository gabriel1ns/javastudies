package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {

    public static void main(String[] args) {
        System.out.println("Enter a letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade){
            case "A" -> "Excellent Job!";
            case "B" -> "Good Job!";
            case "C" -> {
                yield "You passed!";
            }
            case "D" -> "Try harder!";
            case "F" -> "You Failed";
            default -> "Invalid Grade!";

        };

        System.out.println(message);
    }
}

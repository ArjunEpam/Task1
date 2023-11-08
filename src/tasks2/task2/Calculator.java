package tasks2.task2;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double num2 = Double.parseDouble(args[2]);
        double result = 0;

        switch (operator) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            case "remainder":
                result = num1 % num2;
                break;
            case "percentage":
                result = (num1 / num2) * 100;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}

package tasks2.task3;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter the increment value: ");
        int increment = scanner.nextInt();

        scanner.close();

        int currentNumber = 0;

        for (int row = 0; row < n; row++) {
            int col = 0;
            for (int i = 0; i <= row; i++) {
                System.out.print(currentNumber + "\t");
                currentNumber += increment;
            }

            System.out.println();
        }
    }
}

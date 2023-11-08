package tasks2.task3;

import java.util.Scanner;

public class PyramidPatternDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter the increment value: ");
        int increment = scanner.nextInt();

        scanner.close();

        int currentNumber = 0;
        int row = 0;

        do {
            int col = 0;

            do {
                if (col > 0) {
                    System.out.print("\t");
                }

                System.out.print(currentNumber);

                currentNumber += increment;
                col++;
            } while (col <= row);

            System.out.println();
            row++;
        } while (row < n);
    }
}

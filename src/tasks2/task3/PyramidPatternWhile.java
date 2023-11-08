package tasks2.task3;

import java.util.Scanner;

public class PyramidPatternWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter the starting number: ");
        int currentNumber = scanner.nextInt();
        scanner.close();
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col <= row) {
                System.out.print(currentNumber + "\t");
                currentNumber++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}

package tasks2.task4;

public class FindLargestSmallest {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 10, 1, 6, 3, 5, 8, 4};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}

package tasks4Java8.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondLargestWithoutLambda {
    public static int findSecondLargest(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return -1;
        }

        Collections.sort(numbers, Collections.reverseOrder());

        int largest = numbers.get(0);
        int secondLargest = numbers.get(1);

        for (int i = 2; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num < largest) {
                secondLargest = num;
                break;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
        numbers.add(7);

        int secondLargest = findSecondLargest(numbers);
        int secondLargestLambda = findSecondLargestWithLambda(numbers);

        System.out.println("Second Largest (Without Lambda): " + secondLargest);
        System.out.println("Second Largest (Without Lambda): " + secondLargestLambda);
    }

    public static int findSecondLargestWithLambda(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return -1;
        }

        Optional<Integer> secondLargest = numbers.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst();

        return secondLargest.orElse(-1);
    }


}

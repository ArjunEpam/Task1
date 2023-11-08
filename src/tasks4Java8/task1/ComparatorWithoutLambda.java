package tasks4Java8.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithoutLambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
        numbers.add(7);

        Collections.sort(numbers, new ReverseComparator());

        System.out.println("Sorted List (Without Lambda): " + numbers);
        withLambda();
    }

    public static void withLambda() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
        numbers.add(7);

        Collections.sort(numbers, (a, b) -> b.compareTo(a));

        System.out.println("Sorted List (With Lambda): " + numbers);
    }

    static class ReverseComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return b.compareTo(a);
        }
    }


}


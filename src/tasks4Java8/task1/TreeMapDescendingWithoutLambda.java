package tasks4Java8.task1;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDescendingWithoutLambda {
    public static void main(String[] args) {
        Map<Integer, String> values = new TreeMap<>(Collections.reverseOrder());
        values.put(1, "One");
        values.put(2, "Two");
        values.put(3, "Three");

        System.out.println("Values (Descending - Without Lambda):");
        for (Map.Entry<Integer, String> entry : values.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        withLambda();
    }

    public static void withLambda() {
        Map<Integer, String> values = new TreeMap<>((a, b) -> b.compareTo(a));
        values.put(1, "One");
        values.put(2, "Two");
        values.put(3, "Three");

        System.out.println("Values (Descending - With Lambda):");
        for (Map.Entry<Integer, String> entry : values.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

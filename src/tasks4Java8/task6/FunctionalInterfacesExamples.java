package tasks4Java8.task6;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class FunctionalInterfacesExamples {
    public static void main(String[] args) {
        IntPredicate isPrime = n -> {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
        };

        IntConsumer printSquare = n -> System.out.println("Square of " + n + " is " + (n * n));

        IntSupplier randomIntBelow5000 = () -> new Random().nextInt(5000);

        int numToCheck = 17;
        if (isPrime.test(numToCheck)) {
            System.out.println(numToCheck + " is a prime number.");
        } else {
            System.out.println(numToCheck + " is not a prime number.");
        }

        int numberToSquare = 7;
        printSquare.accept(numberToSquare);

        int randomInt = randomIntBelow5000.getAsInt();
        System.out.println("Random integer below 5000: " + randomInt);
    }
}

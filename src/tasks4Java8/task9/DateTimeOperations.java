package tasks4Java8.task9;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTimeOperations {
    public static void main(String[] args) {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        Predicate<LocalDate> isYesterday = date -> date.isEqual(yesterday);

        LocalDate testDate1 = LocalDate.now().minusDays(1);
        LocalDate testDate2 = LocalDate.now();
        System.out.println("Is " + testDate1 + " yesterday? " + isYesterday.test(testDate1)); // Should be true
        System.out.println("Is " + testDate2 + " yesterday? " + isYesterday.test(testDate2)); // Should be false

        Supplier<LocalDate> nextThursdaySupplier = () -> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));

        LocalDate nextThursday = nextThursdaySupplier.get();
        System.out.println("Next Thursday: " + nextThursday);

        Supplier<LocalTime> currentTimeInEST = () -> LocalTime.now(ZoneId.of("America/New_York"));

        LocalTime estTime = currentTimeInEST.get();
        System.out.println("Current time in EST: " + estTime);

        Function<LocalDate, Integer> calculateAge = birthDate -> {
            LocalDate today = LocalDate.now();
            Period age = Period.between(birthDate, today);
            return age.getYears();
        };

        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        int age = calculateAge.apply(birthDate);
        System.out.println("Age: " + age + " years");
    }
}

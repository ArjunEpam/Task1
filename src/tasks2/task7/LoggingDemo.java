package tasks2.task7;

import java.io.IOException;
import java.util.logging.*;

public class LoggingDemo {
    private static final Logger logger = Logger.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {
        setupLogger();

        // Sample data
        int[] outer1 = {1, 2, 4, 6};
        int[] inner1 = {2, 4};

        int[] outer2 = {1, 2, 4, 6};
        int[] inner2 = {2, 3, 4};

        int[] outer3 = {1, 2, 4, 4, 6};
        int[] inner3 = {2, 4};

        try {
            boolean result1 = linearIn(outer1, inner1);
            boolean result2 = linearIn(outer2, inner2);
            boolean result3 = linearIn(outer3, inner3);

            logger.log(Level.INFO, "Result 1: {0}", result1);
            logger.log(Level.INFO, "Result 2: {0}", result2);
            logger.log(Level.INFO, "Result 3: {0}", result3);

            logger.log(Level.WARNING, "This is a warning message.");
            logger.log(Level.SEVERE, "This is a severe error message.");

            FileHandler fileHandler = new FileHandler("app.log");
            logger.addHandler(fileHandler);
            logger.log(Level.INFO, "Log message to file.");

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error occurred: {0}", e.getMessage());
        }
    }

    public static void setupLogger() {
        SimpleFormatter formatter = new SimpleFormatter() {
            private static final String format = "[%1$tF %1$tT] [%2$-7s] %3$s %n";

            @Override
            public synchronized String format(LogRecord lr) {
                return String.format(format, new java.util.Date(lr.getMillis()), lr.getLevel().getLocalizedName(), lr.getMessage());
            }
        };

        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(formatter);
        logger.addHandler(consoleHandler);
        
        logger.setLevel(Level.ALL);
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;

        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] == inner[innerIndex]) {
                innerIndex++;
            }
            outerIndex++;
        }

        return innerIndex == inner.length;
    }
}

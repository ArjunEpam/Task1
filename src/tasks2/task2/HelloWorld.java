package tasks2.task2;

public class HelloWorld {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name);
        } else {
            System.out.println("Please provide in command line arg");
        }
    }
}

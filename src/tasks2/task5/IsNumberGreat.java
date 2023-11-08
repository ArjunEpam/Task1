package tasks2.task5;

public class IsNumberGreat {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;

        boolean result = isNumberGreat(a, b);

        if (result) {
            System.out.println("Either one of the numbers is 6 or their sum/difference is 6.");
        } else {
            System.out.println("Neither of the conditions is met.");
        }
    }

    public static boolean isNumberGreat(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }
}

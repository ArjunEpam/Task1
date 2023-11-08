package tasks2.task5;

public class SumLimit {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int result = sumLimit(a, b);

        System.out.println("The result is: " + result);
    }

    public static int sumLimit(int a, int b) {
        String aStr = String.valueOf(a);
        String sumStr = String.valueOf(a + b);

        if (sumStr.length() == aStr.length()) {
            return a + b;
        } else {
            return a;
        }
    }
}

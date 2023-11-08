package tasks2.task5;

public class ShareDigit {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 23;
        boolean result = shareDigit(num1, num2);
        System.out.println("The result is: " + result);
    }

    public static boolean shareDigit(int a, int b) {
        int aLeft = a / 10;
        int aRight = a % 10;
        int bLeft = b / 10;
        int bRight = b % 10;

        return (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight);
    }
}

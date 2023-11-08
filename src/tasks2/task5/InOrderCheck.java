package tasks2.task5;

public class InOrderCheck {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 4;
        boolean bOk = false;

        boolean result = inOrder(a, b, c, bOk);

        System.out.println("The result is: " + result);
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }
}

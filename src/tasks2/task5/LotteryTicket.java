package tasks2.task5;

public class LotteryTicket {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 5;

        int result = lotteryTicketResult(a, b, c);

        switch (result) {
            case 0:
                System.out.println("The result is 0");
                break;
            case 5:
                System.out.println("The result is 5");
                break;
            case 10:
                System.out.println("The result is 10");
                break;
        }
    }

    public static int lotteryTicketResult(int a, int b, int c) {
        int abSum = a + b;
        int bcSum = b + c;
        int acSum = a + c;

        if (abSum == 10 || bcSum == 10 || acSum == 10) {
            return 10;
        } else if (abSum - bcSum == 10 || abSum - acSum == 10) {
            return 5;
        } else {
            return 0;
        }
    }
}

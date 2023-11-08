package tasks2.task5;

public class SpeedTicket {
    public static void main(String[] args) {
        int speed = 75;
        boolean isBirthday = false;

        int result = calculateTicket(speed, isBirthday);

        switch (result) {
            case 0:
                System.out.println("No ticket");
                break;
            case 1:
                System.out.println("Small ticket");
                break;
            case 2:
                System.out.println("Big ticket");
                break;
        }
    }

    public static int calculateTicket(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }

        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }
}

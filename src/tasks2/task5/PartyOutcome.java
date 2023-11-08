package tasks2.task5;

public class PartyOutcome {
    public static void main(String[] args) {
        int tea = 6;
        int candy = 8;

        int outcome = partyOutcome(tea, candy);

        switch (outcome) {
            case 0:
                System.out.println("Bad party");
                break;
            case 1:
                System.out.println("Good party");
                break;
            case 2:
                System.out.println("Great party");
                break;
        }
    }

    public static int partyOutcome(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        } else {
            return 1;
        }
    }
}

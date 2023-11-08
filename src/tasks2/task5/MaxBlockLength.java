package tasks2.task5;

public class MaxBlockLength {
    public static void main(String[] args) {
        String str = "abbCCCddBBBxx";
        int result = maxBlock(str);
        System.out.println("The length of the largest block is: " + result);
    }

    public static int maxBlock(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        int maxBlockLength = 1;
        int currentBlockLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentBlockLength++;
                if (currentBlockLength > maxBlockLength) {
                    maxBlockLength = currentBlockLength;
                }
            } else {
                currentBlockLength = 1;
            }
        }

        return maxBlockLength;
    }
}

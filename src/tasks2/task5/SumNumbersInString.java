package tasks2.task5;

public class SumNumbersInString {
    public static void main(String[] args) {
        String str = "abc123xyz";
        int result = sumNumbers(str);
        System.out.println("The sum of numbers in the string is: " + result);
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        int currentNumber = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(ch);
            } else {
                sum += currentNumber;
                currentNumber = 0;
            }
        }
        sum += currentNumber;

        return sum;
    }
}

package tasks2.task4;

public class FindMissingNumber {
    public static void main(String[] args) {
        int n = 100;
        int[] arr = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != 42) {
                arr[j] = i;
                j++;
            }
        }
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}

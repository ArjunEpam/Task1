package tasks2.task6;

public class CanBalance {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 1};
        int[] nums2 = {2, 1, 1, 2, 1};
        int[] nums3 = {10, 10};

        boolean result1 = canBalance(nums1);
        boolean result2 = canBalance(nums2);
        boolean result3 = canBalance(nums3);

        System.out.println("Can balance nums1: " + result1);
        System.out.println("Can balance nums2: " + result2);
        System.out.println("Can balance nums3: " + result3);
    }

    public static boolean canBalance(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int num : nums) {
            leftSum += num;
            if (leftSum == totalSum / 2) {
                return true;
            }
        }

        return false;
    }
}

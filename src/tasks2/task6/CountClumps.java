package tasks2.task6;

public class CountClumps {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4, 4};
        int[] nums2 = {1, 1, 2, 1, 1};
        int[] nums3 = {1, 1, 1, 1, 1};

        int result1 = countClumps(nums1);
        int result2 = countClumps(nums2);
        int result3 = countClumps(nums3);

        System.out.println("Number of clumps in nums1: " + result1);
        System.out.println("Number of clumps in nums2: " + result2);
        System.out.println("Number of clumps in nums3: " + result3);
    }

    public static int countClumps(int[] nums) {
        int clumpCount = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    clumpCount++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }

        return clumpCount;
    }
}

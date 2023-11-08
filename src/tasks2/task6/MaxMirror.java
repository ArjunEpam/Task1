package tasks2.task6;

public class MaxMirror {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 8, 9, 3, 2, 1};
        int[] nums2 = {1, 2, 1, 4};
        int[] nums3 = {7, 1, 2, 9, 7, 2, 1};

        int result1 = maxMirror(nums1);
        int result2 = maxMirror(nums2);
        int result3 = maxMirror(nums3);

        System.out.println("Largest mirror section in nums1: " + result1);
        System.out.println("Largest mirror section in nums2: " + result2);
        System.out.println("Largest mirror section in nums3: " + result3);
    }

    public static int maxMirror(int[] nums) {
        int maxMirrorSize = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int size = 0;
                int k = i;
                int l = j;

                while (k < nums.length && l >= 0 && nums[k] == nums[l]) {
                    size++;
                    k++;
                    l--;
                }

                if (size > maxMirrorSize) {
                    maxMirrorSize = size;
                }
            }
        }

        return maxMirrorSize;
    }
}

public class MaxSpan {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 1, 3};
        int[] nums2 = {1, 4, 2, 1, 4, 1, 4};
        int[] nums3 = {1, 4, 2, 1, 4, 4, 4};

        int result1 = maxSpan(nums1);
        int result2 = maxSpan(nums2);
        int result3 = maxSpan(nums3);

        System.out.println("Max Span in nums1: " + result1);
        System.out.println("Max Span in nums2: " + result2);
        System.out.println("Max Span in nums3: " + result3);
    }

    public static int maxSpan(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    if (span > maxSpan) {
                        maxSpan = span;
                    }
                    break;
                }
            }
        }

        return maxSpan;
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        while (right < n) {
            sum = sum + nums[right];
            while (left <= right && sum >= target) {
                minLength = Math.min(right - left + 1, minLength);
                sum = sum - nums[left];
                left++;
            }

            right++;
        }
        return minLength == Integer.MAX_VALUE ? 0:minLength;
    }
}
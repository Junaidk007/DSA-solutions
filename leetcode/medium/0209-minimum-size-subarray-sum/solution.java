class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int start = 0;
       int sum = 0;
       int minlen = Integer.MAX_VALUE;

       for(int end = 0; end < nums.length; end++) {
            sum = sum + nums[end];

            while(start <= end && sum >= target) {
                minlen = Math.min(end - start + 1, minlen);
                sum = sum - nums[start];
                start++;
            }
       }

       return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
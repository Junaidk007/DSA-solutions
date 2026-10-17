class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s = 0;
        int e = 0;

        int minlen = Integer.MAX_VALUE;
        int sum = nums[0];

        while(e < nums.length && s <= e) {
            if(sum < target) {
                e++;
                sum = e < nums.length ? (sum + nums[e]) : sum;
            } else if(sum >= target) {
                int len = e - s + 1;
                minlen = Math.min(len, minlen);
                sum -= nums[s++];
            }
        }

        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
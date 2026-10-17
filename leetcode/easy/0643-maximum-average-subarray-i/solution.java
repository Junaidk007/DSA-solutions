class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s = 0;
        int e = k - 1;
        double sum = 0;

        for(int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        double maxSum = sum;

        while(e < nums.length - 1) {
            s++; e++;

            sum = sum + nums[e] - nums[s - 1];
            maxSum = Math.max(sum, maxSum);
        }

        return (maxSum / k);
    }
}
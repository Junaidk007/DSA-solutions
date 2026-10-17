class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s = 0;
        int e = k - 1;
        double sum = 0;

        for(int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        double currAvg = sum / k;
        double maxAvg = currAvg;

        while(e < nums.length - 1) {
            s++; e++;

            sum = sum + nums[e] - nums[s - 1];
            currAvg = sum / k;
            maxAvg = Math.max(currAvg, maxAvg);
        }

        return maxAvg;
    }
}
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int start = 0;
        int end = k - 1;
        
        
        int currSum = 0;
        
        for(int i = 0; i < k; i++) currSum += arr[i];
        
        int maxSum = currSum;
        
        while(end < arr.length - 1) {
            start++;
            end++;
            
            currSum = currSum + arr[end] - arr[start - 1];
            
            maxSum = Math.max(currSum, maxSum);
        }
        
        return maxSum;
    }
}
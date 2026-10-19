class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int s = 0;

        double sum = 0;

        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int count = (sum / k) >= threshold ? 1 : 0;

        for(int end = k; end < arr.length; end++) {
            s++;
            sum = sum + arr[end] - arr[s - 1];
            count = (sum / k) >= threshold ? count + 1 : count;
        }

        return count;
    }
}
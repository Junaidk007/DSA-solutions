class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;

        double sum = 0;

        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int count = (sum / k) >= threshold ? 1 : 0;

        for(int end = k; end < arr.length; end++) {
            start++;

            sum = sum + arr[end] - arr[start -1];

            if(sum / k >= threshold) {
                count++;
            }
        }

        return count;
    }
}
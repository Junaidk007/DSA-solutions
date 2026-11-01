class Solution {
    public int largestAltitude(int[] gain) {
        // int[] res = new int[gain.length + 1];

        // res[0] = 0;
        int max = 0;
        int curr = 0;

        for(int i = 0; i < gain.length; i++) {
            curr += gain[i];

            max = Math.max(max, curr);

        }

        return max;
    }
}
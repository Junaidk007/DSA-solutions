class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        for(int i : nums) total += i;

        int ls = 0;

        for(int i = 0; i < nums.length; i++) {
            if(ls == total - ls - nums[i]) return i;
            ls += nums[i];
        }

        return -1;
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        ans[0] = 1;

        for(int i = 1; i < nums.length; i++) ans[i] = nums[i - 1] * ans[i - 1];

        int suff = 1;

        for(int j = nums.length - 1; j >= 0; j--) {
            ans[j] = ans[j] * suff;
            suff *= nums[j];
        }

        return ans;
    }
}
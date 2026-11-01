class NumArray {

    int[] ar;
    int[] pre;

    public NumArray(int[] nums) {
        ar = nums;
        pre = new int[ar.length];

        pre[0] = ar[0];

        for(int i = 1; i < ar.length; i++) pre[i] = pre[i - 1] + ar[i];
    }
    
    public int sumRange(int left, int right) {
        if(left != 0) return pre[right] - pre[left - 1];

        return pre[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
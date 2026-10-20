class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> mHeap = new PriorityQueue<>();

        for(int i = n - 1; i >= n - k; i--) {
            mHeap.add(nums[i]);
        }

        for(int i = 0; i < n - k; i++) {
            if(nums[i] > mHeap.peek()) {
                mHeap.poll();
                mHeap.add(nums[i]);
            }
        }

        return mHeap.peek();
    }
}
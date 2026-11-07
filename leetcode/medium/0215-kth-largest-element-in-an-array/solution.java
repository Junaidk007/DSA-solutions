class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        
        for(int i = nums.length - 1; i >= nums.length - k; i--) min.add(nums[i]);
        
        for(int j = 0; j < nums.length - k; j++) {
            if(min.peek() < nums[j]) {
                min.poll();
                min.add(nums[j]);
            }
        }
        
        return min.peek();
    }
}
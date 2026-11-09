class KthLargest {
    PriorityQueue<Integer> topk;
    int k;

    public KthLargest(int k, int[] nums) {
        topk = new PriorityQueue<>();
        this.k = k;
        for(int i = 0; i < nums.length; i++) {
            topk.add(nums[i]);
            if(topk.size() > k) topk.poll();
        }
    }
    
    public int add(int val) {
        topk.add(val);
        if(topk.size() > k) topk.poll();
        return topk.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
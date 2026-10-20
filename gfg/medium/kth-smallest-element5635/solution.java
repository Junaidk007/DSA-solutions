class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < k; i++) {
            maxHeap.add(arr[i]);
        }
        
        for(int i = k; i < arr.length; i++) {
            
            if(arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        
        return maxHeap.peek();
    }
}

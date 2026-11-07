class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < k; i++) max.add(arr[i]);
        
        for(int j = k; j < arr.length; j++) {
            if(max.peek() > arr[j]) {
                max.poll();
                max.add(arr[j]);
            }
        }
        
        return max.peek();
    }
}

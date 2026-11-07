class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> f = new HashMap<>();
        PriorityQueue<Pair> min = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.frq, b.frq)
        );

        for(int i = 0; i < nums.length; i++) {
            f.put(nums[i], f.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> map : f.entrySet()) {
            Pair p = new Pair(map.getKey(), map.getValue());
            min.add(p);
            if (min.size() > k) min.poll();
        }

        int[] ans = new int[k];

        for(int i = 0; i < k; i++) {
            ans[i] = min.poll().val;
        }

        return ans;

    }
}

class Pair {
    int val; int frq;
    Pair(int a, int b) {
        val = a;
        frq = b;
    }
}
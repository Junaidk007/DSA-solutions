# Top K Frequent Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` and an integer `k`, return  *the*  `k`  *most frequent elements*. You may return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  nums = [1,1,1,2,2,3], k = 2

 **Output:**  [1,2]

 **Example 2:** 

 **Input:**  nums = [1], k = 1

 **Output:**  [1]

 **Example 3:** 

 **Input:**  nums = [1,2,1,2,1,2,3,1,3,2], k = 2

 **Output:**  [1,2]

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- k is in the range [1, the number of unique elements in the array].
- It is guaranteed that the answer is unique.

 

 **Follow up:**  Your algorithm's time complexity must be better than `O(n log n)`, where n is the array's size.

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 71.97%)  
**Memory:** 47.4 MB (beats 60.85%)  
**Submitted:** 2026-11-07T05:05:12.859Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/top-k-frequent-elements/)
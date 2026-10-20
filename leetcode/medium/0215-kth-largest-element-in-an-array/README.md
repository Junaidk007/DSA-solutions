# Kth Largest Element in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` and an integer `k`, return  *the*  `kth`  *largest element in the array*.

Note that it is the `kth` largest element in the sorted order, not the `kth` distinct element.

Can you solve it without sorting?

 

 **Example 1:** 

```
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

```

 **Example 2:** 

```
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

```

 

 **Constraints:** 

- 1 <= k <= nums.length <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 47 ms (beats 68.17%)  
**Memory:** 73.6 MB (beats 87.36%)  
**Submitted:** 2026-10-20T05:03:08.258Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/kth-largest-element-in-an-array/)
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
**Runtime:** 52 ms (beats 65.05%)  
**Memory:** 73.1 MB (beats 90.74%)  
**Submitted:** 2026-11-07T04:31:55.584Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/kth-largest-element-in-an-array/)
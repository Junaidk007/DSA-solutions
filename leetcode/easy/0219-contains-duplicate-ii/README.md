# Contains Duplicate II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` and an integer `k`, return `true`  *if there are two  **distinct indices*** `i` *and* `j` *in the array such that* `nums[i] == nums[j]` *and* `abs(i - j) <= k`.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1], k = 3
Output: true

```

 **Example 2:** 

```
Input: nums = [1,0,1,1], k = 1
Output: true

```

 **Example 3:** 

```
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109
- 0 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 30 ms (beats 84.61%)  
**Memory:** 124.8 MB (beats 37.86%)  
**Submitted:** 2026-10-23T04:50:03.972Z  

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (lastSeen.containsKey(nums[i]) && i - lastSeen.get(nums[i]) <= k) {
                return true;
            }
            lastSeen.put(nums[i], i);
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate-ii/)
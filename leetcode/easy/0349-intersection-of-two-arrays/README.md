# Intersection of Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must be  **unique**  and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 19.95%)  
**Memory:** 45.1 MB (beats 23.01%)  
**Submitted:** 2026-10-27T16:06:07.168Z  

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        HashMap<Integer, Integer> h2 = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums2.length; i++) {
            if(!h2.containsKey(nums2[i])) h2.put(nums2[i], i);
        }

        for(int j = 0; j < nums1.length; j++) {
            if(h1.containsKey(nums1[j])) continue;
            h1.put(nums1[j], j);

            if(h2.containsKey(nums1[j])) {
                result.add(nums1[j]);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
} 
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)
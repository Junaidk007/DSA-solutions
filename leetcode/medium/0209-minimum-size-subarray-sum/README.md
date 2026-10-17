# Minimum Size Subarray Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of positive integers `nums` and a positive integer `target`, return  *the  **minimal length**  of a  **subarray**  whose sum is greater than or equal to*  `target`. If there is no such subarray, return `0` instead.

 

 **Example 1:** 

```
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

```

 **Example 2:** 

```
Input: target = 4, nums = [1,4,4]
Output: 1

```

 **Example 3:** 

```
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

```

 

 **Constraints:** 

- 1 <= target <= 109
- 1 <= nums.length <= 105
- 1 <= nums[i] <= 104

 

 **Follow up:**  If you have figured out the `O(n)` solution, try coding another solution of which the time complexity is `O(n log(n))`.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 20.62%)  
**Memory:** 68.7 MB (beats 96.87%)  
**Submitted:** 2026-10-17T17:27:07.954Z  

```java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s = 0;
        int e = 0;

        int minlen = Integer.MAX_VALUE;
        int sum = nums[0];

        while(e < nums.length && s <= e) {
            if(sum < target) {
                e++;
                sum = e < nums.length ? (sum + nums[e]) : sum;
            } else if(sum >= target) {
                int len = e - s + 1;
                minlen = Math.min(len, minlen);
                sum -= nums[s++];
            }
        }

        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-size-subarray-sum/)
# Permutation in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

 

 **Example 1:** 

```
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

```

 **Example 2:** 

```
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

```

 

 **Constraints:** 

- 1 <= s1.length, s2.length <= 104
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 66.36%)  
**Memory:** 43.4 MB (beats 96.49%)  
**Submitted:** 2026-10-24T04:46:57.889Z  

```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] f = new int[27];

        int st = 0;

        for(int i = 0; i < s1.length(); i++) {
            f[s2.charAt(i) - 'a']--;
            f[s1.charAt(i) - 'a']++;
        }

        if(isZero(f)) return true;

        for(int i = s1.length(); i < s2.length(); i++) {
            f[s2.charAt(st) - 'a']++;
            f[s2.charAt(i) - 'a']--;
            st++;

            if(isZero(f)) return true;
        }

        return false;
    }

    public boolean isZero(int[] freq) {
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)
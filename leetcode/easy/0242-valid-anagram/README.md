# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 65.63%)  
**Memory:** 43.7 MB (beats 97.53%)  
**Submitted:** 2026-10-25T07:22:07.268Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] f = new int[128];

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
            f[t.charAt(i)]--;
        }    

        for(int count : f ) {
            if(count != 0) return false;
        }

        return true;
    }   
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)
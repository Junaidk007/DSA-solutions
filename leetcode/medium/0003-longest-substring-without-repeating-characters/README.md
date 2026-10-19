# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 42 ms (beats 72.72%)  
**Memory:** 47.2 MB (beats 98.29%)  
**Submitted:** 2026-10-19T05:19:07.050Z  

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int maxlen = 0;
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int high = 0; high < s.length(); high++) {
            if(!mp.containsKey(s.charAt(high))) {
                mp.put(s.charAt(high), high);
            } else {
                low = Math.max(low, mp.get(s.charAt(high)) + 1);
                mp.put(s.charAt(high), high);
            }

            maxlen = Math.max(high - low + 1, maxlen);
        }

        return maxlen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
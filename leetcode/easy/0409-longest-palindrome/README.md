# Longest Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` which consists of lowercase or uppercase letters, return the length of the  **longest palindrome**  that can be built with those letters.

Letters are  **case sensitive**, for example, `"Aa"` is not considered a palindrome.

 

 **Example 1:** 

```
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

```

 **Example 2:** 

```
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s consists of lowercase and/or uppercase English letters only.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 46.61%)  
**Memory:** 42.5 MB (beats 95.58%)  
**Submitted:** 2026-10-31T14:39:18.647Z  

```java
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> f = new HashMap<>();

        for(char ch : s.toCharArray()) {
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }

        int len = 0;
        boolean hasOdd = false;

        for(char key : f.keySet()) {

            if(f.get(key) % 2 != 0) {
                len += f.get(key) - 1;
            } else {
                len += f.get(key);
            }

            if(f.get(key) % 2 != 0) hasOdd = true;
 
        }

        if(hasOdd) len++;

        return len;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindrome/)
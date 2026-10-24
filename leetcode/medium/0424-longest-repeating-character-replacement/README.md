# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 22 ms (beats 30.42%)  
**Memory:** 45.6 MB (beats 95.77%)  
**Submitted:** 2026-10-24T03:11:49.819Z  

```java
class Solution {

    public static int maxf(int[] arr) {
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    return max;
}

    public int characterReplacement(String a, int k) {
        int s = 0;
        int[] f = new int[27];
        int maxlen = 0;

        for(int i = 0; i < a.length(); i++) {
            f[a.charAt(i) - 'A']++;
            int clen = i - s + 1;
            int mf = maxf(f);
            int diff = clen - mf;

            while(diff > k) {
                f[a.charAt(s) - 'A']--;
                s++;
                clen = i - s + 1;
                mf = maxf(f);
                diff = clen - mf;
            }

            maxlen = Math.max(clen, maxlen);
        }

        return maxlen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)
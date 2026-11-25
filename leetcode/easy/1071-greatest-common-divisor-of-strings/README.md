# Greatest Common Divisor of Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

For two strings `s` and `t`, we say "`t` divides `s`" if and only if `s = t + t + t +... + t + t` (i.e., `t` is concatenated with itself one or more times).

Given two strings `str1` and `str2`, return  *the largest string* `x` *such that* `x` *divides both* `str1` *and* `str2`.

 

Original
Java
 **Example 1:** 

 **Input:**  str1 = "ABCABC", str2 = "ABC"

 **Output:**  "ABC"

 **Example 2:** 

 **Input:**  str1 = "ABABAB", str2 = "ABAB"

 **Output:**  "AB"

 **Example 3:** 

 **Input:**  str1 = "LEET", str2 = "CODE"

 **Output:**  ""

 **Example 4:** 

 **Input:**  str1 = "AAAAAB", str2 = "AAA"

 **Output:**  ""​​​​​​​

 

 **Constraints:** 

- 1 <= str1.length, str2.length <= 1000
- str1 and str2 consist of English uppercase letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 95.16%)  
**Memory:** 42.9 MB (beats 90.59%)  
**Submitted:** 2026-11-25T16:28:23.531Z  

```java
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+str1)){
            return "";
        }
        int n = GCD(str1.length(), str2.length());

        return str1.substring(0, n);
    }

    public int GCD(int a, int b) {
        while(b > 0) {
            int rem = a%b;
            a = b;
            b = rem;
        }

        return Math.abs(a);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/greatest-common-divisor-of-strings/)
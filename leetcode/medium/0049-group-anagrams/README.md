# Group Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of strings `strs`, group the anagrams together. You can return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  strs = ["eat","tea","tan","ate","nat","bat"]

 **Output:**  [["bat"],["nat","tan"],["ate","eat","tea"]]

 **Explanation:** 

- There is no string in strs that can be rearranged to form "bat".
- The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
- The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

 **Example 2:** 

 **Input:**  strs = [""]

 **Output:**  [[""]]

 **Example 3:** 

 **Input:**  strs = ["a"]

 **Output:**  [["a"]]

 

 **Constraints:** 

- 1 <= strs.length <= 104
- 0 <= strs[i].length <= 100
- strs[i] consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 74.99%)  
**Memory:** 49.2 MB (beats 91.70%)  
**Submitted:** 2026-10-29T14:46:17.067Z  

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if(!map.containsKey(key)) map.put(key, new ArrayList<>());

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
        
        // List<List<String>> ans = new ArrayList<>();
        // HashMap<String, Integer> map = new HashMap<>();

        // for(int i = 0; i < strs.length; i++) {
        //     if(map.containsKey(strs[i])) continue;
        //     List<String> list = new ArrayList<>();
        //     list.add(strs[i]);
        //     map.put(strs[i], 1);
        //     for(int j = i + 1; j < strs.length; j++) {
        //         // if(map.containsKey(strs[j])) continue;
        //         if(isAnagram(strs[i], strs[j])) {
        //             list.add(strs[j]);
        //             map.put(strs[j], 1);
        //         }
        //     }

        //     ans.add(list);
        // }

        // return ans;
    }

    // public boolean isAnagram(String s, String t) {
    //     int[] f = new int[128];

    //     if(s.length() != t.length()) return false;

    //     for(int i = 0; i < s.length(); i++) {
    //         f[s.charAt(i)]++;
    //         f[t.charAt(i)]--;
    //     }

    //     for(int i = 0; i < f.length; i++) {
    //         if(f[i] != 0) return false;
    //     }

    //     return true;
    // }
}
```

---

[View on LeetCode](https://leetcode.com/problems/group-anagrams/)
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
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> f = new HashMap<>();

        for(char ch : s.toCharArray()) {
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }

        int len = 0;
        boolean hasOdd = false;

        for(char key : f.keySet()) {

            len += (f.get(key) / 2) * 2;

            if(f.get(key) % 2 != 0) hasOdd = true;
 
        }

        if(hasOdd) len++;

        return len;
    }
}
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
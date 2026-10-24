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
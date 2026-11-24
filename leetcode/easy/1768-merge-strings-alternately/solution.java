class Solution {
    public String mergeAlternately(String word1, String word2) {
        String a = "";

        int i = 0; int j = 0;

        while(i < word1.length() || j < word2.length()) {
            if(i < word1.length()) {
                a += word1.charAt(i++);
            }

            if(j < word2.length()) {
                a += word2.charAt(j++);
            }
        }

        return a;
    }
}
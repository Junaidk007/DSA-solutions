class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        String a = "";

        int i = 0; int j = 0;

        while(n > 0) {
            if(i < word1.length()) {
                a += word1.charAt(i++);
            }

            if(j < word2.length()) {
                a += word2.charAt(j++);
            }

            n--;
        }

        return a;
    }
}
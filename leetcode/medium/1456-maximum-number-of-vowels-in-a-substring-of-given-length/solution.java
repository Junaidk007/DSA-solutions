
class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        maxCount = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Remove the outgoing character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            // Add the incoming character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            maxCount = Math.max(maxCount, count);

            // Maximum possible is k
            // if (maxCount == k) {
            //     return k;
            // }
        }

        return maxCount;
    }

    public boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}

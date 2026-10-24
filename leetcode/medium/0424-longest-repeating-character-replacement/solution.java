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
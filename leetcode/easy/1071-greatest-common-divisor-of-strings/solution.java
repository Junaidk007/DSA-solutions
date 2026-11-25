class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder s1 = new StringBuilder(str1 + str2);
        StringBuilder s2 = new StringBuilder(str2 + str1);

        if(!s1.toString().equals(s2.toString())) return "";
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
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+str1)){
            return "";
        }
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
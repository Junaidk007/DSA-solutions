class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            if(map.containsKey(strs[i])) continue;
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            map.put(strs[i], 1);
            for(int j = i + 1; j < strs.length; j++) {
                // if(map.containsKey(strs[j])) continue;
                if(isAnagram(strs[i], strs[j])) {
                    list.add(strs[j]);
                    map.put(strs[j], 1);
                }
            }

            ans.add(list);
        }

        return ans;
    }

    public boolean isAnagram(String s, String t) {
        int[] f = new int[128];

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
            f[t.charAt(i)]--;
        }

        for(int i = 0; i < f.length; i++) {
            if(f[i] != 0) return false;
        }

        return true;
    }
}
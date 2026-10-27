class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        HashMap<Integer, Integer> h2 = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums2.length; i++) {
            if(!h2.containsKey(nums2[i])) h2.put(nums2[i], i);
        }

        for(int j = 0; j < nums1.length; j++) {
            if(h1.containsKey(nums1[j])) continue;
            h1.put(nums1[j], j);

            if(h2.containsKey(nums1[j])) {
                result.add(nums1[j]);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
} 
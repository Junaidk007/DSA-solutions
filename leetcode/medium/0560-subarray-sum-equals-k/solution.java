class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> f = new HashMap<>();

        f.put(0, 1);
        int sum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(f.containsKey(sum - k)) {
                count += f.get(sum - k);
            }

            f.put(sum, f.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
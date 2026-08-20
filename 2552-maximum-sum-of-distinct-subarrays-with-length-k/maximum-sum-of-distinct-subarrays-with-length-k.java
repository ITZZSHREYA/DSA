class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxsum = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        long sum = 0; // Changed from int to long

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        }

        if (hs.size() == k) {
            maxsum = sum;
        }

        for (int i = k; i < n; i++) {
            int old = nums[i - k];
            hs.put(old, hs.get(old) - 1);
            if (hs.get(old) == 0) {
                hs.remove(old);
            }
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);

            sum -= nums[i - k];
            sum += nums[i];

            if (hs.size() == k) {
                maxsum = Math.max(sum, maxsum);
            }
        }
        return maxsum;
    }
}
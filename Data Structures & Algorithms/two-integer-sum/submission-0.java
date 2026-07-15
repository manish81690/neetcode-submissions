class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numToFind = target - nums[i];

            if (freq.containsKey(numToFind)) {
                return new int[]{freq.get(numToFind), i};
            }

            freq.put(nums[i], i);
        }

        return new int[]{};
    }
}
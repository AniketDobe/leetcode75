// You are given an integer array nums and an integer k.
// In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
// Return the maximum number of operations you can perform on the array.

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxOperations = 0;

        for (int num : nums) {
            int complement = k - num;

            if (countMap.containsKey(complement) && countMap.get(complement) > 0) {
                maxOperations++;

                countMap.put(num, countMap.get(num) - 1);
                countMap.put(complement, countMap.get(complement) - 1);
            }
        }

        return maxOperations;
    }
}

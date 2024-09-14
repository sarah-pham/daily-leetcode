class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = nums[0];
        int maxLen = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxLen = 1;
                count = 1;
            } else if (nums[i] == maxVal) {
                count++;
                maxLen = Math.max(maxLen, count);
            } else {
                count = 0;
            }
        }

        return maxLen;
    }
}
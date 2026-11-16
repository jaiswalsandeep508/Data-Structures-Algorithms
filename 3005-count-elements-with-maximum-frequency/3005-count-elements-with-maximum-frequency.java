class Solution {
    public int maxFrequencyElements(int[] nums) {

        int maxFrequency = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            // Skip already processed elements
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (nums[i] == nums[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > maxFrequency) {
                maxFrequency = count;
                result = count;
            }
            else if (count == maxFrequency) {
                result += count;
            }
        }

        return result;
    }
}
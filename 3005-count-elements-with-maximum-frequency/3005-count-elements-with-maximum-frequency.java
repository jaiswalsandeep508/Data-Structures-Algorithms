class Solution {
    public int maxFrequencyElements(int[] nums) {

        int maxFrequency = 0;
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i],0);
            map.put(nums[i],count+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxFrequency) {
                maxFrequency = value;
                result = value;
            } 
            else if (value == maxFrequency) {
                result = result + value;
            }
        }

        return result;
    }
}
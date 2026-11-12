class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i<nums.length ; i++){
            int search = target - nums[i]; //9-2 = 7
            if(map.containsKey(search)) {
                result[0] = i;
                result[1] = map.get(search);
                return result;
            } else {
                map.put(nums[i],i);
            }
        }

        return new int[]{};
    }
}
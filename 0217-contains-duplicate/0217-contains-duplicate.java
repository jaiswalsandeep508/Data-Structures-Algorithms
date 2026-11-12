class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean result =true;
        for(int i =0; i<nums.length ; i++){
            result = set.add(nums[i]);
            if(!result) {
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mem = new HashSet<Integer>();

        for(int i= 0; i<nums.length;i++){
            if(mem.contains(nums[i])){
                return true;
            }

            mem.add(nums[i]);
        }

        return false;
    }
}




class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int cur = 0;
        while(cur<size){
            if(nums[cur] == target){
                return cur;
            } else {
                if (nums[cur] < target) {
                    cur++;
                } else {
                    return cur;
                }
                
            }
        } return cur;
    }
}
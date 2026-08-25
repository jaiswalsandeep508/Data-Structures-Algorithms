class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = 0;

        while(end<nums.length){
            if(nums[end] == val){
                end++;
            } else {
                nums[start] = nums[end];
                start++;
                end++;
            }
        }
        return start;
    }
}

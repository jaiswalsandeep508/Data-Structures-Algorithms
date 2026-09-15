class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // non-zero elements ko aage laao
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // remaining positions me 0 bhar do
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
          List<List<Integer>> result = new ArrayList<>();
         solve(0,new ArrayList<>(),nums,result);
         return result;
    }
 
    public void solve(int index, List<Integer> curr, int[] nums, List<List<Integer>> result) {
 
        // Step 1: Current subset save karo
        result.add(new ArrayList<>(curr));
 
        for (int i = index; i < nums.length; i++) {
            // Choose
        curr.add(nums[i]);
           // Explore
         solve(i+1,curr,nums,result);
         //backtrack
         curr.remove(curr.size()-1);
        }
    }
}
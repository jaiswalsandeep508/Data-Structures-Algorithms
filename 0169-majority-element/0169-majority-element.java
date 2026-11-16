class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int count = map.getOrDefault(nums[i],0);
            map.put(nums[i],count+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value = entry.getValue();

            if(value > nums.length/2) return entry.getKey();
        }
        return 0;
    } 
}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        int total=0;
        int index=0;
        solve(res,curr,candidates,target,total,index);
      return res;
    }
    public void solve(List<List<Integer>> res,List<Integer> curr,int[] candidates,int target,int total,int index){
        if(total==target){
            res.add(new ArrayList(curr));
            return;
        }
        if(total>target){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            //choose
            curr.add(candidates[i]);
            total+=candidates[i];
 
            //recursive
            solve(res,curr,candidates,target,total,i);
           
            //backtrack
            total-=curr.get(curr.size()-1);
            curr.remove(curr.size()-1);
           
        }
    }
}
 
//     2,3,6,7
 
// 1)  i =2    
 
// curr=2
 
// 2) solve
//   i=2
//   curr=[2,2]
 
//  3) solve
//   i=2
//   curr=[2,2,2]
//   --backtrcak
//   curr=[2,2]
//   i=3
//   curr=[2,2,3]
 
// 4)solve
//   i=2
//   curr=[2,2,2,2] =>8
 
//   return
//   backtrack => curr=[2,2,2]
 
//   i=3
//   curr=[2,2,2,3]
 
//   backtrack
//   curr=[2,2,2]
//   till last no element
//   go in step 3 backtrack
 
 
 
// solve()
// --base
// if curr==target-> add in result return
 
// if curr>target return
 
 
// for-0,nums.length
 
// //choose
// curr.add
 
// //recursive
// solve()
 
// //backtrack
// remove last element
 
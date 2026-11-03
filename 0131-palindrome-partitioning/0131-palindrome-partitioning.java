class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
 
        backtrack(0, s, current, result);
 
        return result;
    }
 
    private void backtrack(int index, String s,              
                             
                           List<String> current,
                           List<List<String>> result) {
 
        // Base case: entire string is partitioned
        if (index == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
 
        // Try every possible substring
        for (int i = index; i < s.length(); i++) {
 
            if (isPalindrome(s, index, i)) {
 
                // Choose
                current.add(s.substring(index, i + 1));
 
                // Explore
   
                backtrack(i + 1, s, current, result);
 
                // Undo choice (backtracking)
                current.remove(current.size() - 1);
            }
        }    }
 
 
 
 
 
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
 
 
// s==aab
// for- 0 ,2
// index-0, i=0 => a
// curr='a',
// ---after bcaktrack
// curr=''
 
// i=1, index=0 -aa
// curr=
// i
 
 
 
// indx=2,i=2 -b
// curr=aa
 
 
 
// res=aa,b
 
 
 
 
// 1) indx=1,i=1
// curr='a','a'
// -----after backtrack
// curr='a'
// index=1, i=2
//         i=3
 
 
 
// 2)indx=2,i=2
// curr='a','a','b'
// --after backtrack
// curr=a,a
 
// index=3-outside
 
// 3) index=3
// res=[a,a,b]
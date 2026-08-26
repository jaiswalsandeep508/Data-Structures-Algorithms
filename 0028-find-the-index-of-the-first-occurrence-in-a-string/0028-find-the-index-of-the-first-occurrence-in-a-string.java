class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null) return -1;
        int length = haystack.length();
        int start = 0;
        int end = needle.length();
        while(end<=length){
            if(haystack.substring(start,end).equals(needle))
                return start;
            else {
                start++;
                end++;
            }
        }
        return -1;
    }
}
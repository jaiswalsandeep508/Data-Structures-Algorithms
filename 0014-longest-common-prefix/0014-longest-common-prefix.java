class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLenghtString = Integer.MAX_VALUE;

        for(int i=0;i<strs.length;i++){
            minLenghtString = Math.min(minLenghtString,strs[i].length());
        }

        while(minLenghtString>0){
            String str = strs[0].substring(0,minLenghtString);
            boolean flag = true;
            
            for(int i = 1; i<strs.length; i++){
                if(!str.equals(strs[i].substring(0,minLenghtString))){
                    flag = false;
                    break;
                }
            }
            if(flag == false){
                minLenghtString--;
            } else 
                return str;
        }

        return "";
    }
}
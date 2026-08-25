class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int pointer = 0;
        int sum = 0;

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        while(pointer<s.length()-1){
            int val = map.get(s.charAt(pointer));
            int nextVal = map.get(s.charAt(pointer+1));
            if(val>=nextVal ){
                result = result+val;
                pointer++;
            } else {
                sum = nextVal-val;
                result = result+sum;
                pointer = pointer+2;
            }
        }
        if (pointer == s.length() - 1) {
            result += map.get(s.charAt(pointer));
        }
        return result;
    }
}
class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        int pointer = 0;
        if(length==0) return true;

        Stack<Character> stack = new Stack<>();

        while(pointer<length){
            if(s.charAt(pointer) =='(' || s.charAt(pointer)=='{' || s.charAt(pointer) == '['){
                stack.push(s.charAt(pointer));
            } else {
                if(stack.isEmpty()){
                    return false;
                } else {
                    char ch = stack.pop();
                    if(!(s.charAt(pointer) == ')' && ch == '(') 
                    && !(s.charAt(pointer) == ']' && ch == '[') 
                    && !(s.charAt(pointer) == '}' && ch == '{')){
                        return false;
                    }
                }
            }
            pointer++;
        }
        return stack.isEmpty();
    }
}
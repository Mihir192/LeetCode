class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) == ')' && stk.empty() == false) {
                if(stk.peek() == '('){
                    stk.pop();
                }
                else {
                    return false;
                }
            }
            else if (s.charAt(i) == '}' && stk.empty() == false) {
                if(stk.peek() == '{'){
                    stk.pop();
                }
                else {
                    return false;
                }
            }
            else if (s.charAt(i) == ']' && stk.empty() == false) {
                if(stk.peek() == '['){
                    stk.pop();
                }
                else {
                    return false;
                }
            }
            else {
                stk.push(s.charAt(i));
            }
        }
        return stk.empty();


    }
}

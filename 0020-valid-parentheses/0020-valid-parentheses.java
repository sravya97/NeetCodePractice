class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            } else {
                if(!stack.isEmpty()){
                    char popped = stack.pop();
                    if((current == ')' && popped == '(') ||
                       (current == ']' && popped == '[') ||
                       (current == '}' && popped == '{'))
                    {
                        continue;
                    } 
                } 
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
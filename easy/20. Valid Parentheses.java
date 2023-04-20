class Solution {

        public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}
    }


// Alterante solution

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int n = 0;

        for(char ch : s.toCharArray()){
            if (n==1) return false;
            if (ch == '(') stack.push(')');
             if (ch == '{') stack.push('}');
              if (ch == '[') stack.push(']');
              if(stack.isEmpty() && (ch == ')' || ch == '}' ||  ch == ']') ) return false;
             if (ch == ')' && ch != stack.pop() ) return false;
              if (ch == '}' && ch != stack.pop()) return false;
               if (ch == ']' && ch != stack.pop()) return false;
        }
        return stack.isEmpty(); 
    }
}

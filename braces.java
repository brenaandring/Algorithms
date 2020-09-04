class Result {
    static String[] braces(String[] values) {
        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            String s = values[i];
            if (isValid(s)) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        return result;
    }

    static boolean isValid(String s){
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
package CrackYourPlacementDay10;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();

        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(test1 + ": " + vp.isValid(test1));
        System.out.println(test2 + ": " + vp.isValid(test2));
        System.out.println(test3 + ": " + vp.isValid(test3));
        System.out.println(test4 + ": " + vp.isValid(test4));
        System.out.println(test5 + ": " + vp.isValid(test5));
    }
}

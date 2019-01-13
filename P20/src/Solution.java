import java.util.*;
public class Solution {
    private Stack<Character> stack = new Stack<>();

    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); ++i) {
            stack.push(s.charAt(i));
        }
//        while (!stack.empty()) {
//            System.out.println(stack.pop());
//        }
        while (!stack.empty()) {
            char t = stack.pop();
            char target = getClosure(t);
            if (target == '#') return false;
            boolean r = popStack(target);
            if (!r) return false;
        }
        return true;
    }
// [], {}, ()

    public char getClosure(char end) {
        if (end == ')') return '(';
        else if (end == ']') return '[';
        else if (end == '}') return '{';
        else return '#';
    }

    public boolean popStack(char start) {
        if (stack.empty()) return false;
        boolean ret = false;
        char t;
        while (!stack.empty()) {
            t = stack.pop();
//            System.out.println("Walking " + t);
            if (t == start) {
                ret = true;
                break;
            }
            else {
                char target = getClosure(t);
                if (target == '#') return false;
                boolean r = popStack(target);
                if (!r) return false;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("[(])"));
    }
}
import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(')');
            else {
                if (stack.isEmpty()) return false;
                if (s.charAt(i) != stack.pop()) return false;
            }
        }
        
        return stack.isEmpty() ? true : false;
    }
}
import java.util.*;

class Solution {
    public int solution(String s) {
        return remove(s, 0);
    }
    
    int remove(String s, int count) {
        char[] charArr = s.toCharArray();
        
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : charArr) {
            if (!stack.isEmpty()) {
                char cur = stack.peek();
                if (cur == c) stack.pop();
                else stack.push(c);
            } else stack.push(c);
        }

        return (stack.size() == 0) ? 1 : 0;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> parti = new HashMap<>();
        
        for (String p : participant) {
            if (!parti.containsKey(p)) {
                parti.put(p, 1);
            } else {
                parti.put(p, parti.get(p) + 1);
            }
        }
        
        for (String c : completion) {
            if (parti.containsKey(c)) {
                if (parti.get(c) != 1) {
                    parti.put(c, parti.get(c) - 1);
                } else {
                    parti.remove(c);
                }
            }
        }
        
        return parti.keySet().iterator().next();
    }
}
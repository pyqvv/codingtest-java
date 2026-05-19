import java.util.*;

class Solution {
    Set<Integer> primeSet;

    public int solution(String numbers) {
        char[] charArr = numbers.toCharArray();

        primeSet = new HashSet<>();
        
        dfs(charArr, "", new boolean[charArr.length]);

        return primeSet.size();
    }

    void dfs(char[] charArr, String cur, boolean[] visited) {
        if(cur.length() != 0) {
            int num = Integer.parseInt(cur);
            if(isPrime(num)) primeSet.add(num);
        }

        for(int i = 0; i < charArr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(charArr, cur+charArr[i], visited);
                visited[i] = false;
            }
        }
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        for(int i = 2; i < n; i++) {
            if (n % i == 0) return false; 
        }
        return true;
    }
}
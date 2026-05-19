class Solution {
    int answer = -1;
    public int solution(int k, int[][] dungeons) {
        dfs(k, dungeons, 0, new boolean[dungeons.length]);
        return answer;
    }

    void dfs(int k, int[][] dungeons, int count, boolean[] visited) {
        if (answer < count) {
            answer = count;
        }

        for(int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                count++;
                dfs(k-dungeons[i][1], dungeons, count, visited);
                visited[i] = false;
                count--;
            }
        }
    }
}
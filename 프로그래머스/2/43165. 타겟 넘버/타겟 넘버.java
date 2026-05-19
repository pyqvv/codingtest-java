class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, target, 0, 0);
        return answer;
    }

    int dfs(int[] numbers, int target, int idx, int sum) {
        int count = 0;

        if (idx == numbers.length) {
            return (sum == target) ? 1 : 0;
        }

        count += dfs(numbers, target, idx+1, sum + numbers[idx]);
        count += dfs(numbers, target, idx+1, sum - numbers[idx]);

        return count;
    }
}
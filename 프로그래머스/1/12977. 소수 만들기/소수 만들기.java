class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    int q;
                    for (q = 2; q < sum; q++) {
                        if (sum % q == 0) break;
                    }
                    if (sum == q) answer++;
                }
            }   
        }

        return answer;
    }
}
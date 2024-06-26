class Solution {
    public int[] leftRightDifference(int[] nums) {

        int answer[] = new int[nums.length];

        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];

        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;

        int left = 0, right = 0;

        for(int i = 1; i < nums.length; i++)
        {
            left += nums[i - 1];
            leftSum[i] = left;
        }

        for(int i = nums.length - 2; i >= 0; i--)
        {
            right += nums[i + 1];
            rightSum[i] = right;
        }

        for(int i = 0; i < answer.length; i++)
        {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
        
    }
}

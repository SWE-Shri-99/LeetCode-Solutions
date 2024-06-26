class Solution {
    public int differenceOfSum(int[] nums) {

        int elementSum = 0, digitSum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            elementSum += nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];

            while(num != 0)
            {
                int digit = num % 10;
                digitSum += digit;
                num /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
        
    }
}

class Solution {
    public int maxProduct(int[] nums) {

        int maxValue = 0;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(((nums[i] - 1) * (nums[j] - 1)) > maxValue)
                   maxValue = (nums[i] - 1) * (nums[j] - 1);
            }
        }

        return maxValue;
        
    }
}

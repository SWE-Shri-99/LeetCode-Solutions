class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(numberOfDigits(nums[i]) == true)
               count++;
        }
        
        return count;
        
    }
 
    public boolean numberOfDigits(int n) {
        
        int digits = 0;

        while(n != 0)
        {
           n /= 10;
           digits++;
        }

        if(digits % 2 == 0)
           return true;
        else
           return false;
    }
}

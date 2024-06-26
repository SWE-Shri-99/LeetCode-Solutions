class Solution {
    public int maxFrequencyElements(int[] nums) {

        int arr[] = new int[101];
        int maxFreq = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            arr[nums[i]]++;
        }

        for(int i = 1; i <= 100; i++)
        {
            if(arr[i] > maxFreq)
               maxFreq = arr[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(arr[nums[i]] == maxFreq)
               count++;
        }
        
        return count;

    }
}

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {

        int goodPairs = 0;
        
        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = 0; j < nums2.length; j++)
            {
                int ans = nums2[j] * k;

                if(nums1[i] % ans == 0)
                   goodPairs++;
            }
        }

        return goodPairs;
        
    }
}

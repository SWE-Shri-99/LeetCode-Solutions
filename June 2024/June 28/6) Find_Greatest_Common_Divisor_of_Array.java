class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int smallest = nums[0], largest = nums[nums.length - 1];

        while(largest % smallest != 0)
        {
            int rem = largest % smallest;
            largest = smallest;
            smallest = rem;
        }

        return smallest;
        
    }
}

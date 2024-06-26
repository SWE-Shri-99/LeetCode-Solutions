class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int start = 0, mid = n;

        int arr[] = new int[n * 2];

        for(int i = 0; i < arr.length; i += 2)
        {
            // arr[i] & arr[i + 1] = nums[i] & nums[mid + i]
            arr[i] = nums[start];
            arr[i + 1] = nums[mid + start];

            start++;

            // arr[0] = nums[0] = 2
            // arr[1] = nums[3 + 0] = nums[3] = 3

            // arr[2] = nums[1] = 5
            // arr[3] = nums[3 + 1] = nums[4] = 4

            // arr[4] = nums[2] = 1
            // arr[5] = nums[3 + 4] = nums[7] = ?
        }

        return arr;
    }
}

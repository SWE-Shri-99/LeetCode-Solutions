class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int countLess = 0;  // Count of numbers less than target
        int countEqual = 0; // Count of numbers equal to target
        
        // Step 1: Count the numbers less than and equal to the target
        for (int num : nums) {
            if (num < target) {
                countLess++;
            } else if (num == target) {
                countEqual++;
            }
        }
        
        // Step 2: Calculate the target indices
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < countEqual; i++) {
            indices.add(countLess + i);
        }
        
        // Step 3: Return the list of target indices
        return indices;
    }
}

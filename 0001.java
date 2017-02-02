// https://leetcode.com/problems/two-sum/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = {-1, -1};
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                
                if (target == nums[i] + nums[j]) {
                    results[0] = i;
                    results[1] = j;
                    
                    return results;
                }
            }
        }
        
        return results;
    }
}

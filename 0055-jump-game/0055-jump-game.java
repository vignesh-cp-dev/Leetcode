import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
//     int n=nums.length,i=0,furthest=0;
//     while(i<n) {
//         if(i>furthest) return false;
//         if(i==n-1) break;
//     furthest=Math.max(furthest,i+nums[i]);
//     i++;   
//     }
// return true;


// DPint n = nums.length;
int n=nums.length;
        boolean[] dp = new boolean[n];
        dp[0] = true; // Starting point is always reachable
        
        for (int i = 0; i < n; i++) {
            // If this index cannot be reached, we can't jump from it
            if (!dp[i]) continue;
            
            // If we can already reach the end, return true early
            if (i >= n - 1) return true;
            
            // Try all possible jump lengths from current position
            int maxJump = Math.min(i + nums[i], n - 1);
            for (int j = i + 1; j <= maxJump; j++) {
                dp[j] = true;
            }
        }
        
        return dp[n - 1];
}}
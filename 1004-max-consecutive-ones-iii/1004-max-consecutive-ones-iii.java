    import java.util.*;
    class Solution {
        public int longestOnes(int[] nums, int k) {
        int left=0,n=nums.length,ans=0,right=0,temp=0;
        // if(n==0) return n;
        while(right<n){
            if(nums[right]==0){
                temp++;
            }
            while(temp>k){
            if(nums[left]==0) temp--;
            left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
        }
    }
import java.util.*;
class Solution {
    public int jump(int[] nums) {
    int n=nums.length;
    int i=0,farthest=0,count=0,currEnd=0;
    // while(i<n){
    while(i<n-1){
         farthest=Math.max(farthest,i+nums[i]);
         
        if(i==currEnd){
            count++;
            currEnd=farthest;
        }
        // currEnd=i+nums[i];
       
        i++;
    }
    return count;
    }
}
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
     int n=nums.length;
     int sum=0,ans=0;
    int left=0,right=0;
    while(right<n){
        sum+=nums[right];
       while(sum>goal){
        sum-=nums[left];
        left++;
       }
       if(sum==goal){
        int temp=left;
        while(temp<=right && nums[temp]==0){
            ans++;
            temp++;
        }
        if(goal>0)   ans++;
      
       }
       right++;
    }
     return ans; 
    }
}
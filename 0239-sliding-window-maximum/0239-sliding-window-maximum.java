import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    Deque<Integer> q=new ArrayDeque<>();
    int maxi=Integer.MIN_VALUE;
    int n=nums.length;
    int[] ans=new int[n-k+1];
    int left=0,right=0,i=0;
    while(right<k){
      while(!q.isEmpty() && nums[q.peekLast()]<=nums[right]){
        q.pollLast();
      }
      q.offerLast(right);
      right++;
    }
    ans[i++]=nums[q.peekFirst()];
      
    while(right<n){
    left++;
    if(!q.isEmpty() && q.peekFirst()<left){
        q.pollFirst();
    }
    while(!q.isEmpty() && nums[q.peekLast()]<=nums[right]){
        q.pollLast();
    }
    q.offerLast(right);
    ans[i++]=nums[q.peekFirst()];
    right++;
    }
    return ans;
    }
}
import java.util.*;
class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int n=cardPoints.length;

    // taking n-k concept
    // int left=0,right=0,totalsum=0,min=0,sum=0;
    // while(right<n){
    // totalsum+=cardPoints[right];
    // right++;
    // }   
    // right=0;
    // while(right<n-k){
    //     sum+=cardPoints[right];
    //     right++;    
    // }
    // min=sum;
    // while(right<n){
    // sum+=cardPoints[right];
    // sum-=cardPoints[left];
    // right++;
    // left++;
    // min=Math.min(min,sum);
    // }
    // return totalsum-min;


    // Leftsum rightsum concept
    int leftsum=0,rightsum=0,ans=0;
    for(int i=0;i<k;i++){
        leftsum+=cardPoints[i];
    }
    ans=leftsum;
   int right=n-1;
    for(int i=k-1;i>=0;i--){
        leftsum-=cardPoints[i];
        rightsum+=cardPoints[right];
        right--;
        ans=Math.max(ans,leftsum+rightsum);
    }
    return ans;
    }
    }
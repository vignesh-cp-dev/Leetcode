import java.util.*;
class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int n=cardPoints.length;
    int left=0,right=0,totalsum=0,min=0,sum=0;
    while(right<n){
    totalsum+=cardPoints[right];
    right++;
    }   
    right=0;
    while(right<n-k){
        sum+=cardPoints[right];
        right++;    
    }
    min=sum;
    while(right<n){
    sum+=cardPoints[right];
    sum-=cardPoints[left];
    right++;
    left++;
    min=Math.min(min,sum);
    }
    return totalsum-min;
    }
    }
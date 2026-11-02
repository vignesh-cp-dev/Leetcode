import java.util.*;
class Solution {
    public int minGroups(int[][] intervals) {
    int n=intervals.length;
    // Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
    int[] start=new int[n];
    int[] end=new int[n];
    int group=0,max=0;
    for(int i=0;i<n;i++){
        start[i]=intervals[i][0];
        end[i]=intervals[i][1];
    }
   Arrays.sort(start);
   Arrays.sort(end);
   int i=0,j=0;
   while(i<n && j<n){
    if(start[i]<=end[j]){
        group++;
            i++;
            max=Math.max(max,group);
    }
    else{
    j++;
    group--;
    }

   }
    return max; 
    }
}
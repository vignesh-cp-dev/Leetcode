import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
    int n=intervals.length,count=0,lastindex=intervals[0][1];
    for(int i=1;i<n;i++){
        if(intervals[i][0]<lastindex){
            count++;
        }
        else{
        lastindex=intervals[i][1];
        }
    }
    return count;
    }
}
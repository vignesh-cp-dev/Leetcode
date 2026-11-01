import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {   
    int n=intervals.length;
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
    List<int[]> ans=new ArrayList<>();

// brute force
    // for(int i=0;i<n;i++){
    //     int start=intervals[i][0];
    //     int end=intervals[i][1];
    //     if(!ans.isEmpty() && end<=ans.get(ans.size()-1)[1]) continue;
    //     for(int j=i+1;j<n;j++){
    //         if(intervals[j][0]<=end){
    //             end=Math.max(end,intervals[j][1]);
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     ans.add(new int[]{start,end});

    // }



    //optimal
    for(int i=0;i<n;i++){
        if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1)[1]){
            ans.add(intervals[i]);
        }
        else{
            ans.get(ans.size()-1)[1]=Math.max(intervals[i][1],ans.get(ans.size()-1)[1]);
        }
    }
    return ans.toArray(new int[ans.size()][]);
    }
}

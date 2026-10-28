import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
    // int count=0;
    Arrays.sort(g);
    Arrays.sort(s);
    // Brute force nested loops
    // HashMap<Integer,Integer> map=new HashMap<>();
    // for(int i=0;i<g.length;i++){
    //     for(int j=0;j<s.length;j++){
    //     if(s[j]>=g[i] && !map.containsKey(j)){
    //             count++;
    //             map.put(j,s[j]);
    //             break;
    //         }
    //     }
    // }


    //two pointer
    int i=0,j=0;
    while(i<g.length && j<s.length){
    if(s[j]>=g[i]){
        i++;  
    }
j++;
    }
    return i;
    }
}
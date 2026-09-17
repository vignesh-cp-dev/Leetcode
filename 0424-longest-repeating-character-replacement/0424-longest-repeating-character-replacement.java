import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
    HashMap<Character,Integer> map=new HashMap<>();
    int n=s.length();
    if(n<=1) return n;
    int left=0,right=0,maxlen=0,maxfreq=0;
    map.put(s.charAt(right),1);
    right++;
    while(right<n){
    if(map.containsKey(s.charAt(right))){
    int temp=map.get(s.charAt(right));
    temp++;
    maxfreq=Math.max(temp,maxfreq);
    map.put(s.charAt(right),temp);
    }
    else{
                   map.put(s.charAt(right),1);
                   maxfreq = Math.max(maxfreq, 1);
     
    }
       while((right-left+1)-maxfreq>k){
            int temp=map.get(s.charAt(left));
           temp--;
           if(temp==0){
            map.remove(s.charAt(left));
           }
           else{
           map.put(s.charAt(left),temp);
           }
          left++;
        }
    maxlen=Math.max(right-left+1,maxlen);
    right++;
    }  
    return maxlen;
    }
}
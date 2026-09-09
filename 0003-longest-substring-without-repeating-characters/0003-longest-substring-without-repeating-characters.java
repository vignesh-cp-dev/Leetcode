import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
    int n=s.length();
    if(n<=1) return n;
    HashMap<Character,Integer> map=new HashMap<>();
    int ans=0,num=0,left=0,right=0;
    while(right<n){
        if(!map.containsKey(s.charAt(right))){
            map.put(s.charAt(right),1);
            num++;
            right++;
            ans=Math.max(ans,num);
        }
        else{
        map.remove(s.charAt(left));
        ans=Math.max(ans,num);
        left++;
        num--;
        }
    }
   return ans;
    }
}
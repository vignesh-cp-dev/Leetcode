import java.util.*;
class Solution {
    // public boolean helper(String s,int ind,int count){

    // recursion TLE
    //     if(count<0) return false;
    //     if(ind==s.length()){
    //         return count==0;
    //     }
    //     if(s.charAt(ind)=='('){
    //      return helper(s,ind+1,count+1);
    //     }
    //     else if(s.charAt(ind)==')'){
    //     return helper(s,ind+1,count-1);
    //     } 
    //   return helper(s,ind+1,count+1) || helper(s,ind+1,count-1) || helper(s,ind+1,count);
    // }
    public boolean checkValidString(String s) {
    int n=s.length();
    // return helper(s,0,0);

    // optimal DP ig
    int min=0,max=0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
        min++;
        max++;
        }
        else if(ch==')'){
            min--;
            max--;
        }
        else{
            min--;
            max++;
        }
        if(max<0){
            return false;
        }

        min=Math.max(min,0);
    }
    return min==0;
    
    }

}
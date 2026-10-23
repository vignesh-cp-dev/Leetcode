import java.util.*;
class Solution {
    public String binary(int n){
        StringBuilder res=new StringBuilder();
        while(n>0){
            if(n%2==1) res.append('1');
            else res.append('0');
            n=n/2;
        }
        return res.reverse().toString();
    }
    public int hammingWeight(int n) {
    String ans=binary(n);
    int count=0;
    for(int i=0;i<ans.length();i++){
        if(ans.charAt(i)=='1'){
            count++;
        }
    }
    return count;
    }
}
import java.util.*;
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int k,int n,int i,int sum,int count,List<Integer> list){
    if(count==k){
        if(sum==n){
            ans.add(new ArrayList<>(list));
        }
        return;
    }
    for(int j=i;j<=9;j++){
        list.add(j);
        helper(k,n,j+1,sum+j,count+1,list);
        list.remove(list.size()-1);
    }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(k,n,1,0,0,new ArrayList<>());
        return ans;
    }
}
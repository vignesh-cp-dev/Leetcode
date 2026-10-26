import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
    // Brute force
    HashMap<Integer,Integer> map=new HashMap<>();
    int[] ans=new int[2];
    int index=0,n=nums.length;
    for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    for(int key:map.keySet()){
        if(map.get(key)==1){
            ans[index]=key;
            index++;
        }
    }
    return ans;
    }
}
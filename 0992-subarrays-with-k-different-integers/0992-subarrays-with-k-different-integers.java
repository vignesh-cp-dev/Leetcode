import java.util.*;
class Solution {
    public int helper(int[] nums,int k){
        if(k==0) return k;
   int n=nums.length;
   int ans=0,left=0,right=0;
   HashMap<Integer,Integer> map=new HashMap<>();
   while(right<n){
    map.put(nums[right],map.getOrDefault(nums[right],0)+1);
    while(map.size()>k){
        map.put(nums[left],map.get(nums[left])-1);
        if(map.get(nums[left])==0){
            map.remove(nums[left]);
        }
        left++;
    }
    ans+=right-left+1;
    right++;
   }

    return ans;
   }
    
    public int subarraysWithKDistinct(int[] nums, int k) {
   int a=helper(nums,k);
   int b=helper(nums,k-1);
   return a-b;
    // bruteforcce
//     int ans=0;
// for(int i=0;i<n;i++){
//     HashMap<Integer,Integer> map=new HashMap<>();
//     for(int j=i;j<n;j++){
//         map.put(nums[j],map.getOrDefault(nums[j],0)+1);
//         if(map.size()==k){
//             ans++;
//         }
//         if(map.size()>k) break;
//     }
// }
    // return ans;
    }
}
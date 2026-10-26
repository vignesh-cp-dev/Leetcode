import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        int n=nums.length;
    // Brute force - Hashing
    // HashMap<Integer,Integer> map=new HashMap<>();
    // int index=0,n=nums.length;
    // for(int i=0;i<n;i++){
    //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    // }
    // for(int key:map.keySet()){
    //     if(map.get(key)==1){
    //         ans[index]=key;
    //         index++;
    //     }
    // }
    // return ans;

    //Better
//     Arrays.sort(nums);  
//     int i=0,index=0;
//     while(i<n-1){
//         if(nums[i]!=nums[i+1]){
//             ans[index++]=nums[i];
//             i++;
//         }
//         else i+=2;
//         if(index==2) break;
        
//     }
//   if(index<2){
//     ans[index]=nums[n-1];
//   }    
//     return ans;


// BIT Manipulation Bucket
int xorr=0;
for(int i=0;i<n;i++){
    xorr^=nums[i];
}
int rightmost=(xorr&(xorr-1))^xorr;
int b1=0,b2=0;
for(int i=0;i<n;i++){
    if((nums[i]&rightmost)!=0){
            b1^=nums[i];
    }
    else{
        b2^=nums[i];
    }
}
return new int[]{b1,b2};

    }
}
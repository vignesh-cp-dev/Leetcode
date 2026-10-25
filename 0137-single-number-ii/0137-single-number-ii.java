import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
// BRUTE FORCE
//     HashMap<Integer,Integer> map=new HashMap<>();
//     for(int i=0;i<nums.length;i++){
//         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//     }
//    for(int key: map.keySet()){
//     if(map.get(key)==1){
//         return key;
//     }}
//     return 0;

// sorting approach mine
// int ans=0,n=nums.length;
// if(n==1) return nums[0];
// Arrays.sort(nums);
// int i=0,j=1;
// while(j<n){
//     int temp=nums[i],c=1;
//     while(j<n && nums[i]==nums[j]){
//         c++;
//         j++;
//     }
//     if(c<3) return nums[i];
//     i=j;
// }
// return 0;

// sorting better appraoch
// Arrays.sort(nums);
// int n=nums.length;
// for(int i=1;i<n;i=i+3){
//    if(nums[i]!=nums[i-1]){
//     return nums[i-1];
//    }
// }
// return nums[n-1];



//BITWISE operation
// int ans=0,n=nums.length;
// for(int bit=0;bit<32;bit++){
//     int count=0;
//     for(int i=0;i<n;i++){
//         if((nums[i]&(1<<bit))!=0){
//             count++;
//         }
        
//     }
//     if(count%3==1){
//         ans|=(1<<bit);
//     }
// }
// return ans;


//BUCKET APPRAOCH
int ones=0,twos=0;
for(int i=0;i<nums.length;i++){
    ones=(ones^nums[i])& ~twos;
    twos=(twos^nums[i]) & ~ones;
}
return ones;
    }
}
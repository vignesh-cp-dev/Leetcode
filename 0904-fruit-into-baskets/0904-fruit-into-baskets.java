import java.util.*;
class Solution {
    public int totalFruit(int[] fruits){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=fruits.length,ans=0,diff=0;
        int left=0,right=0;
        while(right<n){
            if(map.containsKey(fruits[right])){
            int k=map.get(fruits[right]);
            k++;
            map.put(fruits[right],k);
            // right++;
            }
            else{
            map.put(fruits[right],1);
            diff++;
            }
                      while(diff>2){

                int k=map.get(fruits[left]);
                k--;

                if(k==0){
                    map.remove(fruits[left]);
                    diff--;
                }
                else{
                    map.put(fruits[left],k);
                }

                left++;
            }

            ans=Math.max(ans,right-left+1);
            right++;


        }
        return ans;
    }
}
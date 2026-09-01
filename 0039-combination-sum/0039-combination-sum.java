class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int[] candidates, int target,int i,List<Integer> list){
    //    if(i==candidates.length || sum>target) return;
    //     if(sum==target){
    //         ans.add(new ArrayList<>(list));
    //         return;
    //     }
     
    //     list.add(candidates[i]);
    //     helper(candidates,target,sum+candidates[i],i,list);
    //         // sum-=candidates[i];
    //          list.remove(list.get(list.size()-1));
             
    //         helper(candidates,target,i+1,list);
        

        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[i]<=target){
            list.add(candidates[i]);
            helper(candidates,target-candidates[i],i,list);
            list.remove(list.size()-1);
        }
        helper(candidates,target,i+1,list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       helper(candidates,target,0,new ArrayList<>());
       return ans;
    }
}
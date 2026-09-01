class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int[] candidates, int target,int sum,int i,List<Integer> list){
        // if(i==candidates.length) return;
    // sum+=candidates[i];
       if(i==candidates.length || sum>target) return;
        if(sum==target){
            // list.add(candidates[i]);
            ans.add(new ArrayList<>(list));
            // list.remove(list.size()-1);
            return;
        }
     
        list.add(candidates[i]);
        helper(candidates,target,sum+candidates[i],i,list);
            // sum-=candidates[i];
             list.remove(list.get(list.size()-1));
             
            helper(candidates,target,sum,i+1,list);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       helper(candidates,target,0,0,new ArrayList<>());
       return ans;
    }
}
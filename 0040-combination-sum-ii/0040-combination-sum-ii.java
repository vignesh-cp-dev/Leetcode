class Solution {
List<List<Integer>> ans=new ArrayList<>();
    public void helper(int[] candidates, int target,int i,List<Integer> list){
if(target==0){
    ans.add(new ArrayList<>(list));
    return;
}
for(int j=i;j<candidates.length;j++){
    if(j>i && candidates[j]==candidates[j-1]) continue;
    if(candidates[j]>target) break;
    list.add(candidates[j]);
    helper(candidates,target-candidates[j],j+1,list);
    list.remove(list.size()-1);
}
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       helper(candidates,target,0,new ArrayList<>());
       return ans;
    }
}

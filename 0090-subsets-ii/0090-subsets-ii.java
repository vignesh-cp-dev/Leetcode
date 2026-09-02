class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int[] nums,int ind,List<Integer> list,int start){
// if(ind==nums.length){
    ans.add(new ArrayList<>(list));

for(int i=start;i<nums.length;i++){
    if(i>start && nums[i]==nums[i-1]) continue;
    list.add(nums[i]);
    helper(nums,i+1,list,i+1);
    list.remove(list.size()-1);
}
return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<>(),0);
        return ans;
    }
}
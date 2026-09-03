import java.util.*;
class Solution {
    HashMap<Character,String> map=new HashMap<>();
    List<String> ans=new ArrayList<>();
    public void helper(String digits,int i,String s){
    if(i==digits.length()){
        ans.add(s);
        return;
    }
    String temp=map.get(digits.charAt(i));
    for(int j=0;j<temp.length();j++){
        helper(digits,i+1,s+temp.charAt(j));
    }
    }
    public List<String> letterCombinations(String digits) {
    map.put('2',"abc");
    map.put('3',"def");
    map.put('4',"ghi");
    map.put('5',"jkl");
    map.put('6',"mno");
    map.put('7',"pqrs");
    map.put('8',"tuv");
    map.put('9',"wxyz");
    helper(digits,0,"");
    return ans;
    }
}
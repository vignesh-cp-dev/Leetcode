class Solution {
    public boolean isValid(String s) {
    int n=s.length();
    Stack<Character> st=new Stack<>();
    for(int i=0;i<n;i++){
    char c=s.charAt(i);
    switch(c){
        case '(': st.push(c);
        break;
        case '{': st.push(c);
        break;
        case '[': st.push(c);
        break;
        case ')': 
        if(st.size()!=0 && st.peek()=='('){
        st.pop();
        break;
        }
        else return false;
        case '}': 
        if(st.size()!=0 && st.peek()=='{'){ 
        st.pop();
        break;
        }
        else return false;
        case ']': 
        if(st.size()!=0 && st.peek()=='[')
        {
         st.pop();
        break;
        }
        else return false;
        
    }
    }
    return st.isEmpty();
    }
}
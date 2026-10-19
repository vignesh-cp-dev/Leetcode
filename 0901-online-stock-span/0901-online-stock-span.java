import java.util.*;
class StockSpanner {
//  ArrayList<Integer> list=new ArrayList<>();
Stack<int[]> st=new Stack<>();
int ind;

    public StockSpanner() {
        ind=-1;
    }
    
    public int next(int price) {
        // brute forcce using arraylist
    // int total=0;
    // if(list.isEmpty()){
    //     list.add(price);
    //     return 1;
    // }
    // int span=1;
    // for(int i=list.size()-1;i>=0;i--){
    //     if(list.get(i)<=price){
    //         span++;
    //     }
    //     else{
    //         break;
    //     }
    // }
    // list.add(price);
    // return span;

    //Optimal
    ind++;
    while(!st.isEmpty() && st.peek()[0]<=price){
        st.pop();
    }
    int ans=ind-(st.isEmpty()?-1:st.peek()[1]);
    st.push(new int[]{price,ind});
    return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
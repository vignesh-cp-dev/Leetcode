import java.util.*;
class StockSpanner {
 ArrayList<Integer> list=new ArrayList<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
    int total=0;
    if(list.isEmpty()){
        list.add(price);
        return 1;
    }
    int span=1;
    for(int i=list.size()-1;i>=0;i--){
        if(list.get(i)<=price){
            span++;
        }
        else{
            break;
        }
    }
    list.add(price);
    return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
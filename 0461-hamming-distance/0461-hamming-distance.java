import java.util.*;
class Solution {
    public int hammingDistance(int x, int y) {
    //  return Integer.bitCount(x^y);   
    int n=x^y,c=0;
    while(n!=0){
    c++;
    n=n&(n-1);
    }
    return c;
    }
}
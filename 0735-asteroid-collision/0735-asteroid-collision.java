import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
//     int n=asteroids.length;
//     Stack<Integer> st=new Stack<>();
//     for(int i=0;i<n;i++){
//         boolean alive=true;
//         if(asteroids[i]<0){
//             while(!st.empty() && st.peek()>0){
//                 if(Math.abs(asteroids[i])>st.peek()){
//                 st.pop();
//                 }
//                 else if(Math.abs(asteroids[i])==st.peek()){
//                     st.pop();
//                     alive=false;
//                     break;
//                 }
//                 else{
//                     alive=false;
//                     break;
//                 }
               
//             }
//              if(alive){
//                 st.push(asteroids[i]);
                
//                 }
//         }
//         else{
//             st.push(asteroids[i]);
//         }
//     }
//    ArrayList<Integer> list=new ArrayList<>();
// while(!st.empty()){
//     list.add(st.pop());
//    }
//    Collections.reverse(list);
//    int[] result=new int[list.size()];
//    for(int i=0;i<list.size();i++){
//     result[i]=list.get(i);
//    }
//    return result;


ArrayList<Integer> list = new ArrayList<>();

        for (int x : asteroids) {
            list.add(x);
        }

        boolean collision = true;

        while (collision) {
            collision = false;

            for (int i = 0; i < list.size() - 1; i++) {

                int left = list.get(i);
                int right = list.get(i + 1);

                // Collision is possible only: + then -
                if (left > 0 && right < 0) {

                    collision = true;

                    if (Math.abs(left) > Math.abs(right)) {
                        // right asteroid explodes
                        list.remove(i + 1);
                    }
                    else if (Math.abs(left) < Math.abs(right)) {
                        // left asteroid explodes
                        list.remove(i);
                    }
                    else {
                        // both explode
                        list.remove(i + 1);
                        list.remove(i);
                    }

                    break; // restart scanning from beginning
                }
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
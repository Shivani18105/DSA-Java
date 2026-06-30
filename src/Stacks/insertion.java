package Stacks;

import java.util.Stack;

public class insertion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        //insertion at any index
        Stack<Integer> gt = new Stack<>();
        // at index 1
        while(st.size()>1){
            gt.push(st.pop());
        }
        st.push(10);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
